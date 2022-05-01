package com.dxc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dxc.staticuse.Teacher;

@Configuration
@ComponentScan(basePackages = "com.dxc.javaconfig") // for Student class only 
public class JavaConfig {
	
	@Bean											//for Teacher class only
	public Teacher getTeacherObj() {
		Teacher teacher = new Teacher();
		return teacher;
	}

}
