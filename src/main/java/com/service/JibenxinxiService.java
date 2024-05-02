package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JibenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JibenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JibenxinxiView;


/**
 * 基本信息
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public interface JibenxinxiService extends IService<JibenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JibenxinxiVO> selectListVO(Wrapper<JibenxinxiEntity> wrapper);
   	
   	JibenxinxiVO selectVO(@Param("ew") Wrapper<JibenxinxiEntity> wrapper);
   	
   	List<JibenxinxiView> selectListView(Wrapper<JibenxinxiEntity> wrapper);
   	
   	JibenxinxiView selectView(@Param("ew") Wrapper<JibenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JibenxinxiEntity> wrapper);
   	
}

