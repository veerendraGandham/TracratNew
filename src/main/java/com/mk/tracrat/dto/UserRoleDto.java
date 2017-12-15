package com.mk.tracrat.dto;

public class UserRoleDto {
	private int role_id;
	private int user_id;
	private String status;
	private String created_date;
	private String created_by;
	private String modified_date;
	private String modified_by;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "UserRoleDto [role_id=" + role_id + ", user_id=" + user_id + ", status=" + status + ", created_date="
				+ created_date + ", created_by=" + created_by + ", modified_date=" + modified_date + ", modified_by="
				+ modified_by + "]";
	}

}
