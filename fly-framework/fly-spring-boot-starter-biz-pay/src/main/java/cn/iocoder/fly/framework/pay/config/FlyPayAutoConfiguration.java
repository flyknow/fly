package cn.iocoder.fly.framework.pay.config;

import cn.iocoder.fly.framework.pay.core.client.PayClientFactory;
import cn.iocoder.fly.framework.pay.core.client.impl.PayClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * 支付配置类
 *
 * @author fly
 */
@AutoConfiguration
@EnableConfigurationProperties(PayProperties.class)
public class FlyPayAutoConfiguration {

    @Bean
    public PayClientFactory payClientFactory() {
        return new PayClientFactoryImpl();
    }

}
