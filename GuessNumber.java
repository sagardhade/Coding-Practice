import java.util.Scanner;
public class GuessNumber
{
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int myNum=(int)(Math.random()*100);
		int userNum=0;
		
		do{
		System.out.println("Guess my Number...");
    		userNum=sc.nextInt();

		if(userNum==myNum){
		System.out.println("Woooohoo Correct Number...");
		break;
		}

		else if(userNum>myNum){
		System.out.println("Your number is too large");
		}

		else{
		System.out.println("Your number is too small");
		}
		    
		}
		while(userNum>=0);
		System.out.println("My number was :"+ myNum);

	}
}