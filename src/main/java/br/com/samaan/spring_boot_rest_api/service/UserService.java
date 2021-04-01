package br.com.samaan.spring_boot_rest_api.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.samaan.spring_boot_rest_api.entity.User;

@Service
public class UserService {

	final User user1 = new User(1L, "Nome", "e-mail", LocalDateTime.MIN, LocalDateTime.MAX);
	final User user2 = new User(2L, "Nomes", "e-mails", LocalDateTime.MIN, LocalDateTime.MAX);

    public Optional<User> getUserById(Long id) {
		return Optional.of(user1);
    }

    public List<User> getAllUsers() {
    	return Arrays.asList(user1, user2);
    }

}
