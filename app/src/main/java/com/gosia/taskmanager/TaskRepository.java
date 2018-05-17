package com.gosia.taskmanager;

import java.util.List;

interface TaskRepository {
    List<Task> fetchTasks();
}
