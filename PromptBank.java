
/*
 * Sumaiya Fatema
 * Lodric Madramatoo
 * CMP 167
 * 16 May 2023
 * 
 * Resources used: Adrian G's project and Eliza's sample code given by Professor
 * w3Schools.com | | Arrays
 */



public class PromptBank { 
							 
	String [] questions; 
	String [] statements;
	
	public PromptBank(){
		questions = new String[4]; //we have 4 questions
		statements = new String [4];//we have 4 statements
		
	}
	

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2.";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements [3] = "It seems like BLANK1 is prominent in your life. It must be the same for BLANK2. I'm interested to know why."; 
		
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "How does BLANK1 make you feel?  Do you feel the same way about BLANK2?";
			
	}
	

 
	public String getRandomStatementTrunk(){
		int randomState = (int) (Math.random() * statements.length); //
		return statements[randomState]; 
		//!!! credits to video							
	}
	

	public String getRandomQuestionTrunk(){
		int randomQuestion = (int)(Math.random() * statements.length); //
		//int ranStatement = (int) (randomQuestion); //credit: Adrain's code
		 return questions [randomQuestion]; 
		 //return t;
		//fill in the method so it randomly selects the question template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}

}
	

