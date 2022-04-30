package vip.shaohao.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.shaohao.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理
 *
 * @author Shaohao 2623537618@qq.com
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
