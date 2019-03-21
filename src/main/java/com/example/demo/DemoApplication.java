package com.example.demo;

import com.example.demo.dao.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class DemoApplication {


	public static void main (String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
