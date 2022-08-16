package com.example.wordsapi.Repository;

import com.example.wordsapi.UserModel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User , Integer> {
    public User findById(int id);

    @Query("Select u from User u")
    public List<User> getAllUsers();
}
