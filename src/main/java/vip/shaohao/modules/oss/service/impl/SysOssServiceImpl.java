package vip.shaohao.modules.oss.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import vip.shaohao.common.utils.PageUtils;
import vip.shaohao.common.utils.Query;
import vip.shaohao.modules.oss.dao.SysOssDao;
import vip.shaohao.modules.oss.entity.SysOssEntity;
import vip.shaohao.modules.oss.service.SysOssService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<SysOssEntity> page = this.page(
			new Query<SysOssEntity>().getPage(params)
		);

		return new PageUtils(page);
	}

}
