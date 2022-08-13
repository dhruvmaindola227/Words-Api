package com.example.wordsapi.Repository;

import com.example.wordsapi.UserModel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , Integer> {
    public User findById(int id);
}
