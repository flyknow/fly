package cn.iocoder.fly.framework.file.config;

import cn.iocoder.fly.framework.file.core.client.FileClientFactory;
import cn.iocoder.fly.framework.file.core.client.FileClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 文件配置类
 *
 * @author fly
 */
@AutoConfiguration
public class FlyFileAutoConfiguration {

    @Bean
    public FileClientFactory fileClientFactory() {
        return new FileClientFactoryImpl();
    }

}
