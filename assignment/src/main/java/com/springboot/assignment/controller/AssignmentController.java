package com.springboot.assignment.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import com.springboot.assignment.model.OneArrayRequest;
import com.springboot.assignment.model.OneArrayResponse;
import com.springboot.assignment.service.AssignmentService;

@RestController
@EnableAutoConfiguration
@ComponentScan("com.springboot.assignment.*")
@RequestMapping("/api")
public class AssignmentController {

	@Autowired
	private AssignmentService service;

	@RequestMapping(value="/Fibonacci",method=RequestMethod.GET,produces = "application/json; charset=utf-8")
	public String getFibonacciNumber( @RequestParam(value="n") String n ) {
		return service.getFibonacciNumber(n);
	}
	@RequestMapping(value="/ReverseWords",method=RequestMethod.GET, produces = "application/json; charset=utf-8")
	public String reverseWordsInSentence(HttpServletRequest request, HttpServletResponse response,@RequestParam("sentence") String sentence) {
		return service.reverseWordsInSentence(sentence);
	}
	@RequestMapping(value="/TriangleType",method=RequestMethod.GET, produces = "application/json; charset=utf-8")
	public String getTriangleType(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("a") String side1,
			@RequestParam("b") String side2,
			@RequestParam("c") String side3) {
		return service.getTriangleType(side1,side2,side3);
	}
	@RequestMapping(value="/makeonearray",method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public  OneArrayResponse oneArrayResponse(HttpServletRequest request, HttpServletResponse response,@RequestBody OneArrayRequest list) {
		return service.oneArrayresponse(list);

	}

}