package com.mk.tracrat.dao;

import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserUpdateDto;

public interface UserUpdateDao {

	int userUpdate(UserDto dto);

}
