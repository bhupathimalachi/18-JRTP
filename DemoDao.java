import java.util.*;
public class DemoDao{
	public void  naturalNumbers(int x){
		
		int i=1;
		while(i<=x){
			System.out.println(i);
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
		
	}
}