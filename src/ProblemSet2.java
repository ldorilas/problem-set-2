/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;

public class ProblemSet2 {
	Scanner in = new Scanner(System.in);
	
	/**
	 * You need not modify the main method.
	 */
	
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("Type your first and last name.");
		
		
		String fullName = in.nextLine();
		System.out.println("Hello, " + fullName + "!");
	}
	
	public void gradeMe() {
		System.out.println("What is your first homework grade?");
		double homework1 = in.nextDouble();
		System.out.println("What is your second homework grade?");
		double homework2 = in.nextDouble();
		System.out.println("What is your third homework grade?");
		double homework3 = in.nextDouble();
		double avghw = ((homework1 + homework2 + homework3) / 3);
		System.out.println("What is your first quiz grade?");
		double quiz1 = in.nextDouble();
		System.out.println("What is your second quiz grade?");
		double quiz2 = in.nextDouble();
		System.out.println("What is your third quiz grade?");
		double quiz3 = in.nextDouble();
		double avgquiz = ((quiz1 + quiz2 + quiz3) / 3);
		System.out.println("What is your first test grade?");
		double test1 = in.nextDouble();
		System.out.println("What is your second test grade?");
		double test2 = in.nextDouble();
		System.out.println("What is your third test grade?");
		double test3 = in.nextDouble();
		double avgtest = ((test1 + test2 + test3) / 3);
		double totalgrade = ((avghw * 0.15) + (avgquiz * 0.3) + (avgtest * 0.55));
		System.out.println("Total grade: " + totalgrade);

		
	}
	
	public void groupUs() {
		System.out.println("Number of students: ");
		int student = in.nextInt();
		System.out.println("Number of teachers: ");
		int teacher = in.nextInt();
		int passengers = student + teacher;
		System.out.println("Total number of people: " + (passengers) + ". You only need one bus.");
		if (passengers > 47) {
			int bus = in.nextInt();
			bus = bus++;
			System.out.println("Number of buses: " + (bus));
		}
	}
	
	public void info() {
		System.out.println("Type your first name.");
		String firstname = in.nextLine();
		System.out.println("Type your last name.");
		String lastname = in.nextLine();
		System.out.println("Type your grade.");
		int gradelevel = in.nextInt();
		System.out.println("Type your age.");
		int age = in.nextInt();
		System.out.println("Type in your hometown.");
		String hometown = in.nextLine();
		System.out.println("NAME: {" + firstname + "} {" + lastname + "}");
		System.out.println("GRADE: {" + gradelevel + "}");
		System.out.println("AGE: {" + age + "}");
		System.out.println("HOMETOWN: {" + hometown + "}");
	}
	
	public void initials() {
		
	}
}