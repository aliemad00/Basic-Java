import java.util.*;
/**
 * This java shapes numbers in square and the number of rows are depended on users input.
 *
 * @author (Ali AL-Salihi)
 * @version (2020/08/21)
 */
public class Repetition
{
    int rows;
    public Repetition()
    {
        System.out.println("\u000c");
        Scanner in = new Scanner (System.in);
        System.out.println ("Please enter the number of rows: ");       //Scanner to request for number of rows.
        rows = in.nextInt();

        //Print the number of rows entered by the user in a square shape of 0,1 values with the if statement.
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= rows; j++)
            {
                if (j == i)
                {
                    System.out.print("1 "); 
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }

}
