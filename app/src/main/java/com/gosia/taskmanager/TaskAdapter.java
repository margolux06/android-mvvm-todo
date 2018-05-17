package com.gosia.taskmanager;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.gosia.taskmanager.databinding.TaskItemBinding;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private final List<Task> tasks;

    public TaskAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TaskItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.task_item, parent, false);
        return new TaskViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        holder.binding.setTask(tasks.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        public TaskItemBinding binding;

        public TaskViewHolder(TaskItemBinding taskItemBinding) {
            super(taskItemBinding.getRoot());
            this.binding = taskItemBinding;
        }
    }
}
