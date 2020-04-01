package pl.security_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.security_project.user.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    UserRole findByRole(String role);
}
