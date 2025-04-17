class TicketNotAvailable extends RuntimeException
{
TicketNotAvailable()
	{
	super();
	}
	TicketNotAvailable(String s)
	{
	super(s);
	}
}
