import java.util.*;
import java.io.*;
/**
 * Extracts Story txt file without names.
 *
 * @author (Ali AL-Salihi)
 * @version (2020/08/21)
 */
public class Arrays
{
    static String[] studentsNames = {"Henry", "Ahmed", "Tamanna", "Ali", "Abdullah", "Saakib", "Laksh", "James", "Kritika", "Viriya", "Sachintha", "Max", "Zay", "Khounkham","Harman", "Su", "Arran", "Anthony", "Nguyen", "Ahsan", "Nathan", "Tami", "Karthick", "Bikash", "Siron", "Bhumi", "Hien ", "Kim", "Johnny", "Aman"};
    //Definition for the targetted names.
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        try 
        {
            System.out.println("\u000c");
            File inputFile = new File ("Story.txt");        //Importing the Story external text file
            Scanner inFile = new Scanner (inputFile);
            ArrayList<String> sentences = new ArrayList<>();        //Assigning the arrays
            int i;
            while (inFile.hasNext())
            {
                sentences.add(inFile.next());       //Sentences = the rest of the words of the story. This line reads word by word till a name was found.
            }
            for (String allNames : studentsNames) {             //Assigning the studentsNames to allNames.

                for (i=0; i<sentences.size(); i++) {
                    if (sentences.get(i).equalsIgnoreCase(allNames)) {      //If allNames was found/read then the following will happen.
                        sentences.remove(i);                    //Remove allNames
                    }
                }
            }

            FileWriter Output=new FileWriter("OriginalStory.txt");      //Exporting into a file called 'OriginalStory.txt'.
            try (BufferedWriter Out = new BufferedWriter(Output)) {     //Export the result
                String data;
                for (i=0;i<sentences.size();i++)
                {
                    data = (sentences.get(i))+" ";
                    Out.write(data);            //Write the result
                }

            }

            System.out.println("Extracting done!!! Please check the 'OriginalStory.txt' file for the result."); }       //Printing the sentence

        catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");          //If the file was not found.
        }

    }
}

