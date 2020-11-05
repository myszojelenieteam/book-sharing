package pl.polsl.bookSharing.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import pl.polsl.bookSharing.model.User;
import pl.polsl.bookSharing.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    User save(UserRegistrationDto dto);
}
