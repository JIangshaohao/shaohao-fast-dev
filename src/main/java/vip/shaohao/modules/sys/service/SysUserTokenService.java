package vip.shaohao.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import vip.shaohao.common.utils.R;
import vip.shaohao.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author Shaohao 2623537618@qq.com
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
