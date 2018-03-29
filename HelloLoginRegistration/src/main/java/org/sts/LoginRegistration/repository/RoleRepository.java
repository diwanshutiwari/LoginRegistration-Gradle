package org.sts.LoginRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sts.LoginRegistration.modal.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
