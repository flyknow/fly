package cn.iocoder.fly.framework.apilog.config;

import cn.iocoder.fly.framework.apilog.core.filter.ApiAccessLogFilter;
import cn.iocoder.fly.framework.apilog.core.service.ApiAccessLogFrameworkService;
import cn.iocoder.fly.framework.apilog.core.service.ApiAccessLogFrameworkServiceImpl;
import cn.iocoder.fly.framework.apilog.core.service.ApiErrorLogFrameworkService;
import cn.iocoder.fly.framework.apilog.core.service.ApiErrorLogFrameworkServiceImpl;
import cn.iocoder.fly.framework.common.enums.WebFilterOrderEnum;
import cn.iocoder.fly.framework.web.config.WebProperties;
import cn.iocoder.fly.framework.web.config.FlyWebAutoConfiguration;
import cn.iocoder.fly.module.infra.api.logger.ApiAccessLogApi;
import cn.iocoder.fly.module.infra.api.logger.ApiErrorLogApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@AutoConfiguration(after = FlyWebAutoConfiguration.class)
public class FlyApiLogAutoConfiguration {

    @Bean
    public ApiAccessLogFrameworkService apiAccessLogFrameworkService(ApiAccessLogApi apiAccessLogApi) {
        return new ApiAccessLogFrameworkServiceImpl(apiAccessLogApi);
    }

    @Bean
    public ApiErrorLogFrameworkService apiErrorLogFrameworkService(ApiErrorLogApi apiErrorLogApi) {
        return new ApiErrorLogFrameworkServiceImpl(apiErrorLogApi);
    }

    /**
     * 创建 ApiAccessLogFilter Bean，记录 API 请求日志
     */
    @Bean
    @ConditionalOnProperty(prefix = "fly.access-log", value = "enable", matchIfMissing = true) // 允许使用 fly.access-log.enable=false 禁用访问日志
    public FilterRegistrationBean<ApiAccessLogFilter> apiAccessLogFilter(WebProperties webProperties,
                                                                         @Value("${spring.application.name}") String applicationName,
                                                                         ApiAccessLogFrameworkService apiAccessLogFrameworkService) {
        ApiAccessLogFilter filter = new ApiAccessLogFilter(webProperties, applicationName, apiAccessLogFrameworkService);
        return createFilterBean(filter, WebFilterOrderEnum.API_ACCESS_LOG_FILTER);
    }

    private static <T extends Filter> FilterRegistrationBean<T> createFilterBean(T filter, Integer order) {
        FilterRegistrationBean<T> bean = new FilterRegistrationBean<>(filter);
        bean.setOrder(order);
        return bean;
    }

}
