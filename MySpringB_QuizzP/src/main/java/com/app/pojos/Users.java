package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name", unique = true, length = 40)
	private String userName;
	@Column(name = "first_name", nullable = false, length = 20)
	private String firstName;
	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	@Column(name = "email_id", unique = true, nullable = false, length = 50)
	private String emailId;
	@Column(name = "password", unique = true, nullable = false, length = 20)
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name = "roll", length = 20, nullable = false)
	private Roll roll;

	@OneToMany(mappedBy = "e3", cascade = CascadeType.ALL)
	private List<ExamDetails> examd3 = new ArrayList<>();
	// @ManyToMany
	// private List<Tests> test = new ArrayList<Tests>();

	public Users(int userId, String userName, String firstName, String lastName, String emailId, String password,
			Roll roll) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.roll = roll;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Roll getRoll() {
		return roll;
	}

	public void setRoll(Roll roll) {
		this.roll = roll;
	}

//	public List<Tests> getTest() {
//		return test;
//	}

//	public void setTest(List<Tests> test) {
//this.test = test;
//}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", roll=" + roll + "]";
	}

	public List<ExamDetails> getExamd3() {
		return examd3;
	}

	public void setExamd3(List<ExamDetails> examd3) {
		this.examd3 = examd3;
	}



}
