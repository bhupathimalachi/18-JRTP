import java.util.*;
public class DemoDao{
	public void  naturalNumbers(int x){
		
		int i=1;
		System.out.println("Natural Numbers are:- ");
		while(i<=x){
			System.out.println(i);
			i++;
			
		}
	}
	public void  printEvenNumbers(int x){
		int i=1;
		System.out.println("even numbers  are:- ");
		while(i<=x){
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	public void  printOddNumbers(int x){
		int i=1;
		System.out.println("odd numbers  are:- ");
		while(i<=x){
			if(i%2 == 1)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void main(String[] arg){
		
		int n;
		DemoDao dd=new DemoDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N value to print:- ");
		n=sc.nextInt();
		dd.naturalNumbers(n);
		dd.printEvenNumbers(n);
		dd.printOddNumbers(n);
	}
}