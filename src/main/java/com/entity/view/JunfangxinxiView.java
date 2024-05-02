package com.entity.view;

import com.entity.JunfangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菌房信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
@TableName("junfangxinxi")
public class JunfangxinxiView  extends JunfangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JunfangxinxiView(){
	}
 
 	public JunfangxinxiView(JunfangxinxiEntity junfangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, junfangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
