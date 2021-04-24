import java.util.*;

class Banking{
	static Scanner sc=new Scanner(System.in);
public int bal=0;
  public void Deposit(int amt){

  bal=bal+amt;
  System.out.println("total amount after deposite of amount is  "+bal);
}
  public void withdraw(int amt)throws Exception{
      if(bal<500){
		   throw new LessBalException(bal);
		  }
		  else if(amt>bal){
			  throw new LessBalException(bal);


			  }
			  else{
	bal=bal-amt;
	System.out.println("balance after withdrawal of amount is "+bal);
}
	}

	public void loan(){
		 System.out.println("enter the amount of loan ");
		 int price=sc.nextInt();
		 System.out.println("rate of interest for years are as follows: \n for 1 yr: 7%\n for 2 yr 10%\n for 5 yr 20%\n");
		 System.out.println("enter the no of yr for which you want loan");
		 int yr=sc.nextInt();
		 switch(yr){
			 case 1:
			    float one=(7*price)/100;
			    float one1=(one+price)/12;
			    System.out.println("the emi per month will be:"+one1);
			    break;
			 case 2:
			 float two=(10*price)/100;
			 			    float two1=(two+price)/24;
			 			    System.out.println("the emi per month will be:"+two1);
			    break;
			 case 5:
			 float five=(20*price)/100;
			 			 			    float five1=(five+price)/24;
			 			 			    System.out.println("the emi per month will be:"+five1);
			    break;
			 }
		}
   public static void main(String ar[]){
	   Banking obj=new Banking();
	   String str="y";
	   while(str.equalsIgnoreCase("y")){

	    System.out.println("======================welcome to the bank======================");

	    System.out.println("press 1 for loan \n2 for banking");
	    int m=sc.nextInt();
	    switch(m){
			case 1:
			obj.loan();
			break;
			case 2:
		  try{
     System.out.println("enter the amount");
     int amt=sc.nextInt();

    System.out.println("enter the choice \t enter 1 for deposit \n  enter 2 for withdrawl");
    int choice=sc.nextInt();

  switch(choice){
		case 1:
		  obj.Deposit(amt);
		  break;

		case 2:
		obj.withdraw(amt);
		break;

		default:
		System.out.println("your choice is wrong :)");
		}
	}catch(Exception e){
		System.out.println("error: "+e);
		}

		System.out.println("enter y to continue ");
		str=sc.next();
}
}
}
}
