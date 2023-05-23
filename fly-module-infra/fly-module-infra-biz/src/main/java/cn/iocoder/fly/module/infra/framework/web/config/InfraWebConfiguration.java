package cn.iocoder.fly.module.infra.framework.web.config;

import cn.iocoder.fly.framework.swagger.config.FlySwaggerAutoConfiguration;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * infra 模块的 web 组件的 Configuration
 *
 * @author fly
 */
@Configuration(proxyBeanMethods = false)
public class InfraWebConfiguration {

    /**
     * infra 模块的 API 分组
     */
    @Bean
    public GroupedOpenApi infraGroupedOpenApi() {
        return FlySwaggerAutoConfiguration.buildGroupedOpenApi("infra");
    }

}
