package com.globallogic.bootcampgl.junitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test

	void test() {
		
	String s1= "MyTest";
	String s2= "MyTest";
	String s3= "Test";
	
	assertEquals(s1,s2, "Son iguales");
	assertNotEquals(s1,s3, "Son diferentes");
	
	}
}
