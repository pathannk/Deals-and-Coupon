package com.hmsLogin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="USERSs")
public class UserModel {


	@Id
	private String id;
	private String role;
	private String username;
	private String password;
	public void setUsername(String username2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}
	public void setRole(String role2) {
		// TODO Auto-generated method stub
		
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}

}