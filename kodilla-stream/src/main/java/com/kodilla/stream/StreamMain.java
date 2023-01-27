package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> par = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> LocalDate.now().minusYears(18).isAfter(user.getBirthdate()))
                .filter(user -> user.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        par.entrySet().stream()
                .map(entry ->"Map key: " + entry.getKey() + " Map value: " + entry.getValue())
                .forEach(System.out::println);
    }
}