package com.bridgelabz.employeewagecomputation;
import java.lang.Math;
public class EmployeeWage{
    public static final int Part_time=1;
    public static final int Full_time=2;
    public static final int PHRate=20;
    public static final int Num_work_days=2;
    public static void main(String[] args){
        int empHrs=0,empWage=0,totempWage=0;
        for(int day=0;day<Num_work_days;day++)
        {
            int empCheck;
            empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck)
            {
                case Part_time:
                    empHrs = 4;
                    break;
                case Full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * PHRate;
            totempWage+=empWage;
            System.out.println("Emp Wage: "+empWage);
        }
        System.out.println("Total Emp Wage: "+totempWage);
    }
}