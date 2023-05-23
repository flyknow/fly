package cn.iocoder.fly.module.infra.dal.mysql.codegen;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.fly.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.fly.module.infra.dal.dataobject.codegen.CodegenTableDO;
import cn.iocoder.fly.module.infra.controller.admin.codegen.vo.table.CodegenTablePageReqVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodegenTableMapper extends BaseMapperX<CodegenTableDO> {

    default CodegenTableDO selectByTableNameAndDataSourceConfigId(String tableName, Long dataSourceConfigId) {
        return selectOne(CodegenTableDO::getTableName, tableName,
                CodegenTableDO::getDataSourceConfigId, dataSourceConfigId);
    }

    default PageResult<CodegenTableDO> selectPage(CodegenTablePageReqVO pageReqVO) {
        return selectPage(pageReqVO, new LambdaQueryWrapperX<CodegenTableDO>()
                .likeIfPresent(CodegenTableDO::getTableName, pageReqVO.getTableName())
                .likeIfPresent(CodegenTableDO::getTableComment, pageReqVO.getTableComment())
                .likeIfPresent(CodegenTableDO::getClassName, pageReqVO.getClassName())
                .betweenIfPresent(CodegenTableDO::getCreateTime, pageReqVO.getCreateTime()));
    }

    default List<CodegenTableDO> selectListByDataSourceConfigId(Long dataSourceConfigId) {
        return selectList(CodegenTableDO::getDataSourceConfigId, dataSourceConfigId);
    }

}
