package cn.iocoder.fly.module.infra.dal.mysql.config;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.fly.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.fly.module.infra.dal.dataobject.config.ConfigDO;
import cn.iocoder.fly.module.infra.controller.admin.config.vo.ConfigExportReqVO;
import cn.iocoder.fly.module.infra.controller.admin.config.vo.ConfigPageReqVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConfigMapper extends BaseMapperX<ConfigDO> {

    default ConfigDO selectByKey(String key) {
        return selectOne(ConfigDO::getConfigKey, key);
    }

    default PageResult<ConfigDO> selectPage(ConfigPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ConfigDO>()
                .likeIfPresent(ConfigDO::getName, reqVO.getName())
                .likeIfPresent(ConfigDO::getConfigKey, reqVO.getKey())
                .eqIfPresent(ConfigDO::getType, reqVO.getType())
                .betweenIfPresent(ConfigDO::getCreateTime, reqVO.getCreateTime()));
    }

    default List<ConfigDO> selectList(ConfigExportReqVO reqVO) {
        return selectList(new LambdaQueryWrapperX<ConfigDO>()
                .likeIfPresent(ConfigDO::getName, reqVO.getName())
                .likeIfPresent(ConfigDO::getConfigKey, reqVO.getKey())
                .eqIfPresent(ConfigDO::getType, reqVO.getType())
                .betweenIfPresent(ConfigDO::getCreateTime, reqVO.getCreateTime()));
    }

}
