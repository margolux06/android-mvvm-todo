package com.gosia.taskmanager;

import android.app.Application;
import android.content.Context;

public class TaskApplication extends Application {
    private TaskRepository taskRepository;

    public static TaskApplication get(Context context){
        return (TaskApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        taskRepository = new TaskRepoImpl();
    }

    public TaskRepository getTaskRepository() {
        return taskRepository;
    }
}
