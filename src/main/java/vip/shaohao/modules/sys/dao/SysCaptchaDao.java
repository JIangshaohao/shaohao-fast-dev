package vip.shaohao.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.shaohao.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Shaohao 2623537618@qq.com
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
