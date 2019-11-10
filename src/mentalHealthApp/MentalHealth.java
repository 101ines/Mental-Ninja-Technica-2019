package mentalHealthApp;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//
public class MentalHealth {

	public static void main(String[] args) {

		// Introducing the app + user quiz
		JFrame frame = new JFrame("JOptionPane ShowMessageDialogue example");
		JOptionPane.showMessageDialog(frame,"Welcome to Mental Ninja. Learn practical skills to overcome stress and anxiety");
		JOptionPane.showMessageDialog(frame,"Each week, check back for a new actionable skill to implement throughout\nyour week to cope with stress and anxiety\nEach time you do the skill, you earn points. \nEarn 25 points and move up a belt level!");
		String[] options= {"Academic Stress","2. General Anxiety"};
		Object selectionObject = JOptionPane.showInputDialog(null, "What are you dealing with?", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		int result;
		
		if(selectionObject.toString().equals("Academic Stress"))
		{
			 result=1;
		}
		else 
		{
			result=2;
		}
		User user1 = new User(result);
		AllSkills allskills= new AllSkills();
		JOptionPane.showMessageDialog(frame, user1.toString());
		JOptionPane.showMessageDialog(frame,"New Ninja Skill For You!");
		JOptionPane.showMessageDialog(frame,allskills.getAllSkills()[User.getWeek()-1]);
		String [] options2= {"Yes! ", "No! I forgot:("};
		Object selectionObject2 = JOptionPane.showInputDialog(null, "Good Morning! Did you implement last week's skill?", "Menu", JOptionPane.PLAIN_MESSAGE, null, options2, options2[0]);
		if (selectionObject2.toString().equals("Yes! ")) {
			user1.incrementPoints();
			JOptionPane.showMessageDialog(frame,"Sick! You earned some points");
		}
		else
		{
			JOptionPane.showMessageDialog(frame,"Try again this week!");
		}
		user1.newWeek();
		JOptionPane.showMessageDialog(frame, user1.toString());
		JOptionPane.showMessageDialog(frame,"New Ninja Skill For You!");
		JOptionPane.showMessageDialog(frame,allskills.getAllSkills()[User.getWeek()-1]);
		
		
		
		
		
	}

	public static void introSpeech() {
		System.out.println(
				"Thank you!\nHow this works: \n\nEach week you will recieve a new  \ncoping skill to implement throughout your week\nbased on what you are struggling with.");
		System.out.println(
				"\nEach day that you succesfully implement\na skill, you earn 5 points. \n\nYou start off as a white belt. \nEarn 30 points and level up!\n"
						+ "");
		System.out.println(
				"Also, each week you will get asked to rate\nyour overall stress/anxiety levels\nOvertime we will track your moods\n"
						+ "and see it progress overtime");
		System.out.println();
		System.out.println();
	}

}
