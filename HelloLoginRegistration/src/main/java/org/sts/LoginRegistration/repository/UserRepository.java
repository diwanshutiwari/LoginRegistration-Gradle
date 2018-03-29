package org.sts.LoginRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sts.LoginRegistration.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
