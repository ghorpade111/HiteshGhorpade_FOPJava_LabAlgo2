import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);					 
	System.out.println("Enter the Number of transaction Of PayMoney");
	int size=sc.nextInt();
	
	int trans[]=new int[size];
	for(int i=0;i<size;i++)
	{
		trans[i]=sc.nextInt();
	}

	System.out.println("Enter the Amount of Each Transcation");
	int testcases=sc.nextInt();
	int targetAmount;
	int j,sum,flag;
	for(int i=1;i<=testcases;i++)
	{
		sum=0;
		flag=0;
		System.out.println("Enter the target Amount of PayMoney " + i + "case");  //120
		targetAmount=sc.nextInt();
		for(j=0;j<trans.length;j++)
		{
			sum=sum+trans[j];
			if(sum>=targetAmount)
			{
				System.out.println("PayMoney Target Achieved after "+ ++j + "Transaction" );
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("Target not fulfilled" );
	}
	}
}

