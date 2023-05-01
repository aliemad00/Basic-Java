import java.util.*;
/**
 * This java reveals if the month is in first, or second, or third or fourth quarter in the year.
 *
 * @author (Ali AL-Salihi)
 * @version (2020/08/21)
 */
public class Boolean
{
    int Month;          //Definition
    public Boolean()
    {
        System.out.println("\u000c");
        Scanner in = new Scanner (System.in);
        System.out.println("Please input a month: ");       //Scanner to ask the user to enter a month.
        Month = in.nextInt();

        if (Month <=3 && Month >=0)         //If the month is between 0-3 (0 and 3 included) then the following will be printed:
        {
            System.out.println("The month is in the first quarter.");
        }
        else if (Month <=6 && Month >=4)    //If the month is between 4-6 (4 and 6 included) then the following will be printed:
        {
            System.out.println("The month is in the second quarter.");
        }
        else if (Month <=9 && Month >=7)    //If the month is between 7-9 (7 ad 9 included) then the following will be printed:
        {
            System.out.println("The month is in the third quarter.");
        }
        else if (Month <=12 && Month >=10)  //If the month is between 10-12 (10 and 12 included) then the following will be printed:
            System.out.println("The month is in the fourth quarter.");
    
    else {          //If the month is less than 0 (i.e -1,-2,-3...) or greater than 12 (i.e 13,14,15,16...) then the following will be printed:
        System.out.println("Error.");
    }
}
}

