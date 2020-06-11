
import java.util.Scanner;
public class Triangle {

	
	public static void main(String[] args) {
		Integer a,b,c;
		Boolean c1,c2,c3, IsTriangle;
		c1=false;
		c2=true;
		c3=true;
		
		 do {
			 System.out.println("Enter 3 integers which are sides of a triangle");
			 Scanner user = new Scanner(System.in);
			 System.out.println("A: ");
			 a=user.nextInt();
			 System.out.println("B: ");
			 b=user.nextInt();
			 System.out.println("C: ");
			 c=user.nextInt();
			 
			 c1 = (1 <= a) & (a <= 200);
			 c2 = (1 <= b) & (b <= 200);
			 c3 = (1 <= c) & (c <= 200);
			 if (!c1) {
			 System.out.println("Value of a is not in the range of permitted values");}
			 
			 if (!c2){
			 System.out.println("Value of b is not in the range of permitted values");}
			
			 if (!c3){
			 System.out.println("Value of c is not in the range of permitted values");}		
	 
		 }
		 
		 
		while (!(c1 & c2 & c3)); 
		System.out.println("Side A is "+ a);
		System.out.println("Side B is "+ b);
		System.out.println("Side C is "+ c);
		 
		 //STEP 2 IS TRIANGLE
		
		if ((a < b + c) & (b < a + c) & (c < a + b)) {
			IsTriangle = true;}
		else{
			IsTriangle = false;
		}
		
		//STEP 3 
		if (IsTriangle) {
			if ((a == b) & (b == c)){
				System.out.println("Equilateral Triangle");
			}
			else if ((a != b) & (a != c) & (b!=c)) {
				System.out.println("Scalene Triangle");
			}
			else {
				System.out.println("Isoceles Triangle");
			}
			
		}else {
			System.out.println("Not a Triangle");
		}
		
	 }
}
