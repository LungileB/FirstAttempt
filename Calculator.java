import java.util.Scanner;
public class Calculator{

	
	public static void main(String [] args){
		
	
		
       Scanner input = new Scanner(System.in);
		
		
		// declaring variable
		int x1;
		int x2;
		int equation;
		int div;
		int sub;
		int mul;
		int add;
		
		
		
		System.out.println("enter first number");
		x1 = input.nextInt();
		System.out.println("enter second number");
		x2 = input.nextInt();
		
		System.out.println("enter calculation number whereby 1 is div, 2 is sub, 3 is mul, 4 is add");
		equation = input.nextInt();
		
		
		div = x1 / x2;
		sub = x1 - x2;
		mul = x1 * x2;
		add = x1 + x2;
		
		
		
		if (equation == 1){
			//System.out.println(div);
		System.out.printf("%d /%d = %d", x1,x2, div);}
		
		if (equation == 2){
		    //System.out.println(sub);
		System.out.printf("%d -%d = %d", x1,x2,sub);}
		
		if (equation == 3){
			//System.out.println(mul);
	    System.out.printf("%d * %d = %d", x1,x2, mul);}
		
		if (equation == 4){
			//System.out.print(add); 
		System.out.printf("%d + %d = %d", x1,x2, add);}
		
		if(equation !=4){
			System.out.println("Thank you mister DJ for playing my song by yvonne chaka chaka");
		}
		
		
		
	}
}
