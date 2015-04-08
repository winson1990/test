package jeecg.system.pojo.json;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jeecg.system.pojo.base.TSUser;

import org.hibernate.annotations.GenericGenerator;



public class TSUserJson  {
	/** 用户ID */
	private String id;
	/** 用户名称 */
	private String userName;
	/** 用户密码 */
	private String password;
	/** 用户状态 1：正常 -1：超级管理员 0：禁用 */
	private Short status;
	/** 头像路径 */
	private String portrait;
	/** 真实姓名 */
	private String realName;
	/** 电话号码 */
	private String phone;

	private TSUserJson (TSUser tsUser){
		this.id=tsUser.getId();
		this.userName=tsUser.getUserName();
		this.password=tsUser.getPassword();
		this.status=tsUser.getStatus();
		this.portrait=tsUser.getPortrait();
		this.realName=tsUser.getRealName();
		this.phone=tsUser.getPhone();
	}
	
	/**
	 * 获取用户ID
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置用户ID
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取用户状态
	 * 
	 * @return
	 */
	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	/**
	 * 设置用户状态
	 * 
	 * @param status
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * 获取用户密码
	 * 
	 * @return
	 */
	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	/**
	 * 设置用户密码
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * 获取用户名
	 * 
	 * @return
	 */
	@Column(name = "username", nullable = false, length = 15)
	public String getUserName() {
		return this.userName;
	}

	/**
	 * 设置用户名
	 * 
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取头像路径
	 * 
	 * @return
	 */
	@Column(name = "portrait", length = 255)
	public String getPortrait() {
		return portrait;
	}

	/**
	 * 设置头像路径
	 * 
	 * @param portrait
	 */
	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	/**
	 * 获取真实姓名
	 * 
	 * @return
	 */
	@Column(name = "realname", length = 255)
	public String getRealName() {
		return realName;
	}

	/**
	 * 设置真实姓名
	 * 
	 * @param realName
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * 获取电话号码
	 * 
	 * @return
	 */
	@Column(name = "phone", nullable = false, length = 255)
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置电话号码
	 * 
	 * @param realName
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public static final TSUserJson toUserJson(TSUser user){
     TSUserJson userJsons=new TSUserJson(user);	
		return  userJsons;
	}

}