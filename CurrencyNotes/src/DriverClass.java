import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the Number Of Currency Notes   ");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Currency Denomination "+i);
			currency[i]=sc.nextInt();
		}
		System.out.println("Before" +Arrays.toString(currency));
		BubbleSort bs=new BubbleSort();
		bs.sort(currency);
		System.out.println("After" +Arrays.toString(currency));
		
		
		System.out.println("Please Enter Amount You Need To Pay");
		int amount=sc.nextInt();
		
		NotesCount nc=new NotesCount();
		nc.counting(currency,amount);

	}

}