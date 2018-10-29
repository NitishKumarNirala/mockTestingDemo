package com.gradle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;



/**
 * The persistent class for the EMPLOYEE database table.
 * 
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="a")
	@SequenceGenerator(name="a", sequenceName="emp_seq")
	@Column(name="EMP_KEY")
	private long empKey;

	@Column(name="EMP_ADDRESSLINE1")
	private String empAddressline1;

	@NotNull
	@Column(name="EMP_ADDRESSLINE2")
	private String empAddressline2;

	@Column(name="EMP_CODE")
	private String empCode;

	@Email(message="invalid email")
	@Column(name="EMP_EMAIL")
	private String empEmail;

	
	@Column(name="EMP_ID")
	private String empId;

	@Column(name="EMP_LANDLINE_NO")
	private String empLandlineNo;

	@Column(name="EMP_MOBILE_NO")
	private String empMobileNo;

	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="EMP_SALARY")
	private long empSalary;

	public long getEmpKey() {
		return this.empKey;
	}

	public void setEmpKey(long empKey) {
		this.empKey = empKey;
	}

	public String getEmpAddressline1() {
		return this.empAddressline1;
	}

	public void setEmpAddressline1(String empAddressline1) {
		this.empAddressline1 = empAddressline1;
	}

	public String getEmpAddressline2() {
		return this.empAddressline2;
	}

	public void setEmpAddressline2(String empAddressline2) {
		this.empAddressline2 = empAddressline2;
	}

	public String getEmpCode() {
		return this.empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpLandlineNo() {
		return this.empLandlineNo;
	}

	public void setEmpLandlineNo(String empLandlineNo) {
		this.empLandlineNo = empLandlineNo;
	}

	public String getEmpMobileNo() {
		return this.empMobileNo;
	}

	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpSalary() {
		return this.empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empKey=" + empKey + ", empAddressline1=" + empAddressline1 + ", empAddressline2="
				+ empAddressline2 + ", empCode=" + empCode + ", empEmail=" + empEmail + ", empId=" + empId
				+ ", empLandlineNo=" + empLandlineNo + ", empMobileNo=" + empMobileNo + ", empName=" + empName
				+ ", empSalary=" + empSalary + "]";
	}

	
}