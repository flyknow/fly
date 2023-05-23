package cn.iocoder.fly.framework.common.util.object;

import cn.iocoder.fly.framework.common.pojo.PageParam;

/**
 * {@link cn.iocoder.fly.framework.common.pojo.PageParam} 工具类
 *
 * @author fly
 */
public class PageUtils {

    public static int getStart(PageParam pageParam) {
        return (pageParam.getPageNo() - 1) * pageParam.getPageSize();
    }

}
