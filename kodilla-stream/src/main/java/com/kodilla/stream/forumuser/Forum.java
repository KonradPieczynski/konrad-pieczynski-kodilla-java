package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public final List<ForumUser> getUserList() {
        final List<ForumUser> theList = new ArrayList<>();

        theList.add(new ForumUser(1,"John",'M', LocalDate.of(2010, 1, 8),10));
        theList.add(new ForumUser(2,"Dorothy",'F', LocalDate.of(2000, 1, 8),5));
        theList.add(new ForumUser(3,"Lucy",'F', LocalDate.of(2001, 1, 8),15));
        theList.add(new ForumUser(4,"Owen",'M', LocalDate.of(2005, 1, 8),0));
        theList.add(new ForumUser(5,"Matilda",'F', LocalDate.of(2006, 1, 8),100));
        theList.add(new ForumUser(6,"Declan",'M', LocalDate.of(1970, 1, 8),102));
        theList.add(new ForumUser(7,"Corinne",'F', LocalDate.of(1990, 1, 8),120));
        theList.add(new ForumUser(8,"Khloe",'F', LocalDate.of(2010, 1, 8),70));
        theList.add(new ForumUser(9,"Martin",'M', LocalDate.of(1990, 1, 8),80));
        return new ArrayList<>(theList);
    }
}

