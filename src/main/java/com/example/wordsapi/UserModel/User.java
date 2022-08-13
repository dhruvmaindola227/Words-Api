package com.example.wordsapi.UserModel;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    User(){

    }
    public User(int userId, @NonNull String userName, @NonNull String userPass, int easyScore, int mediumScore, int hardScore) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.easyScore = easyScore;
        this.mediumScore = mediumScore;
        this.hardScore = hardScore;
    }

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;

    @NonNull
    @Column(name = "user_name")
    private String userName;

    @NonNull
    @Column(name = "user_pass")
    private String userPass;
    @Column(name = "user_easy")
    private int easyScore;
    @Column(name = "user_medium")
    private int mediumScore;
    @Column(name = "user_hard")
    private int hardScore;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @NonNull
    public String getUserName() {
        return userName;
    }

    public void setUserName(@NonNull String userName) {
        this.userName = userName;
    }

    @NonNull
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(@NonNull String userPass) {
        this.userPass = userPass;
    }

    public int getEasyScore() {
        return easyScore;
    }

    public void setEasyScore(int easyScore) {
        this.easyScore = easyScore;
    }

    public int getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(int mediumScore) {
        this.mediumScore = mediumScore;
    }

    public int getHardScore() {
        return hardScore;
    }

    public void setHardScore(int hardScore) {
        this.hardScore = hardScore;
    }
}
