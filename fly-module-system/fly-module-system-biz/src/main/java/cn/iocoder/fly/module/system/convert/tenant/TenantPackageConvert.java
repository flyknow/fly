package cn.iocoder.fly.module.system.convert.tenant;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.module.system.controller.admin.tenant.vo.packages.TenantPackageCreateReqVO;
import cn.iocoder.fly.module.system.controller.admin.tenant.vo.packages.TenantPackageRespVO;
import cn.iocoder.fly.module.system.controller.admin.tenant.vo.packages.TenantPackageSimpleRespVO;
import cn.iocoder.fly.module.system.controller.admin.tenant.vo.packages.TenantPackageUpdateReqVO;
import cn.iocoder.fly.module.system.dal.dataobject.tenant.TenantPackageDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 租户套餐 Convert
 *
 * @author fly
 */
@Mapper
public interface TenantPackageConvert {

    TenantPackageConvert INSTANCE = Mappers.getMapper(TenantPackageConvert.class);

    TenantPackageDO convert(TenantPackageCreateReqVO bean);

    TenantPackageDO convert(TenantPackageUpdateReqVO bean);

    TenantPackageRespVO convert(TenantPackageDO bean);

    List<TenantPackageRespVO> convertList(List<TenantPackageDO> list);

    PageResult<TenantPackageRespVO> convertPage(PageResult<TenantPackageDO> page);

    List<TenantPackageSimpleRespVO> convertList02(List<TenantPackageDO> list);

}
