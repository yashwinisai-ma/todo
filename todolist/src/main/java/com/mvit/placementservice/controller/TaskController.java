package com.mvit.placementservice.controller;
import com.mvit.placementservice.models.Task;
import com.mvit.placementservice.services.TaskService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
//@RequestMapping("\tasks")
public class TaskController {
	private final TaskService taskService;
	public TaskController(TaskService taskService)
	{
		this.taskService = taskService;
	}
	@GetMapping
	public String getTask(Model model)
	{
		List<Task> tasks = taskService.getAllTasks();
		model.addAttribute("tasks", tasks);
		return "tasks";
	}
}
