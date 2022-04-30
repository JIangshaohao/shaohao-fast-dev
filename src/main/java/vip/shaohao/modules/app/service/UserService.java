package vip.shaohao.modules.app.service;


import com.baomidou.mybatisplus.extension.service.IService;
import vip.shaohao.modules.app.entity.UserEntity;
import vip.shaohao.modules.app.form.LoginForm;

/**
 * 用户
 *
 * @author Shaohao 2623537618@qq.com
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
