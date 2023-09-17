package atm.com;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AtmoperationInterf	op=new AtmoperationImpl();
    int atmnumber=12345;
    int atmpin=123;
    
    Scanner in=new Scanner(System.in);
    System.out.println(" !!    welcome to atm machine  !!");
    
    System.out.println("");
    System.out.print("Enter atm number :");
    int atmNumber=in.nextInt();
    
    System.out.print("Enter a pin :");
    int pin=in.nextInt();
    
    if((atmnumber==atmNumber)&&(atmpin==pin))
    {
    	System.out.println("...........validation done .......      ");
    	System.out.println("");
    	
    	while(true)
    	{
    		System.out.println("");
    		System.out.println("*******************************************************");
    		System.out.println("1.view available balance\n2.windrwan amount\n3.Deposite Amount\n4.Transactions history\n5.Quit");
    	    System.out.println("Enter choice");
    	    System.out.println();
    	    int ch=in.nextInt();
    	    if(ch==1)
    	    {
    	       op.viewBalance();
    	    }
    	    else if(ch==2) {
    	    System.out.println("");
    	    System.out.println("Enter amount to withdraw ");
    	    double withdrawAmount=in.nextDouble();
    	    op.withdrawAmount(withdrawAmount);
    	    	
    	    	
    	    }
            else if(ch==3) {
            	System.out.println("");
    	    	System.out.println("Enter Ammount to deposite :");
    	    	double depositeAmmount=in.nextDouble();//5000
    	    	op.depositeAmount(depositeAmmount);
    	    }
            else if(ch==4) {
            	op.viewMiniStatement();
//    	    	op.transactionHistory();
    	    	
    	    }
            else if(ch==5) {
    	    	
    	    System.out.println("Collect your atm card \n !! Thank you for using atm machine !!");	
    	    System.exit(0);
            }
            else
            {
            	System.out.println("please enter correct choice");
            }
    	}
	}

	else{

    	System.out.println("incorrect atm pin");
        System.exit(0);
        }

    
	}

}
