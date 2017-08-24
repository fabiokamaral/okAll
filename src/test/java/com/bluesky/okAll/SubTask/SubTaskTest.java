package com.bluesky.okAll.SubTask;

import static org.junit.Assert.*;

import com.bluesky.okAll.model.SubTask;
import com.bluesky.okAll.model.Task;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SubTaskTest {

    @Test
    public void verifyNameOfTask() {
        SubTask subTask = new SubTask();
        subTask.setName("SubTask");
        assertEquals("SubTask", subTask.getName());
    }

    @Test
    public void verifyAddSubTaskToTask() {

        Task task1 = new Task();

        task1.setName("Task1");
        task1.setSubTasks(new ArrayList<SubTask>());

        SubTask subTask1 = new SubTask();
        SubTask subTask2 = new SubTask();
        SubTask subTask3 = new SubTask();

        subTask1.setName("SubTask1");
        subTask2.setName("SubTask2");
        subTask3.setName("SubTask3");

        task1.getSubTasks().add(subTask1);
        task1.getSubTasks().add(subTask2);
        task1.getSubTasks().add(subTask3);

        assertEquals(task1.getSubTasks().get(0).getName(), subTask1.getName());
        assertEquals(task1.getSubTasks().get(1).getName(), subTask2.getName());
        assertEquals(task1.getSubTasks().get(2).getName(), subTask3.getName());

    }

}
