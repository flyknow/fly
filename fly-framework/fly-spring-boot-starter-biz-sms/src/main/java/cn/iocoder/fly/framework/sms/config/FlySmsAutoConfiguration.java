package cn.iocoder.fly.framework.sms.config;

import cn.iocoder.fly.framework.sms.core.client.SmsClientFactory;
import cn.iocoder.fly.framework.sms.core.client.impl.SmsClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 短信配置类
 *
 * @author fly
 */
@AutoConfiguration
public class FlySmsAutoConfiguration {

    @Bean
    public SmsClientFactory smsClientFactory() {
        return new SmsClientFactoryImpl();
    }

}
