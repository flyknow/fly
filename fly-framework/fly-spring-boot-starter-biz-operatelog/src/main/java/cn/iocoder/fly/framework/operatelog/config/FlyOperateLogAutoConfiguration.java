package cn.iocoder.fly.framework.operatelog.config;

import cn.iocoder.fly.framework.operatelog.core.aop.OperateLogAspect;
import cn.iocoder.fly.framework.operatelog.core.service.OperateLogFrameworkService;
import cn.iocoder.fly.framework.operatelog.core.service.OperateLogFrameworkServiceImpl;
import cn.iocoder.fly.module.system.api.logger.OperateLogApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class FlyOperateLogAutoConfiguration {

    @Bean
    public OperateLogAspect operateLogAspect() {
        return new OperateLogAspect();
    }

    @Bean
    public OperateLogFrameworkService operateLogFrameworkService(OperateLogApi operateLogApi) {
        return new OperateLogFrameworkServiceImpl(operateLogApi);
    }

}
