package cn.iocoder.fly.module.system.convert.ip;

import cn.iocoder.fly.framework.ip.core.Area;
import cn.iocoder.fly.module.system.controller.admin.ip.vo.AreaNodeRespVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AreaConvert {

    AreaConvert INSTANCE = Mappers.getMapper(AreaConvert.class);

    List<AreaNodeRespVO> convertList(List<Area> list);

}
