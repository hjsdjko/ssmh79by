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


import com.dao.JibenxinxiDao;
import com.entity.JibenxinxiEntity;
import com.service.JibenxinxiService;
import com.entity.vo.JibenxinxiVO;
import com.entity.view.JibenxinxiView;

@Service("jibenxinxiService")
public class JibenxinxiServiceImpl extends ServiceImpl<JibenxinxiDao, JibenxinxiEntity> implements JibenxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JibenxinxiEntity> page = this.selectPage(
                new Query<JibenxinxiEntity>(params).getPage(),
                new EntityWrapper<JibenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JibenxinxiEntity> wrapper) {
		  Page<JibenxinxiView> page =new Query<JibenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JibenxinxiVO> selectListVO(Wrapper<JibenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JibenxinxiVO selectVO(Wrapper<JibenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JibenxinxiView> selectListView(Wrapper<JibenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JibenxinxiView selectView(Wrapper<JibenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
