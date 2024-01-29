package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.UserBean;
import com.entity.User;
import com.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUser(){
		List<User> lstUser = new ArrayList<>();
		userRepository.findAll().forEach(us -> lstUser.add(us) ); 
		return lstUser;
	}
	
	@Transactional
	public List<UserBean> allUserBean(){
		List<User> allUserLst = getAllUser();
		List<UserBean> lstUsersBean = new ArrayList<>();
		
		for(int i= 0;i<allUserLst.size();i++) {
			UserBean bean = new UserBean();
			BeanUtils.copyProperties(allUserLst.get(i), bean);
			lstUsersBean.add(bean);
		}
		
		return lstUsersBean;
	}
	

}
