package com.global.login.services.Impl;

import com.global.login.dao.TaskRepository;
import com.global.login.dto.TaskDto;
import com.global.login.dto.UpdateTaskDto;
import com.global.login.entities.Project;
import com.global.login.entities.Task;
import com.global.login.exception.ProjectException;
import com.global.login.services.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDto addTask(TaskDto taskDto) {

        try{
            TaskDto taskCurrent = new TaskDto();
            Project project = new Project();
            Task task = new Task();
            task.setName(taskDto.getName());
            task.setStatus(taskDto.getStatus());
            task.setProject(task.getProject());
            Task saveTask = taskRepository.save(task);
            TaskDto currentDto = modelMapper.map(saveTask, TaskDto.class);
            return currentDto;
        }catch (Exception e){
            throw new ProjectException(HttpStatus.NOT_FOUND,"enter Valid data");
        }
    }

    @Override
    public void deleteAllTask() {
        taskRepository.deleteAll();
    }

    @Override
    public Object updateTask(UpdateTaskDto updateTaskDto) {

        try {
            Task task = new Task();
            Long i = updateTaskDto.getId();
             Optional<Task> current = taskRepository.findById(i);
            if (current.isPresent()) {
                task.setId(updateTaskDto.getId());
                task.setName(updateTaskDto.getName());
                task.setStatus(updateTaskDto.getStatus());
                taskRepository.save(task);
            }
            throw new ProjectException(HttpStatus.NOT_FOUND,"you enter invalid id to update");

        }catch (NoSuchElementException e)
        {
             throw new ProjectException(HttpStatus.NOT_FOUND,"you enter invalid id to update");
         }
    }
}
