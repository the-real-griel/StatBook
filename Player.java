//Josh Griel
package Bball;

public class Player
{	private String name = null;
	private int number = -1;
	private int points = 0;
	private int fouls = 0;
	private int assists = 0;
	private int rebounds = 0;
	private int steals = 0;
	private int freeThrowsMade = 0;
	private int freeThrowsAttempted = 0;
	
	public Player() {}
	public Player(String nm, int num)
	{ name = nm;
	  number = num;
	}
	public Player (String nm, int num, int pts, int f, int ast, int rb, int stl, int ftm, int fta)
	{ name = nm;
	  number = num;
	  points = pts;
	  fouls = f;
	  assists = ast;
	  rebounds = rb;
	  steals = stl;
	  freeThrowsMade = ftm;
	  freeThrowsAttempted = fta;
	}
	public void setName(String nm)
	{ name = nm; }
	public String getName()
	{ return name; }
	public void setNumber(int num)
	{ number = num; }
	public int getNumber()
	{ return number; }
	public void setPoints(int pts)
	{ points = pts; }
	public int getPoints()
	{ return points; }
	public void setFouls(int num)
	{ fouls = num; }
	public void addFoul()
	{ fouls ++; }
	public void subtractFoul()
	{ fouls --; }
	public int getFouls()
	{ return fouls; }
	public void setAssists(int ast)
	{ assists = ast; }
	public void addAssist()
	{ assists ++; }
	public void subtractAssist()
	{ assists --; }
	public int getAssists()
	{ return assists; } 
	public void setRebounds(int reb)
	{ rebounds = reb; }
	public void addRebound()
	{ rebounds ++; }
	public void subtractRebound()
	{ rebounds --; }
	public int getRebounds()
	{ return rebounds; }
	public void setSteals(int stl)
	{ steals = stl; }
	public void addSteal()
	{ steals ++; }
	public void subtractSteal()
	{ steals --; }
	public int getSteals()
	{ return steals; }
	public void setFreeThrowsMade(int ftm)
	{ freeThrowsMade = ftm; }
	public void addFreeThrowMade()
	{ freeThrowsMade ++; }
	public void subtractFreeThrowsMade()
	{ freeThrowsMade --; }
	public int getFreeThrowsMade()
	{ return freeThrowsMade; }
	public void setFreeThrowsAttempted(int fta)
	{ freeThrowsAttempted = fta; }
	public void addFreeThrowsAttempted()
	{ freeThrowsAttempted ++; }
	public void subtractFreeThrowsAttempted()
	{ freeThrowsAttempted --; }
	public int getFreeThrowsAttempted()
	{ return freeThrowsAttempted; }
	public double getFreeThrowPercent()
	{ double ftp;
	  ftp = freeThrowsMade / freeThrowsAttempted;
	  return ftp;
	}
	public void printStatLine()																																							//NOT WORKING
	{ String str = "#" + number + " " + name +"\nPoints: " + points + "\nFouls: " + fouls + "\nAssists: " + assists + 
			"\nRebounds: " + rebounds + "\nSteals: " + steals + "\nFree Throws: " + freeThrowsMade + "/" + freeThrowsAttempted + " (" + freeThrowsMade / freeThrowsAttempted + "%)";	
	  System.out.print(str);
	}
}
