import java.util.*;
public class Demo{
	
	int a,b,c;
	float m,n,o;
	
	public Integer add(int a, int b){
		c=a+b;
		return c;		
	}
	public float add(int a, float m){
		o=a+m;
		return o;		
	}
	public Integer sub(int a, int b){
		c=b-a;
		return c;		
	}
	public Integer mul(int a, int b){
		c=a*b;
		return c;		
	}
	public  Integer div(int a, int b){
		c= a/b;
		return c;		
	}
	public  Integer mod(int a, int b){
		c=a%b;
		return c;		
	}
	
	
	public static void main(String[] args){
		
		int x,y,z;
		float p,q,r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A value");
		x=sc.nextInt();
		System.out.println("Enter B value");
		y=sc.nextInt();
		
		Demo d=new Demo();
		z=d.add(x,y);
		System.out.println("addtion of two number is:- " + z);
		
		r=d.add(x,p);
		System.out.println("addtion of two number is:- " + r);
		
		z=d.sub(x,y);
		System.out.println("substraction of two number is:- " + z);
		
		z=d.mul(x,y);
		System.out.println("multiplication of two number is:- " + z);
		
		z=d.div(x,y);
		System.out.println("division of two number is:- " + z);
		
		z=d.mod(x,y);
		System.out.println("division of two number is:- " + z);
		
	}
	
	
}