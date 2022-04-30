package vip.shaohao.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.shaohao.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Shaohao 2623537618@qq.com
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {

}
