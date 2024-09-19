import java.util.Scanner;

public class IT24101660Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int count = 1;

        while (count <= 5) 
		{	 
            System.out.println("Customer " + count );
            
            System.out.print("Enter total bill amount: ");
            int totalBill = input.nextInt();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char letter = input.next().charAt(0);

           letter = Character.toLowerCase(letter);

        double discountA = totalBill * 5.0 / 100.0; 
        double amountAll = totalBill; 


        if (letter == 'c') 
		{  
            System.out.println("Discount is: " + discountA);
            amountAll = totalBill - discountA;
        } 
		else if (letter == 'o') 
		{
            System.out.println("No discount applicable.");
        } else 
		{
            System.out.println("Payment Mode is Not Valid");
			count++;
			System.out.println(" ");
            continue;
        }

        System.out.println("Amount to be paid: " + amountAll);
		System.out.println(" ");
		count++;
		}
		
	}
}

