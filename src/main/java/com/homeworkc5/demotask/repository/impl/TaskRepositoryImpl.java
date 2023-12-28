package com.homeworkc5.demotask.repository.impl;

import com.homeworkc5.demotask.dto.request.TaskDtoRequest;
import com.homeworkc5.demotask.entities.Task;
import com.homeworkc5.demotask.repository.TaskRepository;

public class TaskRepositoryImpl implements TaskRepository {
    private static final String INSERT_INTO_TASK = "INSERT INTO task (title, description, date) values (?, ?, ?)";
    @Override
    public void add(TaskDtoRequest taskDtoRequest) {
        Task task = mapTaskDtoRequestToTask(taskDtoRequest);

    }

    @Override
    public void getAll() {

    }

   private Task mapTaskDtoRequestToTask(TaskDtoRequest taskDtoRequest){
        Task task = new Task();
        task.setTitle(taskDtoRequest.getTitle());
        task.setDescription(taskDtoRequest.getDescription());
        task.setDueDate(taskDtoRequest.getDueDate());
        return task;
   }
}
