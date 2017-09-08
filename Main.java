import java.util.stream.*;

class Main {
	public static void main(String ... args) {
		if(args.length != 1) {
			return;
		}

		IntStream.rangeClosed(1,Integer.parseInt(args[0]))
		.forEach(e-> {
			if(fizz(e) | buzz(e)) {
				System.out.println("");
			} else {
				System.out.println(e);
			}
		});
	}

	private static boolean fizz(int num) {
		if(num%3==0) {
			System.out.print("Fizz");
			return true;
		}
		return false;
	}

	private static boolean buzz(int num) {
		if(num%5==0) {
			System.out.print("Buzz");
			return true;
		}
		return false;
	}
}