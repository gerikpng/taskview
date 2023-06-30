package com.example.taskview.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class user implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID use_id;
	private String use_name;
	private Date use_birthday;
	private int use_admin;
	private int use_coord;
	private int use_student;
	private int use_matric;
	private String use_email;
	private String use_password;
	public UUID getUse_id() {
		return use_id;
	}
	public void setUse_id(UUID use_id) {
		this.use_id = use_id;
	}
	public String getUse_name() {
		return use_name;
	}
	public void setUse_name(String use_name) {
		this.use_name = use_name;
	}
	public Date getUse_birthday() {
		return use_birthday;
	}
	public void setUse_birthday(Date use_birthday) {
		this.use_birthday = use_birthday;
	}
	public int getUse_admin() {
		return use_admin;
	}
	public void setUse_admin(int use_admin) {
		this.use_admin = use_admin;
	}
	public int getUse_coord() {
		return use_coord;
	}
	public void setUse_coord(int use_coord) {
		this.use_coord = use_coord;
	}
	public int getUse_student() {
		return use_student;
	}
	public void setUse_student(int use_student) {
		this.use_student = use_student;
	}
	public int getUse_matric() {
		return use_matric;
	}
	public void setUse_matric(int use_matric) {
		this.use_matric = use_matric;
	}
	public String getUse_email() {
		return use_email;
	}
	public void setUse_email(String use_email) {
		this.use_email = use_email;
	}
	public String getUse_password() {
		return use_password;
	}
	public void setUse_password(String use_password) {
		this.use_password = use_password;
	}
	
	
}
