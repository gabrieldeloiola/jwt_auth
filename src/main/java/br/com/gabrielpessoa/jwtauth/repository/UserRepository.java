package br.com.gabrielpessoa.jwtauth.repository;

import br.com.gabrielpessoa.jwtauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

   Optional<User> findUserByEmail(String email);
}
