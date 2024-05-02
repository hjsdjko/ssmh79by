package com.dao;

import com.entity.JibenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JibenxinxiVO;
import com.entity.view.JibenxinxiView;


/**
 * 基本信息
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public interface JibenxinxiDao extends BaseMapper<JibenxinxiEntity> {
	
	List<JibenxinxiVO> selectListVO(@Param("ew") Wrapper<JibenxinxiEntity> wrapper);
	
	JibenxinxiVO selectVO(@Param("ew") Wrapper<JibenxinxiEntity> wrapper);
	
	List<JibenxinxiView> selectListView(@Param("ew") Wrapper<JibenxinxiEntity> wrapper);

	List<JibenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JibenxinxiEntity> wrapper);
	
	JibenxinxiView selectView(@Param("ew") Wrapper<JibenxinxiEntity> wrapper);
	
}
