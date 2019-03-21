package com.example.demo.conversion;

import com.example.demo.dao.Task;
import com.example.demo.dto.TaskDto;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoToTaskConverter implements Converter<TaskDto, Task> {

	@Override
	public Task convert (TaskDto taskDto) {
		Task task = new Task();
		BeanUtils.copyProperties(taskDto, task);
		return task;
	}
}
