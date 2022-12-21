package BookingTicket;

public class Test {
    public static void main(String[] args) {
        TicketCounter ticketCounter=new TicketCounter();
        TicketBookingThread t1=new TicketBookingThread(ticketCounter,"John",1);
        TicketBookingThread t2=new TicketBookingThread(ticketCounter,"Martin",1);
        t1.start();
        t2.start();

    }
}
