package com.example.demo.conversion;

import com.example.demo.dao.Task;
import com.example.demo.dto.TaskDto;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TaskToTaskDtoConverter implements Converter<Task, TaskDto> {

	@Override
	public TaskDto convert (Task task) {
		TaskDto taskDto = new TaskDto();
		BeanUtils.copyProperties(task, taskDto);
		return taskDto;
	}
}
