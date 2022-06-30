package com.bridgelabz.emp_wage;

public class Emp_wage_computation {

	public static void main(String[] args) {
		 final int FULL_TIME = 1;
	        int empType = (int) (Math.random() * 10) % 2;
	        if (empType == FULL_TIME)
	        {
	            System.out.println("Employee is Present");

	        } else
	        {
	            System.out.println("Employee is Absent");
	}

}
}