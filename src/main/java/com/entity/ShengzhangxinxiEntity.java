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
 * 生长信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
@TableName("shengzhangxinxi")
public class ShengzhangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengzhangxinxiEntity() {
		
	}
	
	public ShengzhangxinxiEntity(T t) {
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
	 * 当前温度
	 */
					
	private Float dangqianwendu;
	
	/**
	 * 当前湿度
	 */
					
	private Float dangqianshidu;
	
	/**
	 * 生长情况
	 */
					
	private String shengzhangqingkuang;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
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
	 * 设置：当前温度
	 */
	public void setDangqianwendu(Float dangqianwendu) {
		this.dangqianwendu = dangqianwendu;
	}
	/**
	 * 获取：当前温度
	 */
	public Float getDangqianwendu() {
		return dangqianwendu;
	}
	/**
	 * 设置：当前湿度
	 */
	public void setDangqianshidu(Float dangqianshidu) {
		this.dangqianshidu = dangqianshidu;
	}
	/**
	 * 获取：当前湿度
	 */
	public Float getDangqianshidu() {
		return dangqianshidu;
	}
	/**
	 * 设置：生长情况
	 */
	public void setShengzhangqingkuang(String shengzhangqingkuang) {
		this.shengzhangqingkuang = shengzhangqingkuang;
	}
	/**
	 * 获取：生长情况
	 */
	public String getShengzhangqingkuang() {
		return shengzhangqingkuang;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
