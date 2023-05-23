package cn.iocoder.fly.module.system.mq.message.dept;

import cn.iocoder.fly.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 部门数据刷新 Message
 *
 * @author fly
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DeptRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "system.dept.refresh";
    }

}
