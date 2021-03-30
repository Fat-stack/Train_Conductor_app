import java.util.Scanner;

public class TrainApplicationMain
{

	public static void main(String[] args)
	{
		int whileLoop = 0;

		Ticket ticket = new Ticket();
		ticket.addTicketOptions();


		while(whileLoop != 99)
		{

			try
			{
				System.out.println("--------------Menu-------------");
				System.out.println("1. New passenger\n2. Show passengers\n3. Ticketprices\n4. Exit");
				Scanner scanner = new Scanner(System.in);
				int switchLoop = scanner.nextInt();

				switch (switchLoop)
				{
					case 1:
						ticket.createPassenger();
						ticket.createTicket();
						break;
					case 2:
						ticket.showList();
						break;
					case 3:
						ticket.showTicketOptions();
						break;
					case 4:
						whileLoop = 99;
						break;
					default:
						System.out.println("\nNot a valid choice\n");
				}
			}
			catch(Exception e)
			{
				System.out.println("\nNot a valid choice\n");
			}
		}
	}
}

	
