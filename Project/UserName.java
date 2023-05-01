import java.util.*;
/**
 * This java reverses first name and last name with capitalizing the first latter.
 *
 * @author (Ali AL-Salihi)
 * @version (2020/08/21)
 */
public class UserName
{
    String firstName;
    String lastName;        //Definitions.
    String reverse;
    public UserName()
    {
        System.out.println("\u000c");
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter your first name: ");
        firstName = in.nextLine().trim();
        System.out.println("Please enter your last name: ");            //Scanner to ask user for name.
        lastName = in.nextLine().trim();

        int First = firstName.length();     
        for (int i = First - 1 ; i >= 0 ; i--)
        {
            if (i == 0)
                System.out.print(firstName.toUpperCase().charAt(i));        //Printing the first name (reversed) with uppercasing.
            else
                System.out.print(firstName.charAt(i));          //Lower case.

        }
        int Second = lastName.length();
        for (int k = Second - 1 ; k >= 0 ; k--)
        {
            if (k == 0)
                System.out.print(lastName.toUpperCase().charAt(k));         //Printing the last name (reversed) with uppercasing.
            else
                System.out.print(lastName.charAt(k));       //Lower case

        }
    }
}
