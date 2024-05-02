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


import com.dao.JunfangxinxiDao;
import com.entity.JunfangxinxiEntity;
import com.service.JunfangxinxiService;
import com.entity.vo.JunfangxinxiVO;
import com.entity.view.JunfangxinxiView;

@Service("junfangxinxiService")
public class JunfangxinxiServiceImpl extends ServiceImpl<JunfangxinxiDao, JunfangxinxiEntity> implements JunfangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JunfangxinxiEntity> page = this.selectPage(
                new Query<JunfangxinxiEntity>(params).getPage(),
                new EntityWrapper<JunfangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JunfangxinxiEntity> wrapper) {
		  Page<JunfangxinxiView> page =new Query<JunfangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JunfangxinxiVO> selectListVO(Wrapper<JunfangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JunfangxinxiVO selectVO(Wrapper<JunfangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JunfangxinxiView> selectListView(Wrapper<JunfangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JunfangxinxiView selectView(Wrapper<JunfangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
