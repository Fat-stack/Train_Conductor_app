import java.util.LinkedList;
import java.util.Scanner;

public class Ticket extends TicketOptions implements IPassenger
{

	LinkedList <PassengerProperties> passengerList = new LinkedList<>();
	String [] passengerQuestions = {"First name: ","Last name: ","Age: "};

	int savedInput;
    String savedTicketType;


	public void showList()
    {
        System.out.println("\n------Passengers onboard------");
		for (int i = 0; i < passengerList.size(); i++)
		{
			System.out.println("Passenger: " + passengerList.get(i).getFirstName() + " " + passengerList.get(i).getLastName() + ". Age: " + passengerList.get(i).getAge());
		}
        System.out.println("\n");
	}
	

	public void createPassenger()
    {
        try
        {
            Scanner questionsForPassenger = new Scanner(System.in);
            System.out.println(passengerQuestions[0]);
            String firstName = questionsForPassenger.nextLine();
            System.out.println(passengerQuestions[1]);
            String lastName = questionsForPassenger.nextLine();
            System.out.println(passengerQuestions[2]);
            int age = questionsForPassenger.nextInt();
            passengerList.add(new PassengerProperties(firstName,lastName,age));
        }
        catch (Exception e)
        {
            System.out.println("\nCan not resolve input: restarting the registration\n");
            createPassenger();
        }
    }

    public void createTicket()
    {
        try
        {
            Scanner ticketChoice = new Scanner(System.in);
            System.out.println("1." + ticketOptions.get(0) + "\n2." + ticketOptions.get(1));
            int customerChoice = ticketChoice.nextInt();
            savedInput = (customerChoice - 1);

            switch (customerChoice)
            {
                case 1:

                    if (passengerList.getLast().getAge() < 18)
                    {
                        System.out.println("\nTicket type " + PassengerCategories.JUNIOR.toString());
                        System.out.println("Price: " + getSingleTicketDiscount() + " kr");
                        savedTicketType = PassengerCategories.JUNIOR.toString();
                    }
                    else if (passengerList.getLast().getAge() > 64)
                    {
                        System.out.println("\nTicket type: " + PassengerCategories.SENIOR.toString());
                        System.out.println("Price: " + getSingleTicketDiscount() + " kr");
                        savedTicketType = PassengerCategories.SENIOR.toString();
                    }
                    else
                    {
                        System.out.println("\nTicket type: " + PassengerCategories.REGULAR.toString());
                        System.out.println("Price: " + getSingleTicketRegular() + " kr");
                        savedTicketType = PassengerCategories.REGULAR.toString();
                    }
                    break;
                case 2:

                    if (passengerList.getLast().getAge() < 18)
                    {
                        System.out.println("\nTicket type: " + PassengerCategories.JUNIOR.toString());
                        System.out.println("Price: " + getMonthlyTicketDiscount() + " kr");
                        savedTicketType = PassengerCategories.JUNIOR.toString();
                    }
                    else if (passengerList.getLast().getAge() > 64)
                    {
                        System.out.println("\nTicket type: " + PassengerCategories.SENIOR.toString());
                        System.out.println("Price " + getSingleTicketDiscount() + " kr");
                        savedTicketType = PassengerCategories.SENIOR.toString();
                    }
                    else
                    {
                        System.out.println("\nTicket type: " + PassengerCategories.REGULAR.toString());
                        System.out.println("Price: " + getMonthlyTicketRegular() + " kr");
                        savedTicketType = PassengerCategories.REGULAR.toString();
                    }
                    break;
                default:
                    System.out.println("\nNot a valid choice\n");
                    createTicket();
                    break;
            }
            printTicket();
        }
        catch(Exception e)
        {
            System.out.println("\nNot a valid choice\n");
            createTicket();
        }
    }

    public void printTicket()
    {
        System.out.println("\n--------------Ticket------------");
        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
        System.out.println(ticketOptions.get(savedInput) + " - " + savedTicketType);
        System.out.println("----------------------------------");
        System.out.println("\n");
        }
    }


