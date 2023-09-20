package com.BootMVC.BootRegistration;

import java.util.Date;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;



public class User {
    @Size(min = 3, max = 50)
	private String name;

	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;

	@NotBlank
	@Size(min = 8, max = 15)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

}