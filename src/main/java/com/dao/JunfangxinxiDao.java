package com.dao;

import com.entity.JunfangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JunfangxinxiVO;
import com.entity.view.JunfangxinxiView;


/**
 * 菌房信息
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public interface JunfangxinxiDao extends BaseMapper<JunfangxinxiEntity> {
	
	List<JunfangxinxiVO> selectListVO(@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);
	
	JunfangxinxiVO selectVO(@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);
	
	List<JunfangxinxiView> selectListView(@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);

	List<JunfangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);
	
	JunfangxinxiView selectView(@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);
	
}
