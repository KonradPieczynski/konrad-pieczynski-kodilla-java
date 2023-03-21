package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Board {
    final
    TaskList toDoList;
    final
    TaskList inProgressList;
    final
    TaskList doneList;

    public Board(@Qualifier("toDoList") TaskList toDoList, @Qualifier("inProgressList") TaskList inProgressList, @Qualifier("doneList") TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
