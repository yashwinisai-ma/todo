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

	public void createTask(String title) {
		Task task = new Task();
		task.setTitle(title);
		task.setCompleted(false);
		taskRepository.save(task);
		
	}

	public void deleteTask(Long id) {
		taskRepository.deleteById(id);
		
	}

	public void toggleTask(Long id) {
		Task task = new taskRepository.findAllById(id) 
				.orElseThrow(() => new IllegalArgumentException("Invalid task id"));
		task.setCompleted(!task.isCompleted());
		taskRepository.save(task);
	}

}
