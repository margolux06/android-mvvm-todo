package com.gosia.taskmanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskRepoImpl implements TaskRepository {
    @Override
    public List<Task> fetchTasks() {
        return new ArrayList<Task>() {{
            add(new Task("Task1", new Date(), true));
            add(new Task("Task2", new Date(), false));
            add(new Task("Task3", new Date(), true));
            add(new Task("Task4", new Date(), false));
        }};
    }
}
