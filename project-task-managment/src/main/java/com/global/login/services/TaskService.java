package com.global.login.services;

import com.global.login.dto.TaskDto;
import com.global.login.dto.UpdateTaskDto;

public interface TaskService {
    public TaskDto addTask(TaskDto taskDto);

    void deleteAllTask();


    Object updateTask(UpdateTaskDto updateTaskDto);
}
