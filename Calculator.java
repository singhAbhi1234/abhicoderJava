package com.example.utils;
import com.example.geometry.*;
class Calculator {
	public static void main(String[] args) {
		Circle circle=new Circle(10);
		Rectangle rect=new Rectangle(10.5,5);
		
		double circleArea=Math.PI*Math.pow(circle.radius, 2);
		double rectArea=rect.length*rect.width;
		
		System.out.printf("the area of circle is %f%n the area of rectangle is %f",circleArea,rectArea);
	}
	
	

}
