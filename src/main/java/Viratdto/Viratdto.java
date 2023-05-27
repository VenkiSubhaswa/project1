package Viratdto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Viratdto {
   @Id
   private String email;
   private int password;
   private String username;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
}
