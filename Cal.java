import java.util.Scanner;

public class Cal {

	public static void main(String []arg)
	{
		Scanner s=new Scanner(System.in);
		int choise=0,num1=0,num2=0,res=0;
		do {
		System.out.println("\nEnter Your choise :");
		System.out.println("1.Addition");
		System.out.println("2.Multiplication");
		System.out.println("3.Substraction");
		System.out.println("4.Divide");
		System.out.println("5.Percentage");
		System.out.println("6.Exit");
		choise=s.nextInt();
		
		switch(choise)
		{
		  case 1:
			  System.out.println("Enter Two Numbers");
			  num1=s.nextInt();
			  num2=s.nextInt();
			  System.out.println("Addition : "+(num1+num2));
			  break;
			  
		  case 2:
			  System.out.println("Enter Two Numbers");
			  num1=s.nextInt();
			  num2=s.nextInt();
			  System.out.println("Multiplication : "+(num1*num2));
			  break;
			  
		  case 3:
			  System.out.println("Enter Two Numbers");
			  num1=s.nextInt();
			  num2=s.nextInt();
			  System.out.println("Substraction : "+(num1-num2));
			  break;
			  
		  case 4:
			  System.out.println("Enter Two Numbers");
			  num1=s.nextInt();
			  num2=s.nextInt();
			  System.out.println("Divide: "+(num1/num2));
			  break;
			  
		 
			  
		  case 6:
			  break;
			  
		}
	}while(choise!=6);
  }
}

