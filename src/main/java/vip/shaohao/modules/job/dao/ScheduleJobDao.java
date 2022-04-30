package vip.shaohao.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.shaohao.modules.job.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Shaohao 2623537618@qq.com
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {

	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
