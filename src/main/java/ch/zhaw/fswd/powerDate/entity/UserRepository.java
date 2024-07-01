package ch.zhaw.fswd.powerDate.entity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

        Optional<User> findByProfile(Profile profile);

}