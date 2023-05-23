package cn.iocoder.fly.module.system.mq.consumer.mail;

import cn.iocoder.fly.framework.mq.core.stream.AbstractStreamMessageListener;
import cn.iocoder.fly.module.system.mq.message.mail.MailSendMessage;
import cn.iocoder.fly.module.system.service.mail.MailSendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 针对 {@link MailSendMessage} 的消费者
 *
 * @author fly
 */
@Component
@Slf4j
public class MailSendConsumer extends AbstractStreamMessageListener<MailSendMessage> {

    @Resource
    private MailSendService mailSendService;

    @Override
    public void onMessage(MailSendMessage message) {
        log.info("[onMessage][消息内容({})]", message);
        mailSendService.doSendMail(message);
    }

}
