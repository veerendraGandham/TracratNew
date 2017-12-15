package com.mk.tracrat.dto;

public class UserDto {
	private int user_id;
	private int org_id;
	private String first_name;
	private String last_name;
	private String age;
	private String gender;
	private String mobile_number;
	private String superUserFlag;
	private String status;
	private String created_date;
	private String created_by;
	private String modified_date;
	private String modified_by;

	public String getSuperUserFlag() {
		return superUserFlag;
	}

	public void setSuperUserFlag(String superUserFlag) {
		this.superUserFlag = superUserFlag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getOrg_id() {
		return org_id;
	}

	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", org_id=" + org_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", age=" + age + ", gender=" + gender + ", mobile_number=" + mobile_number
				+ ", superUserFlag=" + superUserFlag + ", status=" + status + ", created_date=" + created_date
				+ ", created_by=" + created_by + ", modified_date=" + modified_date + ", modified_by=" + modified_by
				+ "]";
	}

	
}
