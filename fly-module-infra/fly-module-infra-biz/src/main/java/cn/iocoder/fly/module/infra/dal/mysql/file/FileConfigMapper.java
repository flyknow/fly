package cn.iocoder.fly.module.infra.dal.mysql.file;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.fly.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.fly.module.infra.dal.dataobject.file.FileConfigDO;
import cn.iocoder.fly.module.infra.controller.admin.file.vo.config.FileConfigPageReqVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileConfigMapper extends BaseMapperX<FileConfigDO> {

    default PageResult<FileConfigDO> selectPage(FileConfigPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<FileConfigDO>()
                .likeIfPresent(FileConfigDO::getName, reqVO.getName())
                .eqIfPresent(FileConfigDO::getStorage, reqVO.getStorage())
                .betweenIfPresent(FileConfigDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(FileConfigDO::getId));
    }

}
