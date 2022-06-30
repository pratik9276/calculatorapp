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
		System.out.println("6.sin");
		System.out.println("7.tan");
		System.out.println("8.Exit");

		
		choise=1;
		
		switch(choise)
		{
		  case 1:
			  System.out.println("Enter Two Numbers");
			  num1=10;
			  num2=20;
			  System.out.println("Addition : "+(num1+num2));
			  //break;
			  
		  case 2:
			  System.out.println("Enter Two Numbers");
			  num1=5;
			  num2=5;
			  System.out.println("Multiplication : "+(num1*num2));
			 // break;
			  
		  case 3:
			  System.out.println("Enter Two Numbers");
			  num1=10;
			  num2=5;
			  System.out.println("Substraction : "+(num1-num2));
			  //break;
			  
		  case 4:
			  System.out.println("Enter Two Numbers");
			  num1=50;
			  num2=5;
			  System.out.println("Divide: "+(num1/num2));
			 // break;
			  
			  
		  case 6:
			  System.out.println("enter the number");
			  double a=10;
			  System.out.println(" "+(Math.sin(a)));
			  //break;
			  
		  case 7:
			  System.out.println("Enter number");
			  double b=15;
			  System.out.println(" "+(Math.tan(b)));
			  //break;

			  
		  case 8:
                          choise=8;
			  break;
			  
		}
	}while(choise!=8);
  }
}

