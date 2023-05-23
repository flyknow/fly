package cn.iocoder.fly.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目的启动类
 * <p>
 * 如果你碰到启动的问题，请认真阅读 / 文章
 * 如果你碰到启动的问题，请认真阅读 / 文章
 * 如果你碰到启动的问题，请认真阅读 / 文章
 *
 * @author fly
 */
@SuppressWarnings("SpringComponentScan") // 忽略 IDEA 无法识别 ${fly.info.base-package}
@SpringBootApplication(scanBasePackages = {"${fly.info.base-package}.server", "${fly.info.base-package}.module"})
public class FlyServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(FlyServerApplication.class, args);
//        new SpringApplicationBuilder(FlyServerApplication.class)
//                .applicationStartup(new BufferingApplicationStartup(20480))
//                .run(args);

    }

}
