package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer EmployeeId;
	private String empName;
	private String empAddres;
	private Integer empCont;
	private String degs;

}
