package pl.security_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.security_project.user.User;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
