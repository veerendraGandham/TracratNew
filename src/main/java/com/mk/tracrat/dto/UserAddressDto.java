package com.mk.tracrat.dto;

import java.io.Serializable;

public class UserAddressDto implements  Serializable{
	private int address_id;
	private int user_id;
	private String address1;
	private String address2;
	private String state;
	private String country;
	private int pin;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "AddressVo [address_id=" + address_id + ", user_id=" + user_id + ", address1=" + address1 + ", address2="
				+ address2 + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
}
