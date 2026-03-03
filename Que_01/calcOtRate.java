package Que_01;

public class calcOtRate {
    double Ot_Rate;
    int EmpType;

    calcOtRate(int EmpType){
        this.EmpType = EmpType;
    }
    public void calcOtRate(){
        switch(EmpType){
            case 1:
                Ot_Rate=1000.0;
                break;
            case 2:
                Ot_Rate=1500.0;
                break;
            case 3:
                Ot_Rate=1700.0;
                break;
            default:
                System.out.println("Enter the correct value");
        }
    }
}
