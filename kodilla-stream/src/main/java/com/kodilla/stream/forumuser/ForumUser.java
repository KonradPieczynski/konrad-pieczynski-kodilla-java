package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    final int id;
    final String username;
    final char gender ;

    final LocalDate birthdate;
    int posts;

    public ForumUser(int id, String username, char gender, LocalDate birthdate, int posts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthdate = birthdate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != forumUser.id) return false;
        if (gender != forumUser.gender) return false;
        if (posts != forumUser.posts) return false;
        if (!Objects.equals(username, forumUser.username)) return false;
        return Objects.equals(birthdate, forumUser.birthdate);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (int) gender;
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + posts;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", posts=" + posts +
                '}';
    }
}
