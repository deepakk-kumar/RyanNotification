package com.ryan.notification.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
 * Class: Student to hold the details of student
 */
@Entity
@Table(name="student")
public class Student {

	// Id of student
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	
	// Name of student
	@Column(name="student_name")
	private String name;
	
	// Passport number of student
	@Column(name="student_passportnumber")
	private String passportNumber;
	
	// College details of student
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "student", cascade = CascadeType.ALL)
	private College studentCollege;
	
	// Address of student
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "student", cascade = CascadeType.ALL)
	private Address studentAddress;
	
	// Date of birth of student
	@Column(name="student_dob")
	private String dob;
	
	// Agent Name
	@Column(name="student_agentname")
	private String agentName;
	
	//List of semester details for each student
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_semesterdetails", joinColumns={@JoinColumn(name="student_id")},inverseJoinColumns={@JoinColumn(name="semesterdetail_id")})
	private List<SemesterDetail> semesterDetails;
	
	//Course in which student is enrolled in the college
	@Column(name="student_course")
	private String course;
	
	//Number of semesters
	@Column(name="student_numberOfSemesters")
	private int numberOfSemesters;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public College getCollege() {
		return studentCollege;
	}
	public void setCollege(College studentCollege) {
		this.studentCollege = studentCollege;
	}
	public Address getAddress() {
		return studentAddress;
	}
	public void setAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public List<SemesterDetail> getSemesterDetails() {
		return semesterDetails;
	}
	public void setSemesterDetails(List<SemesterDetail> semesterDetails) {
		this.semesterDetails = semesterDetails;
	}	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getNumberOfSemesters() {
		return numberOfSemesters;
	}
	public void setNumberOfSemesters(int numberOfSemesters) {
		this.numberOfSemesters = numberOfSemesters;
	}

	
	
}
