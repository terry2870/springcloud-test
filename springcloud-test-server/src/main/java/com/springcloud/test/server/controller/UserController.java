/**
 * 
 */
package com.springcloud.test.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.test.server.bean.UserBean;

/**
 * @author huangping
 * 2018年8月1日
 */
@RestController
public class UserController {

	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/user/{id}")
	public UserBean findUserById(@PathVariable Integer id) {
		log.info("findUserById with id={}", id);
		UserBean user = new UserBean();
		user.setId(id);
		user.setUserName("名称_" + id);
		return user;
	}
}
