package com.apsoo.urfpe.ms.auth_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByMatricula(String matricula);
}
