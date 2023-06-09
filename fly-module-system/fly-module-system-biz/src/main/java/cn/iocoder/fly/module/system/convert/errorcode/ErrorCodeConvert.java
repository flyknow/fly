package cn.iocoder.fly.module.system.convert.errorcode;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.module.system.api.errorcode.dto.ErrorCodeAutoGenerateReqDTO;
import cn.iocoder.fly.module.system.api.errorcode.dto.ErrorCodeRespDTO;
import cn.iocoder.fly.module.system.controller.admin.errorcode.vo.ErrorCodeCreateReqVO;
import cn.iocoder.fly.module.system.controller.admin.errorcode.vo.ErrorCodeExcelVO;
import cn.iocoder.fly.module.system.controller.admin.errorcode.vo.ErrorCodeRespVO;
import cn.iocoder.fly.module.system.controller.admin.errorcode.vo.ErrorCodeUpdateReqVO;
import cn.iocoder.fly.module.system.dal.dataobject.errorcode.ErrorCodeDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 错误码 Convert
 *
 * @author fly
 */
@Mapper
public interface ErrorCodeConvert {

    ErrorCodeConvert INSTANCE = Mappers.getMapper(ErrorCodeConvert.class);

    ErrorCodeDO convert(ErrorCodeCreateReqVO bean);

    ErrorCodeDO convert(ErrorCodeUpdateReqVO bean);

    ErrorCodeRespVO convert(ErrorCodeDO bean);

    List<ErrorCodeRespVO> convertList(List<ErrorCodeDO> list);

    PageResult<ErrorCodeRespVO> convertPage(PageResult<ErrorCodeDO> page);

    List<ErrorCodeExcelVO> convertList02(List<ErrorCodeDO> list);

    ErrorCodeDO convert(ErrorCodeAutoGenerateReqDTO bean);

    List<ErrorCodeRespDTO> convertList03(List<ErrorCodeDO> list);

}
