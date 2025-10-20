package com.mvit.placementservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvit.placementservice.models.Task;
import com.mvit.placementservice.repository.TaskRepository;

@Service
public class TaskService {
	private final TaskRepository taskRepository;
	public TaskService(TaskRepository taskRepository)
	{
		this.taskRepository = taskRepository;
	}
	
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

}
