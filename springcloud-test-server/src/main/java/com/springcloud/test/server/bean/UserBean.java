/**
 * 
 */
package com.springcloud.test.server.bean;

import com.hp.core.common.beans.BaseBean;

/**
 * @author huangping
 * 2018年8月1日
 */
public class UserBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8561845612610940977L;

	
	private Integer id;
	private String userName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
