package com.example.wordsapi;

import com.example.wordsapi.Repository.UserRepository;
import com.example.wordsapi.UserModel.User;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class WordsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordsApiApplication.class, args);
	}

}
