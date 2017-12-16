package com.mk.tracrat.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mk.tracrat.command.UserRoleVo;
import com.mk.tracrat.command.UserVo;
import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserRoleDto;
import com.mk.tracrat.service.UserUpdateService;
import com.mk.tracrat.util.JsonUtil;

@RestController
public class UserUpdateController {
	@Autowired
	private UserUpdateService service;

	@GetMapping("/update")
	public ModelAndView updateUserHome() {
		return new ModelAndView("updateHome");
	}

	@GetMapping("/update_user_home")
	public ModelAndView userUpdate() {
		return new ModelAndView("updateUser");
	}
	
	@GetMapping("/user_update_address")
	public ModelAndView UserAddress() {
		return new ModelAndView("upadteAddress");
	}

	// show user role form
	@GetMapping("/update_user_role")
	public ModelAndView userRole() {
		return new ModelAndView("updateUserRole");
	}

	// show user permission form
	@GetMapping("/user_update_permission")
	public ModelAndView userPermission() {
		return new ModelAndView("updateUserPermission");
	}


	@PostMapping("/user_update_home")
	public ModelAndView userUpdate(@ModelAttribute UserVo cmd) {
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(cmd, dto);
		System.out.println("dto update " + dto);
		String result = service.userUpdate(dto);
		String json = JsonUtil.javaToJson(result);
		return new ModelAndView("welcome", "result", json);
	}
	//Inserting user role data into database
		@PostMapping("/user_update_role")
		public ModelAndView userUpdateRole(@ModelAttribute UserRoleVo vo) {
			UserRoleDto dto = new UserRoleDto();
			BeanUtils.copyProperties(vo, dto);
			String responce = service.userRole(dto);
			String json = JsonUtil.javaToJson(responce);
			return new ModelAndView("welcome", "responce", responce);

		}
}
