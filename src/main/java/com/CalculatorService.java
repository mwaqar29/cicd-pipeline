package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

	@GetMapping("/add")
	public int add(int a, int b) {
		return a+b;
	}
	
	@GetMapping("/subtract")
	public int subtract(int a, int b) {
		return a-b;
	}
	
	@GetMapping("/multiply")
	public int multiply(int a, int b) {
		return a*b;
	}
	
	@GetMapping("/divide")
	public int divide(int a, int b) {
		return a/b;
	}
	
	@GetMapping("/power")
	public int power(int a, int b) {
		return (int) Math.pow(a,b);
	}
	
	@GetMapping("/squareRoot")
	public double squareRoot(int a) {
		return Math.sqrt(a);
	}
}
