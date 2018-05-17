package com.gosia.taskmanager;

import android.arch.lifecycle.ViewModel;

import java.util.List;

public class TaskListViewModel extends ViewModel {
    public String counter = "duppa 333";

    private final TaskRepository taskRepository;

    public TaskListViewModel(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> loadTasks() {
        return taskRepository.fetchTasks();
    }
}
