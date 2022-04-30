package vip.shaohao.modules.sys.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author Shaohao 2623537618@qq.com
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;


}
