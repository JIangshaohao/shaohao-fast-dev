package vip.shaohao.modules.sys.form;

import lombok.Data;

/**
 * 密码表单
 *
 * @author Shaohao 2623537618@qq.com
 */
@Data
public class PasswordForm {
    /**
     * 原密码
     */
    private String password;
    /**
     * 新密码
     */
    private String newPassword;

}
