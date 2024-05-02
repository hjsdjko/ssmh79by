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
 * 菌房信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
@TableName("junfangxinxi")
public class JunfangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JunfangxinxiEntity() {
		
	}
	
	public JunfangxinxiEntity(T t) {
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
	 * 菌房编号
	 */
					
	private String junfangbianhao;
	
	/**
	 * 菌房名称
	 */
					
	private String junfangmingcheng;
	
	/**
	 * 所在位置
	 */
					
	private String suozaiweizhi;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
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
	 * 设置：菌房编号
	 */
	public void setJunfangbianhao(String junfangbianhao) {
		this.junfangbianhao = junfangbianhao;
	}
	/**
	 * 获取：菌房编号
	 */
	public String getJunfangbianhao() {
		return junfangbianhao;
	}
	/**
	 * 设置：菌房名称
	 */
	public void setJunfangmingcheng(String junfangmingcheng) {
		this.junfangmingcheng = junfangmingcheng;
	}
	/**
	 * 获取：菌房名称
	 */
	public String getJunfangmingcheng() {
		return junfangmingcheng;
	}
	/**
	 * 设置：所在位置
	 */
	public void setSuozaiweizhi(String suozaiweizhi) {
		this.suozaiweizhi = suozaiweizhi;
	}
	/**
	 * 获取：所在位置
	 */
	public String getSuozaiweizhi() {
		return suozaiweizhi;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
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
