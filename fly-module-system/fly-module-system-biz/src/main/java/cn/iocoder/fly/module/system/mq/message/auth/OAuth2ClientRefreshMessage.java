package cn.iocoder.fly.module.system.mq.message.auth;

import cn.iocoder.fly.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OAuth 2.0 客户端的数据刷新 Message
 *
 * @author fly
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OAuth2ClientRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "system.oauth2-client.refresh";
    }

}
