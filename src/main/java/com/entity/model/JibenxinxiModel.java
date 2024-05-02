package com.entity.model;

import com.entity.JibenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 基本信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public class JibenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食用菌
	 */
	
	private String shiyongjun;
		
	/**
	 * 类别
	 */
	
	private String leibie;
		
	/**
	 * 详细介绍
	 */
	
	private String xiangxijieshao;
		
	/**
	 * 图片展示
	 */
	
	private String tupianzhanshi;
				
	
	/**
	 * 设置：食用菌
	 */
	 
	public void setShiyongjun(String shiyongjun) {
		this.shiyongjun = shiyongjun;
	}
	
	/**
	 * 获取：食用菌
	 */
	public String getShiyongjun() {
		return shiyongjun;
	}
				
	
	/**
	 * 设置：类别
	 */
	 
	public void setLeibie(String leibie) {
		this.leibie = leibie;
	}
	
	/**
	 * 获取：类别
	 */
	public String getLeibie() {
		return leibie;
	}
				
	
	/**
	 * 设置：详细介绍
	 */
	 
	public void setXiangxijieshao(String xiangxijieshao) {
		this.xiangxijieshao = xiangxijieshao;
	}
	
	/**
	 * 获取：详细介绍
	 */
	public String getXiangxijieshao() {
		return xiangxijieshao;
	}
				
	
	/**
	 * 设置：图片展示
	 */
	 
	public void setTupianzhanshi(String tupianzhanshi) {
		this.tupianzhanshi = tupianzhanshi;
	}
	
	/**
	 * 获取：图片展示
	 */
	public String getTupianzhanshi() {
		return tupianzhanshi;
	}
			
}
