package com.gosia.taskmanager;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gosia.taskmanager.databinding.TaskListBinding;

public class TaskListActivity extends AppCompatActivity {
    private TaskListViewModel taskListViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        taskListViewModel = ViewModelProviders.of(this, new ViewModelProvider.Factory() {
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return (T) new TaskListViewModel(TaskApplication.get(TaskListActivity.this).getTaskRepository());
            }
        })
                .get(TaskListViewModel.class);

        TaskListBinding taskListBinding = DataBindingUtil
                .setContentView(this, R.layout.task_list);

        taskListBinding.setLifecycleOwner(this);
        taskListBinding.setViewModel(taskListViewModel);

        TaskAdapter taskAdapter = new TaskAdapter(taskListViewModel.loadTasks());
        taskListBinding.setTaskRecyclerAdapter(taskAdapter);
    }
}
