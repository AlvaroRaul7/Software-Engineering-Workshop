import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Integer a, b, c;
		Boolean c1, c2, c3, IsTriangle;
		Boolean[] conditions = new Boolean[3];
		c1 = false;
		c2 = true;
		c3 = true;
		IsTriangle = true;

		do {
			System.out.println("Enter 3 integers which are sides of a triangle");
			Scanner user = new Scanner(System.in);
			System.out.println("A: ");
			a = user.nextInt();
			System.out.println("B: ");
			b = user.nextInt();
			System.out.println("C: ");
			c = user.nextInt();
			// insert validation function
			user.close();
			conditions = validateInput(a, b, c, c1, c2, c3);
			c1 = conditions[0];
			c2 = conditions[1];
			c3 = conditions[2];
		}
		

		while (!(c1 & c2 & c3));
		System.out.println("Side A is " + a);
		System.out.println("Side B is " + b);
		System.out.println("Side C is " + c);
		// Set the triangle type according sides
		System.out.println(setTriangleType(a, b, c, IsTriangle));
		
	}

	public static Boolean[] validateInput(int a, int b, int c, boolean c1, boolean c2, boolean c3) {
		Boolean[] conditions = new Boolean[3];
		c1 = (1 <= a) & (a <= 200);
		c2 = (1 <= b) & (b <= 200);
		c3 = (1 <= c) & (c <= 200);
		if (!c1) {
			System.out.println("Value of a is not in the range of permitted values");
		}

		if (!c2) {
			System.out.println("Value of b is not in the range of permitted values");
		}

		if (!c3) {
			System.out.println("Value of c is not in the range of permitted values");
		}
		conditions[0] = c1;
		conditions[1] = c2;
		conditions[2] = c3;
		return conditions;
	}

	public static String setTriangleType(int a, int b, int c, boolean IsTriangle) {
		if ((a < b + c) & (b < a + c) & (c < a + b)) {
			IsTriangle = true;
		} else {
			IsTriangle = false;
		}

		// STEP 3
		if (IsTriangle) {
			if ((a == b) & (b == c)) {
				return "Equilateral Triangle";
			} else if ((a != b) & (a != c) & (b != c)) {
				return "Scalene Triangle";
			} else {
				return "Isosceles Triangle";
			}

		} else {
			return "Not a Triangle";
		}
	}

}
