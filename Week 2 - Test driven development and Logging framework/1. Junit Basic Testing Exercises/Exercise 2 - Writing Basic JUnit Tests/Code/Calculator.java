package com.example.junit_basics;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		if (b == 0) {
	        throw new IllegalArgumentException("Cannot divide by zero");
	    }
	    return a / b;
	}
}
