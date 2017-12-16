package com.mk.tracrat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserRoleDto;
import com.mk.tracrat.dto.UserUpdateDto;

@Repository
public class UserUpdateDaoImpl implements UserUpdateDao {
	
	@Autowired
	private JdbcTemplate jt;
	
	private static final String UPDATE_USER_DATA = "UPDATE USER SET ORG_ID=?, FIRST_NAME=?,LAST_NAME=?,AGE=?,GENDER=?,MOBILE_NUMBER=?,SUPERUSERFLAG=?,STATUS=?,CREATED_DATE=?,CREATED_BY=?,MODIFIED_DATE=?,MODIFIED_BY=? WHERE USER_ID=?";
	private static final String UPDATE_USER_ROLE_DATA="UPDATE ROLE SET USER_ID=?,STATUS=?,CREATED_DATE=?,CREATED_BY=?,MODIFIED_DATE=?,MODIFIED_BY=? WHERE ROLE_ID=?";
	@Override
	public int userUpdate(UserDto dto) {
		System.out.println("dao update controller"+dto);
		int count = jt.update(UPDATE_USER_DATA, dto.getOrg_id(),dto.getFirst_name(),
				dto.getLast_name(), dto.getAge(), dto.getGender(),  dto.getMobile_number(), dto.getSuperUserFlag(),
				dto.getStatus(), dto.getCreated_date(),dto.getCreated_by(),dto.getModified_date(),dto.getModified_by(),dto.getUser_id());
		
		return count;
	}
		@Override
		public int userRole(UserRoleDto dto) {
			int count = jt.update(UPDATE_USER_ROLE_DATA,dto.getUser_id(),dto.getStatus(),dto.getCreated_date(),dto.getCreated_by(),dto.getModified_date(),dto.getModified_by(),dto.getRole_id()	);
			return count;
		}

}
