package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JunfangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JunfangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JunfangxinxiView;


/**
 * 菌房信息
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public interface JunfangxinxiService extends IService<JunfangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JunfangxinxiVO> selectListVO(Wrapper<JunfangxinxiEntity> wrapper);
   	
   	JunfangxinxiVO selectVO(@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);
   	
   	List<JunfangxinxiView> selectListView(Wrapper<JunfangxinxiEntity> wrapper);
   	
   	JunfangxinxiView selectView(@Param("ew") Wrapper<JunfangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JunfangxinxiEntity> wrapper);
   	
}

