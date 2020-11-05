package pl.polsl.bookSharing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.polsl.bookSharing.model.User;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
