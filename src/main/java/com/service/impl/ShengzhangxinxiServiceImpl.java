package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShengzhangxinxiDao;
import com.entity.ShengzhangxinxiEntity;
import com.service.ShengzhangxinxiService;
import com.entity.vo.ShengzhangxinxiVO;
import com.entity.view.ShengzhangxinxiView;

@Service("shengzhangxinxiService")
public class ShengzhangxinxiServiceImpl extends ServiceImpl<ShengzhangxinxiDao, ShengzhangxinxiEntity> implements ShengzhangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengzhangxinxiEntity> page = this.selectPage(
                new Query<ShengzhangxinxiEntity>(params).getPage(),
                new EntityWrapper<ShengzhangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengzhangxinxiEntity> wrapper) {
		  Page<ShengzhangxinxiView> page =new Query<ShengzhangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengzhangxinxiVO> selectListVO(Wrapper<ShengzhangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengzhangxinxiVO selectVO(Wrapper<ShengzhangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengzhangxinxiView> selectListView(Wrapper<ShengzhangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengzhangxinxiView selectView(Wrapper<ShengzhangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
