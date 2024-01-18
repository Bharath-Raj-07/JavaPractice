package com.bridgelabz.employeewagecomputation;
import java.lang.Math;
public class EmployeeWage{
    public static final int Part_time=1;
    public static final int Full_time=2;
    public static final int PHRate=20;
    public static final int Num_work_days=2;
    public static final int Max_hp_month=10;
    public static void main(String[] args){
        int empHrs=0,totempHrs=0,totworkdays=0;
        while(totempHrs <= Max_hp_month && totworkdays < Num_work_days)
        {
            totworkdays++;
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
            totempHrs += empHrs;
            System.out.println("Day#: "+totworkdays+" Emp Hr: "+empHrs);
        }
        int totempWage=totempHrs*PHRate;
        System.out.println("Total Emp Wage: "+totempWage);
    }
}