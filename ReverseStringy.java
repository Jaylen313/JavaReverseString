
import java.util.Scanner;

public class ReverseStringy {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
         
        

         
         
        System.out.println("Type in a String = ");
        String UserInput = scan.nextLine();

        char[] Array = UserInput.toCharArray();
        
        int i,j;

        for(i = 0, j = Array.length - 1; i < j; i++, j-- )
        {
            char holder = Array[i];
            Array[i] = Array[j];
            Array[j] = holder;
        }


        String BackWardsString = new String(Array);

        System.out.println("Your output reversed: "+ BackWardsString);
           

        scan.close();


    }
}
