package com.jiangsu.dao;

import com.jiangsu.domain.User;

public interface UserDao {
	
	/**
	 * ����û�
	 * @param user
	 * @throws Exception
	 */
	public void addUser(User user) throws Exception;
}
