import java.util.ArrayList;

public abstract class TicketOptions
{
    ArrayList<String> ticketOptions = new ArrayList<>();
    private final int singleTicketRegular = 35;
    private final int singleTicketDiscount = 20;
    private final int monthlyTicketRegular = 600;
    private final int monthlyTicketDiscount = 450;

    public void addTicketOptions()
    {
        ticketOptions.add("Single-use ticket");
        ticketOptions.add("Monthly ticket");
    }

    public void showTicketOptions()
    {
        System.out.println("\n");
        System.out.println("----------");
        System.out.println(ticketOptions.get(0) + ":");
        System.out.println(PassengerCategories.REGULAR.toString() + " : " + singleTicketRegular + " kr");
        System.out.println(PassengerCategories.JUNIOR.toString() + " : " + singleTicketDiscount + " kr");
        System.out.println(PassengerCategories.SENIOR.toString() + " : " + singleTicketDiscount + " kr");
        System.out.println("----------");
        System.out.println(ticketOptions.get(1) + ":");
        System.out.println(PassengerCategories.REGULAR.toString() + " : " + monthlyTicketRegular + " kr");
        System.out.println(PassengerCategories.JUNIOR.toString() + " : " + monthlyTicketDiscount + " kr");
        System.out.println(PassengerCategories.SENIOR.toString() + " : " + monthlyTicketDiscount + " kr");
        System.out.println("\n");
    }

    public int getSingleTicketRegular()
    {

        return singleTicketRegular;
    }

    public int getSingleTicketDiscount()
    {

        return singleTicketDiscount;
    }

    public int getMonthlyTicketRegular()
    {

        return monthlyTicketRegular;
    }


    public int getMonthlyTicketDiscount()
    {

        return monthlyTicketDiscount;
    }

}


