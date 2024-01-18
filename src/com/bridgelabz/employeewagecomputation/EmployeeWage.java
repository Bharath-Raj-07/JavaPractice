package com.bridgelabz.employeewagecomputation;
import java.lang.Math;
public class EmployeeWage{
    public static void main(String[] args) {
        int Full_time = 1;
        double empCheck = (Math.floor(Math.random() * 10) % 2);
        if (empCheck == Full_time) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }
    }
}
