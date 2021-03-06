package com.projectmanager.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author Sathiya
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectDTOTest {
	
	private ProjectDTO projectDTO = new ProjectDTO();
	
	@Test
	public void init() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] methods = projectDTO.getClass().getDeclaredMethods();
		if (methods != null && methods.length > 0) {
			for (Method method : methods) {
				if (method.getName().startsWith("is") 
						|| method.getName().startsWith("get")) {
					method.invoke(projectDTO);
				}
				if (method.getName().equals("setProjectCheckBox")) {
					method.invoke(projectDTO, true);
				} else if (method.getName().equals("setNoOfTasks") 
						|| method.getName().equals("setCompleted")) {
					method.invoke(projectDTO, 0);
				} else if (method.getName().startsWith("set")) {
					method.invoke(projectDTO, method.getDefaultValue());
				}
			}
		}
	}
	
}
