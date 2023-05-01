import java.util.*;
/**
 * Write a description of class Income here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Income
{
    String userName;
    double netPay;
    double annualSalary;        //Definitions
    double taxAmount;
    double medicareLevy;
    public Income()
    {
        System.out.println("\u000c");
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter your name: ");
        userName = in.nextLine();                               //Scanner to ask for details to calculate.
        System.out.println("Please enter your annual salary: ");
        annualSalary = in.nextDouble();

        if (annualSalary >= 0 && annualSalary <= 18200)     //If the annual salary is between 0-18200 (0 and 18200 are included) then the following calculation will happen:
        {
            taxAmount = 0;      //Tax calculation
            medicareLevy = 0;   //Medicare levy calculation
        }
        else if (annualSalary >=18201 && annualSalary <=37000) //If the annual salary is between 18201-37000 (18201 and 37000 are included) then the following calculation will happen:
        {
            taxAmount = (annualSalary - 18200) * 0.19;  //Tax calculation
            medicareLevy = (2*annualSalary)/100;    //Medicare levy calculation
        }
        else if (annualSalary >=37001 && annualSalary <=90000) //If the annual salary is between 37001-90000 (37001 and 90000 are included) then the following calculation will happen:
        {
            taxAmount = 3572 + (annualSalary - 37000)*0.325;    //Tax calculation
            medicareLevy = (2*annualSalary)/100;    //Medicare levy calculation
        }
        else if (annualSalary >=90001 && annualSalary <=180000) //If the annual salary is between 90001-180000 (90001 and 180000 are included) then the following calculation will happen:
        {
            taxAmount = 20797+(annualSalary-90000)*0.37;    //Tax calculation
            medicareLevy = (2*annualSalary)/100;    //Medicare levy calculation
        }
        else if (annualSalary >=180001)     //If the annual salary is (greater than/equal to) to 180001 then the following calculation will happen:
        {
            taxAmount = 54097 + (annualSalary-180000) *0.45;    //Tax calculation
            medicareLevy = (2*annualSalary)/100;    //Medicare levy calculation
        }
        netPay = annualSalary - taxAmount - medicareLevy;   //Calculation for net payment
        System.out.println(userName + "\nTax payable: " + taxAmount + "\nMedicare levy: " + medicareLevy + "\nNet pay: " + netPay);
        //Printing the result in style.

    }

}
