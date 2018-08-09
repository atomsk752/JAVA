import java.util.Scanner;

public class BuildingHigh {
	
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("각도를 입력하세요");
		int degree = Integer.parseInt(scanner1.nextLine());
		System.out.println("거리를 (m)입력하세요");
		int distance = Integer.parseInt(scanner2.nextLine());
		System.out.println("키(cm)를 입력하세요");
		int body = Integer.parseInt(scanner3.nextLine());
		
		double high = Math.tan(Math.toRadians(degree)) * distance + body / 100;
		
		System.out.println(String.format("%.1f", high));
	}

}
