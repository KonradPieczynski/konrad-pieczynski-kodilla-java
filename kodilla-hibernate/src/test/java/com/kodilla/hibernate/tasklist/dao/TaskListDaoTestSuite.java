package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test find by list name";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME,"");
        //When
        taskListDao.save(taskList);
        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        assertEquals(1,readTaskList.size());
        //CleanUp
        taskListDao.deleteById(readTaskList.get(0).getId());
    }
}
