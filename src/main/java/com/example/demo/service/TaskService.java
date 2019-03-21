package com.example.demo.service;

import com.example.demo.dao.Task;
import com.example.demo.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;

	public List<Task> getAll() {
		return taskRepository.findAll();
	}

	public Optional<Task> get(String id) {
		return taskRepository.findById(id);
	}

	public Task save(Task task) {
		return taskRepository.save(task);
	}

	public void delete(String id) {
		taskRepository.deleteById(id);
	}
}
