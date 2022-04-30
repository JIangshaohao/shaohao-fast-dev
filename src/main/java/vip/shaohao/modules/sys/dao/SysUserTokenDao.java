package vip.shaohao.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.shaohao.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author Shaohao 2623537618@qq.com
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);

}
