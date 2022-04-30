package vip.shaohao.common.utils;

/**
 * Redis所有Keys
 *
 * @author Shaohao 2623537618@qq.com
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
