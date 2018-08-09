
public class MovieTicket {

	public static double makeBenefit(int people, double ticketPrice) {
		
		double income = people * ticketPrice;
		double outcome = 180 + people * 0.04;
		double result = income - outcome;
		return (double)result;
	}


	public static void main(String[] args) {
		
		int people = 120;
		double ticketPrice = 5;
		double max = 0;
		double maxTicketPrice = 0;
		
		
		for (int i = 0; i < 50; i++) {
			double money = makeBenefit(people, ticketPrice);
		
			if(money > max) {
				max = money;
				maxTicketPrice = ticketPrice;
			}
			else {
				break;
			}
			
			ticketPrice = ticketPrice - 0.1;
			people = people + 15;
			
			
		}
		System.out.println(max);
		System.out.println(maxTicketPrice);
		System.out.println(String.format("%.2f", maxTicketPrice));
	}
	

}