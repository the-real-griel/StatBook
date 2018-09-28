//Josh Griel
package Bball;

public class Team 
{	private String name = null;
	private String location = null;
	private String coach;
	private Player[] roster;
	private int timeOuts;
	
	public void setName(String nm)
	{ name = nm; }
	public String getName()
	{ return name; }
	public void setLocation(String loc)
	{ location = loc; }
	public String getLocation()
	{ return location; }
	public void setCoach(String hc)
	{ coach = hc; }
	public String getCoach()
	{ return coach; }
	public void setTimeOuts(int to)
	{ timeOuts = to; }
	public void addTimeOut()
	{ timeOuts ++; }
	public void subtractTimeOuts()
	{ timeOuts --; }
	public int getTimeOuts()
	{ return timeOuts; }
	
	
}
