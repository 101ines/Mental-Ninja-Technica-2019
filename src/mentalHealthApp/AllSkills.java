package mentalHealthApp;

public class AllSkills {
	private CopingSkill[] listOfSkills;

	public AllSkills() {

		listOfSkills = new CopingSkill[4];
		listOfSkills[0] = new CopingSkill("Try taking a break from homework! Refresh your mind. It will help you feel better");
		listOfSkills[1] = new CopingSkill("Make a schedule. Staying organized will ward off stress");
		listOfSkills[2] = new CopingSkill("Go talk to your advisor! They are here to help!");
		listOfSkills[3] = new CopingSkill("Forgive yourself! It's ok to not be ok!");

	}
	public CopingSkill[] getAllSkills()
	{
		return listOfSkills;
	}

	
}
