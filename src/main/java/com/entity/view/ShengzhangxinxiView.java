package com.entity.view;

import com.entity.ShengzhangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生长信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
@TableName("shengzhangxinxi")
public class ShengzhangxinxiView  extends ShengzhangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengzhangxinxiView(){
	}
 
 	public ShengzhangxinxiView(ShengzhangxinxiEntity shengzhangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shengzhangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
