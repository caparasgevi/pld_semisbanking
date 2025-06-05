package pld.semis_banking;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
/**
 *
 * @author Mark Gevi S. Caparas / BSCPE - 1A
 */
public class PLDSEMIS_BANKING {
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    //acc variables
	double bal, svngs;
	String cstmrName, pin, accname, accpin, accnum;
        BufferedWriter writer = null;
        
        //start
        System.out.println("==================================");
        System.out.println(">>> Register your Bank Account <<<");
        System.out.println("==================================");
        System.out.print("Enter your Name: ");
        cstmrName = input.nextLine();
        System.out.print("Enter your pin: ");
        pin = input.nextLine();
        System.out.print("Enter your Account Number: ");
        accnum = input.nextLine();
        System.out.print("Enter Initial Balance: Php ");
	bal = input.nextDouble();
	System.out.print("Enter Initial Savings: Php ");
	svngs = input.nextDouble();

        System.out.print("\033[2J\033[1;1H");
        input.nextLine();
        System.out.println("==================================");
        System.out.println(">>>>> Open your Bank Account <<<<<");
        System.out.println("==================================");
        System.out.println();
	System.out.print("Account name: ");
	accname = input.nextLine();
        System.out.print("Enter your pin: ");
        accpin = input.nextLine();
		
		if (accname.equals(cstmrName) && accpin.equals(pin))
	{		
		int slc;
	
	do{
	System.out.println();
	
	System.out.println("Good day, " + cstmrName +"!");
        System.out.println("Welcome to Philippines Bank.");
	System.out.println("Account Balance: Php " + bal);
	System.out.println("Account Savings: Php " + svngs);
        System.out.println();
	System.out.println("What would you like to do?");
		
	System.out.println("1. Withdraw");
	System.out.println("2. Deposit");
	System.out.println("3. Money transfer");
	System.out.println("4. Bills Payment");
	System.out.println("5. Exit Program ");
		
	System.out.print("Your selection: ");
	slc = input.nextInt();
		
        
        try {
            writer = new BufferedWriter(new FileWriter("Finals Banking Account.txt", true));
            
            writer.write( "Account name: " + cstmrName );
            writer.newLine();
            
            writer.write( "Account number: " + accnum );
            writer.newLine();
            
            writer.write( "Balance: " + bal );
            writer.newLine();
writer.write( "Savings: " + svngs);
            writer.newLine();
            writer.newLine();
            writer.newLine();
            
            writer.close();
           
        } catch (IOException e)
        
        {
            e.printStackTrace();
        }
        
		switch (slc){
		    case 1:
		    {
		         int sls;
		         double with1;
		         double with2;
		         
		         
		         System.out.print("\033[2J\033[1;1H");
		         System.out.println("You are now withdrawing money from your account.");
		         System.out.println();
		         System.out.println("\t\tBalance details:");
		         System.out.println("\t==============================");
		         System.out.println("\t Balance: " + bal );
		         System.out.println("\t Savings Account: " + svngs );
		         System.out.println("\t==============================");
		         System.out.println();
		         System.out.println("Where would you like to withdraw?");
		         System.out.println("1. Balance");
		         System.out.println("2. Savings");
		         System.out.print("Selection: ");
		         sls = input.nextInt();
		         
		             switch (sls){
		                 case 1:
		                 { System.out.println();
		                 System.out.print("How many would you like to withdraw? Php ");
		                 with1 = input.nextDouble();
		                     { if (with1 > bal)
		                         {System.out.println();
		                         System.out.println("Oops! It seems like that you are trying to withdraw more than the money in your Balance. Please try again.");
		                         break;}// if condition end
		                       else 
		                         { System.out.println();
		                         bal = bal - with1;
		                         System.out.println("You have successfully withdrawn Php " + with1 + " from your account.");
		             System.out.println();
		             System.out.println("Current Balance: Php " + bal );
		             System.out.println("Current Savings: Php " + svngs );
		             System.out.println();
		                         break;}// else end
		                         }// nested if else end
		                 
		                 
		                 
		                 }//inner case1 end
		                 
		                 case 2:
		                 {System.out.println();
		                 System.out.print("How many would you like to withdraw? Php ");
		                 with2 = input.nextDouble();
		                     { if (with2 > svngs)
		                        {System.out.println();
		                         System.out.println("Oops! It seems like that you are trying to withdraw more than the money in your Savings. Please try again.");
		                         break;}// if condition end
		                         else 
		                         { System.out.println();
		                         svngs = svngs - with2;
		                         System.out.println("You have successfully withdrawn Php " + with2 + " from your account.");
		                System.out.println();
		                System.out.println("Current Balance: Php " + bal );            
   	                        System.out.println("Current Savings: Php " + svngs );
		                System.out.println();
		                        break;}// else end
		                         }// nested if else end
		                 
		                 
		                 }// inner case2 end
		                 
		                 default:
		                 {   System.out.println("Invalid. Try again. \n\n " );
		                 break;}//default end
		                 
		                 
		                 }//inner² switch end
		         
		         
		       
		         
		         
		         //codebody
		        break;}// inner case1 end
		        
		         
		    //DEPOSIT START
		    case 2:
		    {
		         int slcs;
		         double dep1 = 0.0;
		         double dep2 = 0.0;
		         
		       
		         System.out.print("\033[2J\033[1;1H");
		         System.out.println("You are now depositing money from your account.");
		         System.out.println();
		         System.out.println("\t\tBalance details:");
		         System.out.println("\t==============================");
		         System.out.println("\t Balance: " + bal );
		         System.out.println("\t Savings Account: " + svngs );
		         System.out.println("\t==============================");
		         System.out.println();
		         System.out.println("Where would you like to deposit?");
		         System.out.println("1. Balance");
		         System.out.println("2. Savings");
		         System.out.print("Selection: ");
		         slcs = input.nextInt();
		         
		             switch (slcs){
		                 case 1:
		                 {System.out.println();
		                  System.out.print("How much would you like to deposit? Php ");
		                 dep1 = input.nextDouble();
		                     
		                     bal = bal + dep1;
		                     
		                     
		                     System.out.println("You have succesfully deposited " + dep1 + " into your Balance." );
		                     System.out.println();
		                     System.out.println("Current account details: ");
		                     System.out.println("Balance: Php " + bal);
		                     System.out.println("Savings: Php " + svngs);
		                     
		                     break;
		                 
		                 }//inner case1 end
		                 
		                 
		                 case 2:
		                 {System.out.println();
		                  System.out.print("How much would you like to deposit? Php ");
		                 dep2 = input.nextDouble();
		                     
		                     svngs = svngs + dep2;
		                     
		                     
		                     System.out.println("You have succesfully deposited " + dep1 + " into your Savings." );
		                     System.out.println();
		                     System.out.println("Current account details: ");
		                     System.out.println("Balance: Php " + bal);
		                     System.out.println("Savings: Php " + svngs);
		                     
		                     break;
		                 
		                 }//inner case2 end
		                
		                 default:
		                 {   System.out.println("Invalid. Try again. \n\n " );
		                 break;}//default end 
		                 
		             }// inner² switch end
		         
		         
		         //codebody
		        break;}
		        
		    case 3:
		    {
		         int slcss;
		         double transfer;
		         
		         System.out.print("\033[2J\033[1;1H");
		         System.out.println("You are now transferring money within your account.");
		         System.out.println();
		         System.out.println("\t\tBalance details:");
		         System.out.println("\t==============================");
		         System.out.println("\t Balance: " + bal );
		         System.out.println("\t Savings Account: " + svngs );
		         System.out.println("\t==============================");
		         System.out.println();
		         System.out.println("Where would you like to transfer?");
		         System.out.println("1. Balance >> Savings");
		         System.out.println("2. Savings >> Balance");
		         System.out.print("Selection: ");
		         slcss = input.nextInt();
		         
		         
		         switch (slcss)
		         {  
		          case 1:
		                 {System.out.println();
		                  System.out.print(" How much would you like to transfer? Php ");
		                    transfer = input.nextDouble();
		                     
		                    if (transfer > bal)
		                     {System.out.println("Your amount is higher than your existing balance. Try again.");
		                     break;}
		                     
		                    else 
		                     { bal = bal - transfer;
		                       svngs = svngs + transfer;
		                       
		                       System.out.println();
		                       System.out.println("You successfully transferred Php " + transfer + " to your Savings Account.");
		                       System.out.println();
		                       System.out.println("Current account details: ");
		                     System.out.println("Balance: Php " + bal);
		                     System.out.println("Savings: Php " + svngs);
		                     break;}// end of else
		                     
		                 }// end of case1
		                 
		                 
		                 case 2:
		                 {System.out.println();
		                  System.out.print(" How much would you like to transfer? Php ");
		                    transfer = input.nextDouble();
		                     
		                    if (transfer > svngs)
		                     {System.out.println("Your amount is higher than your existing savings. Try again.");
		                     break;}// end of if
		                     
		                    else 
		                     { bal = bal + transfer;
		                       svngs = svngs - transfer;
		                       
		                       System.out.println();
		                       System.out.println("You successfully transferred Php " + transfer + " to your Balance.");
		                       System.out.println();
		                       System.out.println("Current account details: ");
		                     System.out.println("Balance: Php " + bal);
		                     System.out.println("Savings: Php " + svngs);
		                     break;}// end of else
		                     
		                 }// end of case2
		                
		                 
		         }// end of switch (slcss)
		             
		                     
		                     
		         //codebody
		        break;}
		        
		     // BILLS PAYMENT START
		    case 4:
		    {   
		         int slcz;
		         double payment;
		       
		         
		         System.out.print("\033[2J\033[1;1H");
		         System.out.println();
		         System.out.println("You are now paying bills with your account.");
		         System.out.println();
		         System.out.print("Bills must be paid in exact amount or it will not be valid.");
		         System.out.println();
		         System.out.println();
		         System.out.println("\t\tBalance details:");
		         System.out.println("\t==============================");
		         System.out.println("\t Balance: " + bal );
		         System.out.println("\t Savings Account: " + svngs );
		         System.out.println("\t==============================");
		             System.out.print("");
		             System.out.println();
		             System.out.println("Please select what bill are you paying.");
		             System.out.println("1. Electricity Bill");
		            System.out.println("2. Water Supply");
		            System.out.println("3. Internet Bill");
		            System.out.println("4. Monthly Rent");
		            System.out.print("Selection: ");
		            slcz = input.nextInt();
		            
		            switch (slcz)
		            {
		                
		                case 1:
		                { int inslc;
		                System.out.println();
		                  System.out.println("You have selected: Electricity Bill.");
		                System.out.println("The electricity bill is Php 1500.");
		                System.out.println("");
		                System.out.println("What account are you using to pay the bills? ");
		                System.out.println("1. Balance");
       		         System.out.println("2. Savings");
       		         System.out.print("Selection: ");
		                inslc = input.nextInt();     
		                
		                 switch (inslc)   
		                 {
		                     case 1: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > bal)
		                         {System.out.println("You are trying to pay an amount greater than your existing balance. Try again.");
		                         break;}
		                       else if ( payment < 1500)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 1500)
		                        { 
		                        bal = bal - payment;
		                        payment = payment - 1500;
		                        bal = bal + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 1500 from your Balance. \n Any amount beyond Php 1500 is added back to your Balance");
		                        break;}
		                       else 
		                         { bal = bal - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Balance.");
		                         break;}
		                     }// if else if ladder end
		                     }// case1 end

                            case 2: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > svngs)
		                         {System.out.println("You are trying to pay an amount greater than your exisiting savings. Try again.");
		                         break;}
		                       else if ( payment < 1500)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                        break; }
		                       else if (payment > 1500)
		                        { 
		                        svngs = svngs - payment;
		                        payment = payment - 1500;
		                        svngs = svngs + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 1500 from you Savings. \n Any amount beyond Php 1500 is added back to your Savings.");
		                        break;}
		                       else 
		                         { svngs = svngs - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Savings.");
		                         break;}
		                     }// if else if ladder end
		                     }// case2 end

                            default:
                            { System.out.println("Invalid selection.");
                            break;}

		                 }// inner switch end    
		                }// outer case1
		                
		                
		                break; // break to prevent loading other conditions
		                
		                case 2:
		                
		                {int inslc;
		                System.out.println();
		                  System.out.println("You have selected: Water Supply.");
		                System.out.println("The Water Supply Bill is Php 500.");
		                System.out.println("");
		                System.out.println("What account are you using to pay the bills? ");
		                System.out.println("1. Balance");
       		         System.out.println("2. Savings");
       		         System.out.print("Selection: ");
		                inslc = input.nextInt();     
		                
		                 switch (inslc)   
		                 {
		                     case 1: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > bal)
		                         {System.out.println("You are trying to pay an amount greater than your existing balance. Try again.");
		                         break;}
		                       else if ( payment < 500)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 500)
		                        { 
		                        bal = bal - payment;
		                        payment = payment - 500;
		                        bal = bal + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 500 from your Balance. \n Any amount beyond Php 500 is added back to your Balance");
		                        break;}
		                       else 
		                         { bal = bal - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Balance.");
		                         break;}
		                     }// if else if ladder end
		                     }// case1 end

                            case 2: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > svngs)
		                         {System.out.println("You are trying to pay an amount greater than your exisiting savings. Try again.");
		                         break;}
		                       else if ( payment < 500)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 500)
		                        { 
		                        svngs = svngs - payment;
		                        payment = payment - 500;
		                        svngs = svngs + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 500 from you Savings. \n Any amount beyond Php 500 is added back to your Savings.");
		                        break;}
		                       else 
		                         { svngs = svngs - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Savings.");
		                         break;}
		                     }// if else if ladder end
		                    }// case2 end

                            default:
                            { System.out.println("Invalid selection.");
                            break;}

		                 }// inner switch end    
		               }// outer case2
		                
		         break; // break to prevent loading other conditions
		         
		         case 3:
		                
		                {int inslc;
		                System.out.println();
		                  System.out.println("You have selected: Internet Bill.");
		                System.out.println("The Internet Bill is Php 2500.");
		                System.out.println("");
		                System.out.println("What account are you using to pay the bills? ");
		                System.out.println("1. Balance");
       		         System.out.println("2. Savings");
       		         System.out.print("Selection: ");
		                inslc = input.nextInt();     
		                
		                 switch (inslc)   
		                 {
		                     case 1: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > bal)
		                         {System.out.println("You are trying to pay an amount greater than your existing balance. Try again.");
		                         break;}
		                       else if ( payment < 2500)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 2500)
		                        { 
		                        bal = bal - payment;
		                        payment = payment - 2500;
		                        bal = bal + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 2500 from your Balance. \n Any amount beyond Php 2500 is added back to your Balance");
		                        break;}
		                       else 
		                         { bal = bal - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Balance.");
		                         break;}
		                     }// if else if ladder end
		                     }// case1 end

                            case 2: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > svngs)
		                         {System.out.println("You are trying to pay an amount greater than your exisiting savings. Try again.");
		                         break;}
		                       else if ( payment < 2500)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 2500)
		                        { 
		                        svngs = svngs - payment;
		                        payment = payment - 2500;
		                        svngs = svngs + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 2500 from you Savings. \n Any amount beyond Php 2500 is added back to your Savings.");
		                        break;}
		                       else 
		                         { svngs = svngs - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Savings.");
		                         break;}
		                     }// if else if ladder end
		                    }// case2 end

                            default:
                            { System.out.println("Invalid selection.");
                            break;}

		                 }// inner switch end    
		               }// outer case3
		               
		               break;// to prevent loading other conditions
		               
		               case 4:
		               {int inslc;
		                System.out.println();
		                  System.out.println("You have selected : Monthly Rent.");
		                System.out.println("The Monthly Rent is Php 3000.");
		                System.out.println("");
		                System.out.println("What account are you using to pay the bills? ");
		                System.out.println("1. Balance");
       		         System.out.println("2. Savings");
       		         System.out.print("Selection: ");
		                inslc = input.nextInt();     
		                
		                 switch (inslc)   
		                 {
		                     case 1: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > bal)
		                         {System.out.println("You are trying to pay an amount greater than your existing balance. Try again.");
		                         break;}
		                       else if ( payment < 3000)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 3000)
		                        { 
		                        bal = bal - payment;
		                        payment = payment - 3000;
		                        bal = bal + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 3000 from your Balance. \n Any amount beyond Php 3000 is added back to your Balance");
		                        break;}
		                       else 
		                         { bal = bal - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Balance.");
		                         break;}
		                     }// if else if ladder end
		                     }// case1 end

                            case 2: 
		                     { System.out.print("Enter your payment: ");   
		                     payment = input.nextDouble();
		                     { if ( payment > svngs)
		                         {System.out.println("You are trying to pay an amount greater than your exisiting savings. Try again.");
		                         break;}
		                       else if ( payment < 3000)
		                         { System.out.println("You are trying to pay less than the due amount. Try again.");
		                         break;}
		                       else if (payment > 3000)
		                        { 
		                        svngs = svngs - payment;
		                        payment = payment - 3000;
		                        svngs = svngs + payment;
		                        System.out.println("");
 		                        System.out.println(" You have successfully paid Php 3000 from you Savings. \n Any amount beyond Php 3000 is added back to your Savings.");
		                        break;}
		                       else 
		                         { svngs = svngs - payment;
		                         System.out.println("You have successfully paid " + payment + " using your Savings.");
		                         break;}
		                     }// if else if ladder end
		                    }// case2 end

                            default:
                            { System.out.println("Invalid selection.");
                            break;}

		                 }// inner switch end  
		                 break;  
		               }// outer case4
		               
		               default:
		               { System.out.println("Invalid selection.");
		               break;}
		               
		           }
		               
		            
		         //codebody
		        break;}// bills payment end
		    
		        
        	}// main switch end
		}//do loop end
		while(slc != 5);{
        	    System.out.println("\nThank you for banking with Philippines Bank. Have a great days ahead!");}
	} //greater if end
	
	else
	{ System.out.println("\n Invalid account. Now exiting the program.");}
                
    }
    
}