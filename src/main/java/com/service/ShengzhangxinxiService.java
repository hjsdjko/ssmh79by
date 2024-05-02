package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengzhangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengzhangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengzhangxinxiView;


/**
 * 生长信息
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public interface ShengzhangxinxiService extends IService<ShengzhangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengzhangxinxiVO> selectListVO(Wrapper<ShengzhangxinxiEntity> wrapper);
   	
   	ShengzhangxinxiVO selectVO(@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);
   	
   	List<ShengzhangxinxiView> selectListView(Wrapper<ShengzhangxinxiEntity> wrapper);
   	
   	ShengzhangxinxiView selectView(@Param("ew") Wrapper<ShengzhangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengzhangxinxiEntity> wrapper);
   	
}

