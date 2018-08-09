import java.util.Scanner;

public class MukJjiBba {

	public static String checkValue(int num) {
		return num == 0 ? "가위(0)" : num == 1 ? "바위(1)" : num == 2 ? "보(2)" : " ";
	}

	public static void main(String[] args) {

		int state = 0;

		while (true) {
			System.out.println("가위(0), 바위(1), 보(2)!");

			Scanner scanner = new Scanner(System.in);
			int user = Integer.parseInt(scanner.nextLine());

			int com = (int) (Math.random() * 2);

			int result = com - user < 0 ? com - user + 3 : com - user;

			System.out.println("컴퓨터가 낸 수 " + checkValue(com));
			System.out.println("당신이 낸 수 " + checkValue(user));

			if (result == 2) {
				state = 1;
				System.out.println("이겼습니다, 공격권 획득.");
			} else if (result == 1) {
				state = 2;
				System.out.println("졌습니다. 컴퓨터가 공격권을 가집니다.");
			} else {
				if (state == 0) {
					continue;
				}
				if (state == 1) {
					System.out.println("Win");
					return;

				}
				if (state == 2) {
					System.out.println("Lose");
					return;
				}

			}

		}

	}

}
