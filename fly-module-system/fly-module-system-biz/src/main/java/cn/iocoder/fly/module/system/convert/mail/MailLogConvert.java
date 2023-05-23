package cn.iocoder.fly.module.system.convert.mail;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.module.system.controller.admin.mail.vo.log.MailLogRespVO;
import cn.iocoder.fly.module.system.dal.dataobject.mail.MailLogDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MailLogConvert {

    MailLogConvert INSTANCE = Mappers.getMapper(MailLogConvert.class);

    PageResult<MailLogRespVO> convertPage(PageResult<MailLogDO> pageResult);

    MailLogRespVO convert(MailLogDO bean);

}
