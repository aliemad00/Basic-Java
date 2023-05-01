import java.util.*;
/**
 * This java calculates hotel's days, restaurant, gym, services and prints them all.
 *
 * @author (Ali AL-Salihi)
 * @version (2020/08/21)
 */
public class Hotel
{
    //Definitions
    String Title;
    String Name;
    double hotelDays;
    double resCharges;
    double createCharges;
    double gymFees;
    double serviceCharges;
    double CalcStayCharges;
    double CalcMiscCharges;
    double CalcResCharges;
    double CalcCretCharges;
    double CalcGymCharges;
    double CalcServiceCharges;
    double PrintCharges;
    public Hotel()
    {
        System.out.println("\u000c");
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter your title: ");
        Title = in.nextLine();
        System.out.println("Please enter your name: ");
        Name = in.nextLine();
        System.out.println("Please enter the number of days spent in the hotel: ");     //Scanner to ask user the following details.
        hotelDays = in.nextDouble();
        System.out.println("Please enter the amount of restaurant charges: ");
        resCharges = in.nextDouble();
        System.out.println("Please enter the amount of recreational charges: ");
        createCharges = in.nextDouble();
        System.out.println("Please enter the amount of gym fees: ");
        gymFees = in.nextDouble();
        System.out.println("Please enter your the amount for service charges: ");
        serviceCharges = in.nextDouble();

        CalcStayCharges = hotelDays * 175;
        CalcResCharges = resCharges * 250;          //Calculations to be used later.
        CalcCretCharges = createCharges * 120;
        CalcGymCharges = gymFees * 105.5;
        CalcServiceCharges = serviceCharges * 233.45;

        CalcMiscCharges = CalcStayCharges + CalcResCharges + CalcCretCharges + CalcGymCharges + CalcServiceCharges;
        PrintCharges = CalcMiscCharges;

        System.out.println("Dear " + Title + " " + Name + ",");
        System.out.println("Please find below a cost-breakdown for your stay in our hotel. Please make payment at your earliest \nconvenience, and do not hesitate to contact me with any questions.");
        System.out.println("\nMany thanks,");
        System.out.println("Ali AL-Salihi\n");            //Printing the results in style.

        System.out.println(" # " + " Description " + "    Total($)" 
        + "\n 1. Room stay:      " + CalcStayCharges + " \n 2. Restaurant:     " + CalcResCharges + 
        "\n 3. Recreational:   " + CalcCretCharges + "\n 4. Gym:            " + CalcGymCharges + "\n 5. Service:        " + CalcServiceCharges + "\n\nTotal:              " + CalcMiscCharges);
        //Printing the calculations.
    }
}
