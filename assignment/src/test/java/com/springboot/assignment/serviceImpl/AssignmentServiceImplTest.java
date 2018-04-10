package com.springboot.assignment.serviceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.springboot.assignment.service.AssignmentService;



@RunWith(SpringRunner.class)
//@WebMvcTest(value = AssignmentServiceImpl.class, secure = false)
public class AssignmentServiceImplTest {
	

	 @InjectMocks
	 private static AssignmentService service = new AssignmentServiceImpl();

	
	
	@Test
	public void testFibonocciImpl_firstValue() throws Exception {
		String fibNo=service.getFibonacciNumber("1");
		assertThat(fibNo).isEqualTo("1");
			
		
	}
	@Test
	public void testFibonocciImpl_bigNum() throws Exception {
		String fibNo=service.getFibonacciNumber("100");
		assertThat(fibNo).isEqualTo("354224848179261915075");
			
		
	}

}
