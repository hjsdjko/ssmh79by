package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 基本信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
@TableName("jibenxinxi")
public class JibenxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JibenxinxiEntity() {
		
	}
	
	public JibenxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
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
