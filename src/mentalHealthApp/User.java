package mentalHealthApp;

public class User {

	private String beltColor;
	private static int weekNumber;
	private int points;
	int[] mood= new int[10];
	private int skillsType;
	
	public User(int skillsType) {
		beltColor="white";
		points=0;
		weekNumber=1;
		this.skillsType=skillsType;
	}
	public int getSkillsType()
	{
		return skillsType;
	}
	public String  getBeltColor()
	{
		return beltColor;
	}
	public static int  getWeek()
	{
		return weekNumber;
	}
	public int  getPoints()
	{
		return points;
	}
	public void incrementPoints()
	{
		
		points+=5;
	}
	public void changeBelt()
	{
		if(points<5)
		{
			beltColor="White";
		}else if(points<10)
		{
			beltColor="Green";
		}
		else if (points<15)
		{
			beltColor="Blue";
		}
		else
		{
			beltColor="Black";
		}
			
	}
	public String toString()
	{
		return "Belt Level: " + beltColor + "\nPoints:  " + points +" points \nWeek: "+ weekNumber;
	}
	public void newWeek()
	{
		weekNumber++;
	}
	public void setMood(int moodRating) throws IllegalArgumentException
	{
		if (moodRating<0||moodRating>5) {
			throw new IllegalArgumentException("moodRating must be between 0 and 5");
		}
		mood[weekNumber-1]=moodRating;
	}
}
