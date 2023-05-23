package cn.iocoder.fly.module.system.mq.message.permission;

import cn.iocoder.fly.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色与菜单数据刷新 Message
 *
 * @author fly
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleMenuRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "system.role-menu.refresh";
    }

}
