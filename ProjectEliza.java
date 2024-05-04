/*
 * Sumaiya Fatema 		
 * Professor Madramaatoo || CHECK SPELLING
 * CMP 167				
 * 16 May 2023 
 * 
 * Resources used: Adrian G's project Eliza sample code given
 * by professor
 * 
 * 	
 */

import java.util.Scanner;

public class ProjectEliza {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			mainFrame();

	}		
		
	
	public static void mainFrame () {
		Scanner scan = new Scanner(System.in);
		String User = "User: ";
		String Eliza = "Eliza: ";
		String getThought = "";	 //dead code
		//PromptBank ElizaQ = new PromptBank(); //declared object 
		PromptBank statement = new PromptBank(); // declared object
		
		String e2 = "Exit"; 
		
		System.out.println(Eliza + "Hello, my name is Eliza. What is your name?");
		System.out.print(User);
		
		String name = scan.nextLine(); //user enters name
		
		if (name.equalsIgnoreCase("Exit")) {
			exitFrame(name);
		} else {
		
		
		System.out.println(Eliza + "Hello " + name + ". Tell me what is on your mind today in 1 sentence." );//works
		String getThought1 = scan.nextLine();//gets user input
		
		while (!getThought1.equalsIgnoreCase("Exit")) {
			char e =  getThought1.charAt(getThought1.length() - 1); 
				 if (e == '!' ) {
					 String firstWord;
					// System.out.print(Eliza + "WOW! Dramatic! ");
					 statement.populateStatementsArray(); //calls statement and its stores a random statement
					 String [] sep = getThought1.split(" "); //splits string
					 
					 if (sep.length == 1) {
						firstWord = sep[0]; 
						
						String lastWord = sep[0]; 
						firstWord = firstWord.substring(0,firstWord.length()-1);
						lastWord = lastWord.substring(0,lastWord.length()-1); //gets rid of exclamation point 
						
						
						String ElizaStatement = statement.getRandomStatementTrunk();
						ElizaStatement = ElizaStatement.replace("BLANK1", firstWord); //replaced!
						ElizaStatement = ElizaStatement.replace("BLANK2", lastWord); 
						 System.out.println(Eliza + "WOW! Dramatic! " + ElizaStatement);
					 } else {
					 //splitting our userInput so we can get the first and last Word
					 firstWord = sep[0]; 
					 String lastWord = sep[sep.length- 1];  //gets userInput length in our split elements, we subtract one since elements start at zero!!!   
					 lastWord = lastWord.substring(0,lastWord.length()-1); //gets rid of exclamation point 
				 
					//now we go back to our randomStatement
					 String ElizaStatement = statement.getRandomStatementTrunk();
					 
					 ElizaStatement = ElizaStatement.replace("BLANK1", firstWord); //replaced!
					 ElizaStatement = ElizaStatement.replace("BLANK2", lastWord); //replaced, should change, we also deleted exclamation mark
					System.out.println(Eliza + "WOW! Dramatic! " + ElizaStatement);
					 }
					 
				 }
				 
				 if (e == '.' ) {
					 String firstWord;
					// System.out.print(Eliza + "WOW! Dramatic! ");
					 statement.populateStatementsArray(); //calls statement and its stores a random statement
					 String [] sep = getThought1.split(" "); //splits string
					 
					 if (sep.length == 1) {
						firstWord = sep[0]; 
						
						String lastWord = sep[0]; 
						firstWord = firstWord.substring(0,firstWord.length()-1);
						lastWord = lastWord.substring(0,lastWord.length()-1); //gets rid of exclamation point 
						
						
						String ElizaStatement = statement.getRandomStatementTrunk();
						ElizaStatement = ElizaStatement.replace("BLANK1", firstWord); //replaced!
						ElizaStatement = ElizaStatement.replace("BLANK2", lastWord); 
						 System.out.println(Eliza + ElizaStatement);
					 } else {
					 //splitting our userInput so we can get the first and last Word
					 firstWord = sep[0]; 
					 String lastWord = sep[sep.length- 1];  //gets userInput length in our split elements, we subtract one since elements start at zero!!!   
					 lastWord = lastWord.substring(0,lastWord.length()-1); //gets rid of exclamation point 
				 
					//now we go back to our randomStatement
					 String ElizaStatement = statement.getRandomStatementTrunk();
					 
					 ElizaStatement = ElizaStatement.replace("BLANK1", firstWord); //replaced!
					 ElizaStatement = ElizaStatement.replace("BLANK2", lastWord); //replaced, should change, we also deleted exclamation mark
					System.out.println(Eliza + ElizaStatement ); 
					 }
					 
				 }
				 
				 if (e == '?' ) {
					 String firstWord;
					// System.out.print(Eliza + "WOW! Dramatic! ");
					 statement.populateQuestionsArray(); //calls statement and its stores a random statement
					 String [] sep = getThought1.split(" "); //splits string
					 
					 if (sep.length == 1) {
						firstWord = sep[0]; 
						
						String lastWord = sep[0]; 
						firstWord = firstWord.substring(0,firstWord.length()-1);
						lastWord = lastWord.substring(0,lastWord.length()-1); //gets rid of exclamation point 
						
						
						String ElizaQuestion = statement.getRandomQuestionTrunk(); //declared object
						ElizaQuestion = ElizaQuestion.replace("BLANK1", firstWord); //replaced!
						ElizaQuestion = ElizaQuestion.replace("BLANK2", lastWord); 
						 System.out.println(Eliza + ElizaQuestion);
					 } else {
					 //splitting our userInput so we can get the first and last Word
					 firstWord = sep[0]; 
					 String lastWord = sep[sep.length- 1];  //gets userInput length in our split elements, we subtract one since elements start at zero!!!   
					 lastWord = lastWord.substring(0,lastWord.length()-1); //gets rid of exclamation point 
				 
					//now we go back to our randomStatement
					 String ElizaQuestion = statement.getRandomQuestionTrunk();
					 
					 ElizaQuestion = ElizaQuestion.replace("BLANK1", firstWord); //replaced!
					 ElizaQuestion = ElizaQuestion.replace("BLANK2", lastWord); //replaced, should change, we also deleted exclamation mark
					System.out.println(Eliza + ElizaQuestion);
					 }
					 
				 }
			 
				 if (e != '.' && e != '?' && e != '!' && e2 != "exit") {
					 String firstWord; 
					 
					 System.out.print(Eliza);
					 statement.populateStatementsArray(); //calls statement and its stores a random statement
					 String [] sep = getThought1.split(" "); //splits string
					 
					 //splitting our userInput so we can get the first and last Word
					 if (sep.length == 0) {
						  firstWord = sep[0]; 
						 String ElizaStatement = statement.getRandomStatementTrunk();
						 ElizaStatement = ElizaStatement.replace("BLANK1", firstWord); //replaced!
						 ElizaStatement = ElizaStatement.replace("BLANK2", firstWord); 
						 System.out.println(ElizaStatement);
						 System.out.print(User);
						 
					 } else 
					  firstWord = sep[0]; 
					 String lastWord = sep[sep.length- 1];  //gets userInput length in our split elements, we subtract one since elements start at zero!!!   				 
					//now we go back to our randomStatement
					 String ElizaStatement = statement.getRandomStatementTrunk();
					 
					 ElizaStatement = ElizaStatement.replace("BLANK1", firstWord); //replaced!
					 ElizaStatement = ElizaStatement.replace("BLANK2", lastWord); //replaced, should change, we also deleted exclamation mark
					System.out.println(ElizaStatement);
		//	System.out.print(User);
				 }
				 
				 
			System.out.print(User);
			 getThought1 = scan.nextLine(); //tests user's next response
			//exitFrame(getThought);
			 
			} //code keeps on repeating cause not done 
		exitFrame(getThought1);
			}
		}//end of method
		
	

	
	public static void exitFrame(String a) { 
		Scanner scan = new Scanner(System.in);

		if (a.equalsIgnoreCase("Exit")) {
			System.out.println("Eliza: Do you want to run the session again?");
			String t = "User: ";
			String y = "Eliza: ";
			System.out.print(t);
			String input = scan.next();
			if (input.equalsIgnoreCase("Yes")) {
				mainFrame(); }
				else if (input.equalsIgnoreCase("No") ) {
					System.out.println(y + "Goodbye, until next time");
				}
			
		} //end of if Statement
	} //end of ExitFrame Method
	



} //end of class 

