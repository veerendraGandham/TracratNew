package com.mk.tracrat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.tracrat.dao.UserInsertDao;
import com.mk.tracrat.dto.UserAddressDto;
import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserPermissionDto;
import com.mk.tracrat.dto.UserRoleDto;

@Service
public class UserInsertService {
	@Autowired
	private UserInsertDao dao;

	// Inserting user details in database
	public String userInsert(UserDto dto) {
		int count = dao.userInsert(dto);
		System.out.println("service dto" + dto);
		if (count == 0)
			return "insert failed";
		else
			return "insertion is success";
	}

	// Inserting user address into database
	public String userAddress(UserAddressDto dto) {
		int count = dao.userAddress(dto);
		if (count == 0)
			return "insert failed";
		else
			return "insertion is success";
	}

	public String userRole(UserRoleDto dto) {
		int count = dao.userRole(dto);
		if (count == 0)
			return "insert failed";
		else
			return "insertion is success";
	}

	public String userPermission(UserPermissionDto dto) {
		int count = dao.userPermission(dto);
		if (count == 0)
			return "insert failed";
		else
			return "insertion is success";
	}

}
