package com.ryan.notification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="semesterdetail")
public class SemesterDetail {
	
	// Id of semester detail
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="semesterdetail_id")
	private int id;
	
	// Semester number
	@Column(name="semester_number")
	private int number;
	
	// Tuition fees of semester
	@Column(name="semester_tutionfees")
	private double tuitionFees;
	
	// Commission Percentage of semester
	@Column(name="semester_commissionpercentage")
	private double commissionPercentage;
	
	// Status of commission
	@Column(name="semester_status")
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getTutionFees() {
		return tuitionFees;
	}
	public void setTutionFees(double tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	public double getCommissionPercentage() {
		return commissionPercentage;
	}
	public void setCommissionPercentage(double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
