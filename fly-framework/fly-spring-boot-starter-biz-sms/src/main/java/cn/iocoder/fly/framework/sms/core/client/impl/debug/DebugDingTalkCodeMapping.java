package cn.iocoder.fly.framework.sms.core.client.impl.debug;

import cn.iocoder.fly.framework.common.exception.ErrorCode;
import cn.iocoder.fly.framework.common.exception.enums.GlobalErrorCodeConstants;
import cn.iocoder.fly.framework.sms.core.client.SmsCodeMapping;
import cn.iocoder.fly.framework.sms.core.enums.SmsFrameworkErrorCodeConstants;

import java.util.Objects;

/**
 * 钉钉的 SmsCodeMapping 实现类
 *
 * @author fly
 */
public class DebugDingTalkCodeMapping implements SmsCodeMapping {

    @Override
    public ErrorCode apply(String apiCode) {
        return Objects.equals(apiCode, "0") ? GlobalErrorCodeConstants.SUCCESS : SmsFrameworkErrorCodeConstants.SMS_UNKNOWN;
    }

}
