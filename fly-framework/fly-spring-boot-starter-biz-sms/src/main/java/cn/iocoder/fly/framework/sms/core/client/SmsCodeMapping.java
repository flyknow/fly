package cn.iocoder.fly.framework.sms.core.client;

import cn.iocoder.fly.framework.common.exception.ErrorCode;
import cn.iocoder.fly.framework.sms.core.enums.SmsFrameworkErrorCodeConstants;

import java.util.function.Function;

/**
 * 将 API 的错误码，转换为通用的错误码
 *
 * @see SmsCommonResult
 * @see SmsFrameworkErrorCodeConstants
 *
 * @author fly
 */
public interface SmsCodeMapping extends Function<String, ErrorCode> {
}
