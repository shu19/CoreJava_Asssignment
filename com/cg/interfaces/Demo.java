package com.cg.interfaces;

/**
 * create interface "Game" , have an abstract method "play()". from this
 * interface define "Cricket" , "FootBall" and "Tennis". Now Define one more
 * class public class Demo In this class have a method "perform" which will take
 * interface reference as parameter.inside "perform()" see to it that any child
 * object passed ,its "play()" method should be invoked.
 * 
 * @author shuraut
 *
 */
public class Demo {

	public static void main(String[] args) {
		Game cricket=new Cricket();
		cricket.play();
		
		Game football=new FootBall();
		football.play();
		
		Game tennis=new Tennis();
		tennis.play();
		
		
	}

}
