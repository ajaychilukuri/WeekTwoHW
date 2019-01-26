public class Loops {

	public static void main(String[] args) {
		
		//A while loop that prints all even numbers from 0 to 100
		int i = 2;
		while (i <= 100)  {
			System.out.println(i);
			i += 2;
		}
		//A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int x = 97;
		while (x > 0) {
			System.out.println(x);
			x -= 3;
		}
		//A for loop that prints every other number from 1 to 100
		for (int y = 1; y <= 100; y++) {
			System.out.println(y);
			y += 1;
		}
		//A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if 
		//the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” 
		//instead of the number.
		for (int z = 0; z <= 100; z++) {
			
			if (z % 3 == 0 && z % 5 == 0) {
				System.out.println("HelloWorld");
			}
			else if (z % 3 == 0) {
				System.out.println("Hello");
			}
			else if (z % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(z);
			}
			
		}
	}

}
