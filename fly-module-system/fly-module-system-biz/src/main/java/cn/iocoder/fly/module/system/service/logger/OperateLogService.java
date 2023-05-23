package cn.iocoder.fly.module.system.service.logger;

import cn.iocoder.fly.framework.common.pojo.PageResult;
import cn.iocoder.fly.module.system.api.logger.dto.OperateLogCreateReqDTO;
import cn.iocoder.fly.module.system.controller.admin.logger.vo.operatelog.OperateLogExportReqVO;
import cn.iocoder.fly.module.system.controller.admin.logger.vo.operatelog.OperateLogPageReqVO;
import cn.iocoder.fly.module.system.dal.dataobject.logger.OperateLogDO;

import java.util.List;

/**
 * 操作日志 Service 接口
 *
 * @author fly
 */
public interface OperateLogService {

    /**
     * 记录操作日志
     *
     * @param createReqDTO 操作日志请求
     */
    void createOperateLog(OperateLogCreateReqDTO createReqDTO);

    /**
     * 获得操作日志分页列表
     *
     * @param reqVO 分页条件
     * @return 操作日志分页列表
     */
    PageResult<OperateLogDO> getOperateLogPage(OperateLogPageReqVO reqVO);

    /**
     * 获得操作日志列表
     *
     * @param reqVO 列表条件
     * @return 日志列表
     */
    List<OperateLogDO> getOperateLogList(OperateLogExportReqVO reqVO);

}
