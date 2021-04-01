package br.com.samaan.spring_boot_rest_api.repo;

import br.com.samaan.spring_boot_rest_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
