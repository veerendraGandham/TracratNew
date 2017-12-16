package com.mk.tracrat.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mk.tracrat.command.UserAddressVo;
import com.mk.tracrat.command.UserPermissionVo;
import com.mk.tracrat.command.UserRoleVo;
import com.mk.tracrat.command.UserVo;
import com.mk.tracrat.dto.UserAddressDto;
import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserPermissionDto;
import com.mk.tracrat.dto.UserRoleDto;
import com.mk.tracrat.service.UserInsertService;
import com.mk.tracrat.util.JsonUtil;

@RestController
public class UserInsertController {
	@Autowired
	private UserInsertService service;

	// show user home page
	@GetMapping("/user_home")
	public ModelAndView userInsert() {

		return new ModelAndView("user");
	}

	// show user address form
	@GetMapping("/user_address")
	public ModelAndView userAddress() {
		return new ModelAndView("address");
	}

	// show user role form
	@GetMapping("/user_role")
	public ModelAndView userRole() {
		return new ModelAndView("userRole");
	}

	// show user permission form
	@GetMapping("/user_permissions")
	public ModelAndView userPermission() {
		return new ModelAndView("userPermission");
	}

	// Inserting user data into data base
	@PostMapping("/user_home")
	//@ResponseBody
	//@Produces(MediaType.))
	public ModelAndView userInsert(@ModelAttribute UserVo cmd) {
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(cmd, dto);
		String result = service.userInsert(dto);
		//String json = JsonUtil.javaToJson(result);
		return new ModelAndView("address", "result", result);
	}

	// Inserting user address data into database
	@PostMapping("/user_address")
	public ModelAndView userAddress(@ModelAttribute UserAddressVo vo) {
		UserAddressDto dto = new UserAddressDto();
		BeanUtils.copyProperties(vo, dto);
		String responce = service.userAddress(dto);
		String json = JsonUtil.javaToJson(responce);
		return new ModelAndView("userRole", "responce", responce);

	}
//Inserting user role data into database
	@PostMapping("/user_role")
	public ModelAndView userRole(@ModelAttribute UserRoleVo vo) {
		UserRoleDto dto = new UserRoleDto();
		BeanUtils.copyProperties(vo, dto);
		String responce = service.userRole(dto);
		String json = JsonUtil.javaToJson(responce);
		return new ModelAndView("userPermission", "responce", responce);

	}

	@PostMapping("/user_permission")
	public ModelAndView userPermission(@ModelAttribute UserPermissionVo vo) {
		UserPermissionDto dto=new UserPermissionDto();
		BeanUtils.copyProperties(vo, dto);
		String responce = service.userPermission(dto);
		String json = JsonUtil.javaToJson(responce);
		return new ModelAndView("welcome", "responce", responce);

	}
	
	@GetMapping(value="/getUsers", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getUsers() {
		String user = "Senthil";
		return new ResponseEntity<String>(user, HttpStatus.OK);
	}
}
