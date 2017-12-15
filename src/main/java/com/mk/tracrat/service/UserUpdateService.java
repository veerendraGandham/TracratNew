package com.mk.tracrat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.tracrat.dao.UserUpdateDao;
import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserUpdateDto;
@Service
public class UserUpdateService {
@Autowired
private UserUpdateDao dao; 

	public String userUpdate(UserUpdateDto dto) {
		System.out.println("service1 update dto" + dto);
			int count = dao.userUpdate(dto);
			System.out.println("service2 update dto" + dto);
			if (count == 0)
				return "User Updation is failed";
			else
				return "User Updation is success";	}

}
