package day01;

import java.rmi.AccessException;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	         
	         int  a = 2;
	         int  b = 0;
	         
	         int c = a/b;
	         System.out.println(c);
	      } catch (Exception e) {
	    	  
	    	 System.out.println("The error  code is ");
	      }finally {
	    	  System.out.println("The  block  of  code  always  run ");
	      }
		
	   }
		
	}


