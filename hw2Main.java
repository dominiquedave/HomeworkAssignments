import java.util.Arrays;
import java.util.Scanner;

public class hw2Main {

		public static void main(String[] args) {

			while (true)
			{
				System.out.println("Choose from the following options:");

				System.out.println("A or a: To display the divisors of a natural number");

				System.out.println("B or b: To display the multiplication table for a natural number");

				System.out.println("Q or q Exit");

				System.out.println("");
				System.out.print("Enter your choice: ");	

				
				Scanner myScan = new Scanner(System.in);
				char choice = myScan.next().charAt(0);
			
				
				switch(choice)
				{
				
					case ('a') :
						
						System.out.println();
						System.out.print("Enter your number: ");
						int num = myScan.nextInt();
						
						if(num > 0)
						{				
							    boolean flag = false;
							    for (int i = 2; i <= num / 2; ++i) {
							      // condition for nonprime number
							      if (num % i == 0) {
							        flag = true;
							        break;
							      }
							    }

							    if (!flag)
							    {
							    	System.out.print(num + " is prime ");
							    	System.out.print( "(The only divisors of " + num + " are 1 and " + num + ")");
							    }
					
							    else
							    {
							    	System.out.print("The divisors of " + num + " are ");
							    	
							    	int i = 1;
							    	do {
							    		
							    		if (num %i==0)
								        {
								          System.out.print(i+ ",");
								        }
							    		i++;
							    	}while(i< num);
							    	
							    	System.out.print(" and " + num);
								   
							    }					
						}
						
						else {
							System.out.println( num + " is not a natural number");
							System.out.println( "");
						}
						
						System.out.println( "");
						System.out.println("");
					break;
					
					
					case('A'):
						
						
					System.out.print("Enter your number: ");
					int number = myScan.nextInt();
					
					if(number > 0)
					{				
						    boolean flag = false;
						    for (int i = 2; i <= number / 2; ++i) {
						      // condition for nonprime number
						      if (number % i == 0) {
						        flag = true;
						        break;
						      }
						    }

						    if (!flag)
						    {
						    	System.out.print(number + " is prime ");
						    	System.out.print( "(The only divisors of " + number + " are 1 and " + number + ")");
						    }
				
						    else
						    {
						    	System.out.print("The divisors of " + number + " are ");
						    	
						    	int i = 1;
						    	do {
						    		
						    		if (number % i==0)
							        {
							          System.out.print(i+ ",");
							        }
						    		i++;
						    	}while(i< number);
						    	
						    	System.out.print(" and " + number);
							   
						    }					
					}
					
					else {
						System.out.println( number + " is not a natural number");
						System.out.println( "");
					}
					
					System.out.println("");
					System.out.println("");
					
						break;
					
		
					case ('b'):
						
						System.out.print("Enter your number: ");
						int numb = myScan.nextInt();
						
						if(numb > 0)
						{
							System.out.println("Enter the size of the multiplication table (1,2…etc): ");
							int size = myScan.nextInt();
							
					        for(int i = 1; i <= size; ++i)
					        {
					            System.out.printf("%d x %d = %d \n", i, numb, numb * i);
					        }
					        
					        
							System.out.println("");
						}
						
						else
						{
							System.out.println( numb + " is not a natural number");
							
						}
					
						System.out.println( "");
						System.out.println("");
					break;
					
					
					case('B'):

						System.out.print("Enter your number: ");
						int n = myScan.nextInt();
						
						if(n > 0)
						{
							System.out.print("Enter the size of the multiplication table (1,2…etc): ");
							int size = myScan.nextInt();
							
					        for(int i = 1; i <= size; ++i)
					        {
					            System.out.printf("%d x %d = %d \n", i, n, n * i);
					        }
					        
					        
							;
						}
						
						else
						{
							System.out.println( n + " is not a natural number");
						
							
						}
					
						System.out.println("");
						System.out.println("");
						
					break;
					
					
					
					case('q'): case('Q'): 
						
						System.out.println(" Bye!");
						System.exit(0);
					
						
					
					

						System.out.println(" Bye!");
						System.exit(0);
					
					default:
						System.out.println( "Invalid option!");
						System.out.println( "");
						System.out.println("");
						
			}
			
			}
			
			
			
			}
}
			
			
			
			
		

	

