public class WelcomeMsg{
	
	public String welcomeMsg(){
		return "welcome to jewica computer education.....!!!";
	}
	
	public String greetMsg(){
		return "good morining to all......!!!" ;
		
	}
	
	public static void main(String[] args){
		
		WelcomeMsg message=new WelcomeMsg();
		System.out.println(
			message.greetMsg());
		System.out.println(
			message.welcomeMsg());
		
	}
}
