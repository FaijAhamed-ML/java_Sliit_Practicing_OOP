package Que_01;

public class SalaryCalc {
    float BasicSalary;
    double OtHours;
    double Ot_Rate;
    int EmpType;
    double TotalSalary;

    SalaryCalc(double OtHours,float BasicSalary,int EmpType,double Ot_Rate){
        this.BasicSalary= BasicSalary;
        this.OtHours= OtHours;
        this.Ot_Rate= Ot_Rate;
        this.EmpType= EmpType;
    }

    public void salarycalculation(){
        TotalSalary=(double) BasicSalary+(OtHours*Ot_Rate);
    }

}