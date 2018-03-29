package org.sts.LoginRegistration.service;

public interface SecurityService {

	String findLoggedInUsername();

	void autologin(String username, String password);

}
