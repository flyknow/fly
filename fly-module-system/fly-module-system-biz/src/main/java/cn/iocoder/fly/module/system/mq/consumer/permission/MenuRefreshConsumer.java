package cn.iocoder.fly.module.system.mq.consumer.permission;

import cn.iocoder.fly.framework.mq.core.pubsub.AbstractChannelMessageListener;
import cn.iocoder.fly.module.system.mq.message.permission.MenuRefreshMessage;
import cn.iocoder.fly.module.system.service.permission.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 针对 {@link MenuRefreshMessage} 的消费者
 *
 * @author fly
 */
@Component
@Slf4j
public class MenuRefreshConsumer extends AbstractChannelMessageListener<MenuRefreshMessage> {

    @Resource
    private MenuService menuService;

    @Override
    public void onMessage(MenuRefreshMessage message) {
        log.info("[onMessage][收到 Menu 刷新消息]");
        menuService.initLocalCache();
    }

}
