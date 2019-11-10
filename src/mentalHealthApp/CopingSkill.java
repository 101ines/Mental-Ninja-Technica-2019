package mentalHealthApp;

public class CopingSkill {
	private String skill;
	private int[] daysCompleted;
	
	public CopingSkill(String skill) {
		daysCompleted= new int[7];
		this.skill=skill;
	}
	
	public  boolean atLeastFiveDays()
	{
		int sum=0;
		for (int i=0; i<daysCompleted.length; i++)
		{
			if (daysCompleted[i]==1)
			{
				sum++;
			}
		}
		return (sum>=5);
	}
	public String toString()
	{
		return skill;
	}
	// days are 0-6. 0 is monday, 6 is sunday
	public void setDaysCompleted(int day, boolean doneOrNot)
	{
		if (doneOrNot==true)
		{
		daysCompleted[day]= 1;
		}
		else
		{
			daysCompleted[day]=0;
		}
	}
	
}
