package com.example.demo.controller;

import com.example.demo.dao.Task;
import com.example.demo.dto.TaskDto;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	TaskService taskService;

	@Autowired
	ConversionService conversionService;

	@GetMapping("/")
	public List<TaskDto> getAll ( ) {
		List<Task> tasks = taskService.getAll();
		List<TaskDto> result = new ArrayList<>();
		tasks.forEach(task ->
				result.add(
						conversionService.convert(task, TaskDto.class)));
		return result;
	}


	@GetMapping("/create")
	public TaskDto create(@RequestParam(name = "name") String name) {
		TaskDto taskDto = new TaskDto();
		taskDto.setName(name);

		Task convert = conversionService.convert(taskDto, Task.class);
		Task task = taskService.save(convert);

		TaskDto result = conversionService.convert(task, TaskDto.class);
		return result;
	}
}
