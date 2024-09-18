import java.util.Scanner;

public class IT24101660Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int totalMarks = 0; 

        
        while (count <= 4) {
            System.out.print("Enter Subject Mark " + count + ": ");
            int number = input.nextInt();
            totalMarks += number; 
            count++;
        }

        
        double averageAll = totalMarks / 4.0; 

       
        System.out.println("Average is: " + averageAll);
            if (averageAll>=75 && averageAll<=100 )
			{
				System.out.print("Overall Grade is : Distinction");
			}
			else if (averageAll>=50 && averageAll<= 74)
			{
				System.out.print("Overall Grade is : Credit");
			}
			else if (averageAll>=0 && averageAll<= 49)
			{
		        System.out.print("Overall Grade is : Fail");
			}
			
    }
}
