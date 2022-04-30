package vip.shaohao.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import vip.shaohao.common.utils.PageUtils;
import vip.shaohao.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Shaohao 2623537618@qq.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);

}
