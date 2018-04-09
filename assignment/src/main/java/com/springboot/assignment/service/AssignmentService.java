package com.springboot.assignment.service;


import com.springboot.assignment.model.OneArrayRequest;
import com.springboot.assignment.model.OneArrayResponse;

public interface AssignmentService {
	
	String  getFibonacciNumber(int n);
	String reverseWordsInSentence(String sentence);
	String getTriangleType(int side1,int side2, int side3);
	OneArrayResponse oneArrayresponse(OneArrayRequest request);

}
