/**
 * 
 */
package com.flipkart.bean;

import java.util.Date;

import com.flipkart.constant.GenderConstant;
import com.flipkart.constant.RoleConstant;

/**
 * @author Group-A
 *
 */
public class Professor extends User {
	private String professorId;
	private String department;
	private String designation;
	
	
	public Professor(String userID) {
		super(userID);
	}
	public Professor(String userID, String name, GenderConstant gender, String password, String address, String professorId, String department, String designation) {
		super(userID, name, RoleConstant.PROFESSOR, password, gender, address);
		this.professorId = professorId;
		this.department = department;
		this.designation = designation;

	}

	public Professor(String professorId, String department, String designation) {
		// TODO Auto-generated constructor stub
		this.professorId = professorId;
		this.department = department;
		this.designation = designation;
	}
	public Professor(){

	}
	/**
	 * @return the professorId
	 */
	public String getprofessorId() {
		return professorId;
	}
	/**
	 * @param professorId the professorId to set
	 */
	public void setprofessorId(String professorId) {
		this.professorId = professorId;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the dateOfJoining
	 */
	
}
