import java.util.Scanner;

public class BuildingHigh {
	
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int degree = Integer.parseInt(scanner1.nextLine());
		System.out.println("�Ÿ��� (m)�Է��ϼ���");
		int distance = Integer.parseInt(scanner2.nextLine());
		System.out.println("Ű(cm)�� �Է��ϼ���");
		int body = Integer.parseInt(scanner3.nextLine());
		
		double high = Math.tan(Math.toRadians(degree)) * distance + body / 100;
		
		System.out.println(String.format("%.1f", high));
	}

}
