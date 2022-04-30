package vip.shaohao.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import vip.shaohao.common.utils.PageUtils;
import vip.shaohao.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Shaohao 2623537618@qq.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
