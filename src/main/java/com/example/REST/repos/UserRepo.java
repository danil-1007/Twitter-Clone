package com.example.REST.repos;

import com.example.REST.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
//Метод который возвращает пользователя
public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);

    User findByActivationCode(String code);
}
