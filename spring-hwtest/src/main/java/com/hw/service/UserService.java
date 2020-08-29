package com.hw.service;


import com.hw.model.User;
import org.springframework.stereotype.Service;

/**
 * @author hewei
 * @date 2020/8/29 18:31
 */
@Service
public class UserService {
	public User getUser(int id){
		return new User();
	}
}
