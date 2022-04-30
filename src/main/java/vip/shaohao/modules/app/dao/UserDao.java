package vip.shaohao.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.shaohao.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author Shaohao 2623537618@qq.com
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
