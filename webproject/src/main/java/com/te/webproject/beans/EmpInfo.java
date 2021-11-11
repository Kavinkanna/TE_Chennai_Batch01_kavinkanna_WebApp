package com.te.webproject.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "empweb")
public class EmpInfo implements Serializable {

	public EmpInfo() {
	}

	@Id
	@Column
	private Integer empid;

	@Column
	private String name;

	@Column(unique = true)
	private String username;

	@Column
	private String password;

	@Column
	private Double salary;

	@Column
	private String gender;

	@Column
	private String role;

	@Column
	private Long mobileno;

	@Column(unique = true)
	private String email;

}
