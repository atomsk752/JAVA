import java.util.Scanner;

public class MukJjiBba {

	public static String checkValue(int num) {
		return num == 0 ? "����(0)" : num == 1 ? "����(1)" : num == 2 ? "��(2)" : " ";
	}

	public static void main(String[] args) {

		int state = 0;

		while (true) {
			System.out.println("����(0), ����(1), ��(2)!");

			Scanner scanner = new Scanner(System.in);
			int user = Integer.parseInt(scanner.nextLine());

			int com = (int) (Math.random() * 2);

			int result = com - user < 0 ? com - user + 3 : com - user;

			System.out.println("��ǻ�Ͱ� �� �� " + checkValue(com));
			System.out.println("����� �� �� " + checkValue(user));

			if (result == 2) {
				state = 1;
				System.out.println("�̰���ϴ�, ���ݱ� ȹ��.");
			} else if (result == 1) {
				state = 2;
				System.out.println("�����ϴ�. ��ǻ�Ͱ� ���ݱ��� �����ϴ�.");
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
