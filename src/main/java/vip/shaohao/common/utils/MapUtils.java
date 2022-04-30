package vip.shaohao.common.utils;

import java.util.HashMap;


/**
 * Map工具类
 *
 * @author Shaohao 2623537618@qq.com
 */
public class MapUtils extends HashMap<String, Object> {

    @Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
