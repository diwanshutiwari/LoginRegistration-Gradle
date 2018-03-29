package org.sts.LoginRegistration.service;

import org.sts.LoginRegistration.modal.User;

public interface UserService {

	User findByUsername(String username);

	void save(User user);

}
