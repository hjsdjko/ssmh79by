package com.dao;

import com.entity.ShengzhangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengzhangxinxiVO;
import com.entity.view.ShengzhangxinxiView;


/**
 * 生长信息
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public interface ShengzhangxinxiDao extends BaseMapper<ShengzhangxinxiEntity> {
	
	List<ShengzhangxinxiVO> selectListVO(@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);
	
	ShengzhangxinxiVO selectVO(@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);
	
	List<ShengzhangxinxiView> selectListView(@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);

	List<ShengzhangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);
	
	ShengzhangxinxiView selectView(@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);
	
}
