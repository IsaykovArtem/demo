package com.example.demo;

import com.example.demo.dao.Task;
import com.example.demo.dao.TaskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith ( SpringRunner.class )
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	TaskRepository taskRepository;

	@Test
	public void contextLoads ( ) {
		taskRepository.save(new Task());
		taskRepository.getOne("1");
	}

}
