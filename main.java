package hw3;

import java.util.Scanner;
import java.util.*;

public class main {

	public static void main(String[] args) {
	
		        Scanner myScan=new Scanner(System.in);
		        int num;
		    do
		        {
		            System.out.print("Enter how many name(s) you have:");
		            num=myScan.nextInt();
		            myScan.nextLine();
		            if(num>5)
		            {
		                System.out.println("Sorry, you can’t have more than 5 names stored in our system! Enter -1 to exit this program.");
		            }
		        }while(num>5 && num!=-1);

		        if(num!=-1)
		        {
		            System.out.println("Enter your "+num+" names separated by * then hit the Enter Key:");
		            String[] array=myScan.nextLine().split("\\*");
		            
		            for(int i=0;i<array.length;i++)
		                array[i]=array[i].trim();
		            
		            List<String> names = new ArrayList<String>(Arrays.asList(array));
		            
		            Collections.sort(names,String.CASE_INSENSITIVE_ORDER);

		            System.out.println("Thank you!\nYou entered:");
		            System.out.print("[");
		            
		            for(String n:names)
		                System.out.print(n.toUpperCase()+",");
		            
		            System.out.println("\b]");

		            char choice ='y';
		            
		            while(choice=='y' || choice=='Y')
		            {
		                System.out.println("Do you want to make a change to any of the entered names (enter y/Y for yes or e/E to Exit program):");
		                choice = myScan.nextLine().charAt(0);
		               
		                if(choice =='y' || choice =='Y')
		                {
		                    System.out.print("Enter the name you would like to change:");
		                    String name=myScan.nextLine();

		                    if(names.contains(name))
		                    {
		                        System.out.print("Enter the new name:");                        
		                        String new_name=myScan.nextLine();		                    
		                        names.remove(name);
		                        names.add(new_name.trim());
		                        Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
		                        System.out.println("Got it! Here is the new list:");
		                        System.out.print("[");
		                           
		                        for(String s:names)
		                            {
		                                System.out.print(s.toUpperCase()+",");
		                            }
		                            
		                        System.out.println("]");
		                    }
		                    
		                    else
		                    {
		                        System.out.println("Sorry no such name in your list. Would you like to add \""+name+"\" to the list? enter y/Y for yes or n/N for no:");
		                        
		                        char addChoice=myScan.nextLine().charAt(0);
		                       
		                        if(addChoice=='y' || addChoice=='Y')
		                        {
		                            if(names.size()<5)
		                            {
		                                names.add(name.trim());
		                                Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
		                                System.out.println(name+" added to the list. Here is your new list:");
		                                System.out.print("[");
		                                    
		                                for(String s:names)
		                                    {
		                                        System.out.print(s.toUpperCase()+",");
		                                    }
		                                   
		                                System.out.println("\b]");
		                            }
		                            
		                            else
		                            {
		                                System.out.println("Sorry, you can’t add a new name as you already have 5 names!");
		                            }
		                        } 
		                    }
		                }
		                else
		                    System.out.println("GoodBye!");
		            }
		        }
		        
		        else
		        {
		            System.out.println("Bye!");
		        }
		    }
		}