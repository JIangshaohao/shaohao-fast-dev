package vip.shaohao.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import vip.shaohao.common.utils.PageUtils;
import vip.shaohao.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Shaohao 2623537618@qq.com
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
