package com.bridgelabz.employeewagecomputation;
import java.lang.Math;
public class EmployeeWage{
    public static void main(String[] args){
        int Part_time=1;
        int Full_time=2;
        int PHRate=20;
        int empHrs=0,empWage=0;
        double empCheck;
        empCheck = (Math.floor(Math.random()*10)%3);
        if (empCheck == Part_time)
        {
            empHrs=4;
        }
        else if (empCheck == Full_time)
        {
            empHrs=8;
        }
        else
        {
            empHrs=0;
        }
        empWage=empHrs*PHRate;
        System.out.println("Emp Wage: "+empWage);
    }
}