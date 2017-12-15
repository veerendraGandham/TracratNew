package com.mk.tracrat.dto;

public class UserUpdateDto {
	private int user_id;

	private String first_name;
	private String last_name;
	private String age;
	private String gender;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	@Override
	public String toString() {
		return "UserUpdateDto [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", age=" + age + ", gender=" + gender + "]";
	}

}
