//Arkadii Redozubov 3187445
package griffith;

import java.util.Scanner;
import java.util.Random;

public class ChoiceAdventure {
	//creating scanner, random objects that are available for all methods
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {
		//declaring variables
		int language = 0;
		int difficulty = 1;
		int speedChoice = 2;
		int userChoice = 0;
		boolean isRunning = true;
		WreckageAndWhispers.MessagesData.welcomeMessage(); //call the method that displays welcome message
		//menu system, works until the user wants to exit
		while(isRunning) {
			menu(language); //call menu method
			userChoice = userChoice(1,5); //call userChoice method, which takes min and max numbers, returned user choice stores in the variable
			//switch statement for the user's input
			switch(userChoice) {
			case 1 -> {
				int speed = (speedChoice == 1)? 60:(speedChoice == 3)? 15: 30; //ternary operator to check the speed choice, 2(normal) is a default one
				int finalHp = theShoresOfKaimere(difficulty, speed, language); //start the game by calling the method
				//win condition
				if(finalHp>0) {
					WreckageAndWhispers.MessagesData.victoryMessage(language); //call the method that displays victory message
					pressEnter(language); //the method asks to press enter
				}
				//lose condition
				else {
					WreckageAndWhispers.MessagesData.gameOverMessage(language); //game over message
					pressEnter(language);
				}

			}
			//Change the speed
			case 2 -> {
				speedDifficultyLanguage(WreckageAndWhispers.GameInteerface.speed[language]); //prints speed settings data 
				speedChoice = userChoice(1,3);
				//depending on the user choice and language, store the correct speed name for the clarification method
				String result;
				if(language == 0)
					result = (speedChoice == 1) ? "Slow" : (speedChoice == 2) ? "Normal" : "Fast";
				else if(language == 1)
					result = (speedChoice == 1) ? "Медленная" : (speedChoice == 2) ? "Обычная" : "Быстрая";
				else
					result = (speedChoice == 1) ? "Повільна" : (speedChoice == 2) ? "Звичайна" : "Швидка";
				clarification(result, language, 0); //call the method
				pressEnter(language);
			}
			//Change the difficulty
			case 3 ->{
				//use the same methods as in the speed settings, pass different arguments
				speedDifficultyLanguage(WreckageAndWhispers.GameInteerface.difficulty[language]);
				difficulty = userChoice(1,4);
				String result;
				if(language == 0)
					result = (difficulty == 1) ? "Easy" : (difficulty == 2) ? "Normal" : (difficulty == 3) ? "Hard" : "Impossible";
				else if(language == 1)
					result = (difficulty == 1) ? "Легкий" : (difficulty == 2) ? "Обычный" : (difficulty == 3) ? "Сложный" : "Невозможный";
				else
					result = (difficulty == 1) ? "Легкий" : (difficulty == 2) ? "Звичайний" : (difficulty == 3) ? "Складний" : "Неможливий";
				clarification(result, language, 1);
				pressEnter(language);
			}
			//Change the language
			case 4 -> {
				speedDifficultyLanguage(WreckageAndWhispers.GameInteerface.language[language]);
				language = (userChoice(1,3)-1); //store the chosen language, subtract 1 because array's indices start from 0
				String result = (language == 0) ? "English" : (language == 1) ? "Русский" : "Українська";
				clarification(result, language, 2);
				pressEnter(language);
			}
			//Exit condition
			case 5 -> {
				exit(language); //call exit method that displays exiting text
				isRunning = false; // looping ends
			}
			}
		}
	}
	//main game method, returns users health points
	public static int theShoresOfKaimere(int difficulty, int speed, int language) {
		int healthPoints = 5; //declaring initial health points
		title(WreckageAndWhispers.Chapter1.chapter1Title, language); //call the method that prints the title with time interval between letters
		loop(WreckageAndWhispers.Chapter1.chapter1, 7, 8, speed, language); //call the method that prints the chapter with time interval between letters
		char choice1 = choice(); //call the method that asks the choice
		while (true){
			//Condition if the first choice is A
			if(choice1 == 'A') {
				healthPoints = randomEvents(difficulty, 1, healthPoints, speed, language); // random events method, doesn't work by default difficulty (easy), events depend on the chapter
				if(checkGameOver(healthPoints)) return healthPoints; //check if the user lose
				loop(WreckageAndWhispers.Chapter1.chapter1A, 3, 4, speed, language);
				char choice1Add = choice();
				//call the method for the first chapter outcomes
				char end = end(choice1Add, WreckageAndWhispers.Chapter1.chapter1NeutralEnding, WreckageAndWhispers.Chapter1.chapter1BestEnding, speed, language);
				if(end == 'A') {
					healthPoints = hp(healthPoints, 1, false, language);
					if(checkGameOver(healthPoints)) return healthPoints; //game over checks are used after every change in the health points
					healthPoints = randomEvents(difficulty, 11, healthPoints, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					int[][] space = {{5,6}, {2,3}, {3,4}, {0,0}, {0,0}, {0,0}, {0,0}}; //2D array for the spaces in the loop method
					boolean[] positive = new boolean[4]; //stores hp change (positive or negative), just declare 4 elements since false is a default value
					//call the chapter 2 outcome method, passing different 2d arrays, spaces, health points, changes in health...
					healthPoints = end2(
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2NeutralEndingTitle,
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2NeutralEnding,
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2NeutralEndingA,
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2NeutralEndingB,
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2HardenedSurvivor, 
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2LuckyBreak,
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2TidesToll,
							WreckageAndWhispers.Chapter2NeutralEndingData.chapter2PracticalSuccess,
							space, healthPoints, 1, 3, 4, 0,positive, true, true, false, false, difficulty, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					break;
				}
				else {
					healthPoints = hp(healthPoints, 0, false, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					healthPoints = randomEvents(difficulty, 11, healthPoints, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					int[][] space = {{4,5}, {4,5}, {3,4}, {0,0}, {0,0}, {0,0}, {0,0},};
					boolean[] positive = new boolean[4];
					healthPoints = end2(
							WreckageAndWhispers.Chapter2BestEndingData.chapter2BestEndingTitle,
							WreckageAndWhispers.Chapter2BestEndingData.chapter2BestEnding,
							WreckageAndWhispers.Chapter2BestEndingData.chapter2BestEndingA,
							WreckageAndWhispers.Chapter2BestEndingData.chapter2BestEndingB,
							WreckageAndWhispers.Chapter2BestEndingData.chapter2SecretKeeper, 
							WreckageAndWhispers.Chapter2BestEndingData.chapter2Prisoner,
							WreckageAndWhispers.Chapter2BestEndingData.chapter2Consultant,
							WreckageAndWhispers.Chapter2BestEndingData.chapter2Prospector,
							space, healthPoints, 0, 2, 0, 1, positive, false, false, true, false, difficulty, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					break;
				}
			}
			//Condition if the first choice is B
			else if(choice1 == 'B') {
				healthPoints = randomEvents(difficulty, 1, healthPoints, speed, language);
				if(checkGameOver(healthPoints)) return healthPoints;
				loop(WreckageAndWhispers.Chapter1.chapter1B, 5, 6, speed, language);
				char choice1Add = choice();
				char end = end(choice1Add, WreckageAndWhispers.Chapter1.chapter1BadEnding, WreckageAndWhispers.Chapter1.chapter1GoodEnding, speed, language);
				if(end == 'A') {
					healthPoints = hp(healthPoints, 1, false, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					healthPoints = randomEvents(difficulty, 11, healthPoints, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					int[][] space = {{6,7}, {3,4}, {3,4}, {0,0}, {0,0}, {0,0}, {0,0}};
					boolean[] positive = {false, true, false, false}; //positive[1] is true since the change in hp is positive
					healthPoints = end2(
							WreckageAndWhispers.Chapter2BadEndingData.chapter1BadEndingTitle,
							WreckageAndWhispers.Chapter2BadEndingData.chapter2BadEnding,
							WreckageAndWhispers.Chapter2BadEndingData.chapter2BadEndingA,
							WreckageAndWhispers.Chapter2BadEndingData.chapter2BadEndingB,
							WreckageAndWhispers.Chapter2BadEndingData.chapter2Catalyst, 
							WreckageAndWhispers.Chapter2BadEndingData.chapter2PatientSurvivor,
							WreckageAndWhispers.Chapter2BadEndingData.chapter2Downfall,
							WreckageAndWhispers.Chapter2BadEndingData.chapter2Hermit,
							space, healthPoints, 0, 1, 4, 2, positive, false, false, false, false, difficulty, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					break;
				}
				else {
					healthPoints = hp(healthPoints, 0, false, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					healthPoints = randomEvents(difficulty, 11, healthPoints, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					int[][] space = {{5,6}, {6,7}, {6,7}, {0,0}, {0,0}, {0,0}, {0,0}};
					boolean[] positive = new boolean [4];
					healthPoints = end2(
							WreckageAndWhispers.Chapter2GoodEndingData.chapter1GoodEndingTitle,
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2GoodEnding,
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2GoodEndingA,
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2GoodEndingB,
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2Sentinel,
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2Survivor, 
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2DisgracedHero,
							WreckageAndWhispers.Chapter2GoodEndingData.chapter2TrueCaptain,
							space, healthPoints, 2, 0, 1, 0, positive, false, false, false, true, difficulty, speed, language);
					if(checkGameOver(healthPoints)) return healthPoints;
					break;
				}
			}
		}	
		return healthPoints; //return healthPoints that are checked in the main method
	}
	//the method that makes a time interval between letters, making the text more engaging to read
	public static void sleep(long milSec) {
		//always must user try catch to handle interruptions
		try {
			Thread.sleep(milSec);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	//the method prints the stories text, looping iterating the specific array in 2D array depends on the language
	public static void loop(String[][] arr, int firstLine, int secondLine, int speed, int language) {
		for(int i = 0; i < arr[language].length; i++) {
			//prints spaces where needed
			if(i == firstLine || i == secondLine)
				System.out.println();
			//for each loop to iterate through the sentence, print every letter with the time interval (calls sleep method)
			for(char letter: arr[language][i].toCharArray()) { //arr [language] is the specific array on the chosen language in 2D array 
				System.out.print(letter);
				sleep(speed);
			}
			System.out.println();
		}
	}
	//the method prints the outcome from the chapter 1, and returns the letter
	public static char end(char choice, String[][] firstArr, String[][] secondArr, int speed, int language) {
		if(choice == 'A') {
			loop(firstArr, 4, 4, speed, language);
			return 'A';
		}
		else {
			loop(secondArr, 4, 4, speed, language);
			return 'B';	
		}
	}
	//the method prints the outcome from the chapter 2, and returns the letter
	public static int end2(char[][] title, String[][] questions, String[][] choiceA,String[][] choiceB, String[][] choiceAResult1, String[][] choiceAResult2,
			String[][] choiceBResult1, String[][] choiceBResult2, int[][] space, int currentHp, int change1, int change2, int change3, int change4, boolean[] positive, 
			boolean continueHardenedSurvivor, boolean continueLuckyBreak, boolean prisoner, boolean sentinel, int difficulty, int speed, int language) {
		title(title, language);
		loop(questions, space[0][0], space[0][1], speed, language);
		char choice2 = choice();
		if(choice2 == 'A') {
			currentHp = randomEvents(difficulty, 2, currentHp, speed, language);
			if(checkGameOver(currentHp)) return currentHp;
			loop(choiceA, space[1][0], space[1][1], speed, language);
			char choice2Add = choice();
			if(choice2Add == 'A') {
				currentHp = randomEvents(difficulty, 22, currentHp, speed, language);
				if(checkGameOver(currentHp)) return currentHp;
				loop(choiceAResult1,space[3][0], space[3][1], speed, language);	
				currentHp = hp(currentHp,change1, positive[0], language);
				if(checkGameOver(currentHp)) return currentHp;
				//runs if the outcome is hardened survivor, chapter 3 exists only for few conditions
				if(continueHardenedSurvivor) {
					int[][] space1 = {{5,6}, {0,0}, {0,0}, {0,0}, {0,0}};
					boolean[] positive1 = {false, true, false, false};
					//call the chapter 3 outcome method
					currentHp = end3(
							WreckageAndWhispers.Chapter3HardenedSurvivorData.chapter3HardenedSurvivorTitle,
							WreckageAndWhispers.Chapter3HardenedSurvivorData.chapter3HardenedSurvivor,
							WreckageAndWhispers.Chapter3HardenedSurvivorData.chapter3HardenedSurvivorAOutcome1,
							WreckageAndWhispers.Chapter3HardenedSurvivorData.chapter3HardenedSurvivorAOutcome2,
							WreckageAndWhispers.Chapter3HardenedSurvivorData.chapter3HardenedSurvivorBOutcome1,
							WreckageAndWhispers.Chapter3HardenedSurvivorData.chapter3HardenedSurvivorBOutcome2,
							space1, currentHp, 3, 1, 3, 2, positive1, difficulty, speed, language);
					if(checkGameOver(currentHp)) return currentHp;
				}
				//chapter 3 for the sentinel outcome
				if(sentinel) {
					int[][] space1 = {{4,5}, {0,0}, {0,0}, {0,0}, {0,0}};
					boolean[] positive1 = {false, true, false, false};
					currentHp = end3(
							WreckageAndWhispers.Chapter3SentinelData.chapter3SentinelTitle,
							WreckageAndWhispers.Chapter3SentinelData.chapter3Sentinel,
							WreckageAndWhispers.Chapter3SentinelData.chapter3SentinelAOutcome1,
							WreckageAndWhispers.Chapter3SentinelData.chapter3SentinelAOutcome2,
							WreckageAndWhispers.Chapter3SentinelData.chapter3SentinelBOutcome1,
							WreckageAndWhispers.Chapter3SentinelData.chapter3SentinelBOutcome2,
							space1, currentHp, 3, 1, 1, 2, positive1, difficulty, speed, language);
					if(checkGameOver(currentHp)) return currentHp;
				}
			}
			else if(choice2Add == 'B') {
				currentHp = randomEvents(difficulty, 22, currentHp, speed, language);
				if(checkGameOver(currentHp)) return currentHp;
				loop(choiceAResult2,space[4][0], space[4][1], speed, language);
				currentHp = hp(currentHp,change2, positive[1], language);
				if(checkGameOver(currentHp)) return currentHp;
				//chapter 3 for the lucky break outcome
				if(continueLuckyBreak) {
					int[][] space1 = {{5,6}, {0,0}, {0,0}, {0,0}, {0,0}};
					boolean[] positive1 = {true, false, true, false};
					currentHp = end3(
							WreckageAndWhispers.Chapter3LuckyBreakData.chapter3LuckyBreakTitle,
							WreckageAndWhispers.Chapter3LuckyBreakData.chapter3LuckyBreak,
							WreckageAndWhispers.Chapter3LuckyBreakData.chapter3LuckyBreakAOutcome1,
							WreckageAndWhispers.Chapter3LuckyBreakData.chapter3LuckyBreakAOutcome2,
							WreckageAndWhispers.Chapter3LuckyBreakData.chapter3LuckyBreakBOutcome1,
							WreckageAndWhispers.Chapter3LuckyBreakData.chapter3LuckyBreakBOutcome2,
							space1, currentHp, 2, 2, 1, 2, positive1, difficulty, speed, language);
					if(checkGameOver(currentHp)) return currentHp;
				}
				//chapter 3 for the prisoner outcome
				if(prisoner) {
					int[][] space1 = {{5,6}, {0,0}, {0,0}, {0,0}, {0,0}};
					boolean[] positive1 = {false, true, false, true};
					currentHp = end3(
							WreckageAndWhispers.Chapter3PrisonerData.chapter3PrisonerTitle,
							WreckageAndWhispers.Chapter3PrisonerData.chapter3Prisoner,
							WreckageAndWhispers.Chapter3PrisonerData.chapter3PrisonerAOutcome1,
							WreckageAndWhispers.Chapter3PrisonerData.chapter3PrisonerAOutcome2,
							WreckageAndWhispers.Chapter3PrisonerData.chapter3PrisonerBOutcome1,
							WreckageAndWhispers.Chapter3PrisonerData.chapter3PrisonerBOutcome2,
							space1, currentHp, 3, 1, 2, 0, positive1, difficulty, speed, language);
					if(checkGameOver(currentHp)) return currentHp;
				}
			}
		}
		else if(choice2 == 'B') {
			currentHp = randomEvents(difficulty, 2, currentHp, speed, language);
			if(checkGameOver(currentHp)) return currentHp;
			loop(choiceB,space[2][0], space[2][1], speed, language);
			char choice2Add = choice();
			if(choice2Add == 'A') {
				currentHp = randomEvents(difficulty, 22, currentHp, speed, language);
				if(checkGameOver(currentHp)) return currentHp;
				loop(choiceBResult1,space[5][0], space[5][1], speed, language);	
				currentHp = hp(currentHp,change3, positive[2], language);
				if(checkGameOver(currentHp)) return currentHp;
			}
			else if(choice2Add == 'B') {
				currentHp = randomEvents(difficulty, 22, currentHp, speed, language);
				if(checkGameOver(currentHp)) return currentHp;
				loop(choiceBResult2,space[6][0], space[6][1], speed, language);
				currentHp = hp(currentHp,change4, positive[3], language);
				if(checkGameOver(currentHp)) return currentHp;
			}
		}
		return currentHp;
	}
	//the method iterates through the specific sentence (title), prints every letter with the time interval (fixed for titles)
	public static void title(char[][] arr, int language) {
		System.out.println();
		title1(); //call the method that prints lines before the title
		System.out.println();
		//for each loop to iterate though the specific sentence, depending on the language 
		for(char letter: arr[language] ) {
			System.out.print(letter);
			sleep(70);
		}
		System.out.println();
		title1(); //prints after the title
		System.out.println("\n");

	}
	//the method prints line iterating through the char array
	public static void title1() {
		System.out.println();
		char[] line = ("=====================================").toCharArray(); //casting String to char array
		for(char letter: line ) {
			System.out.print(letter);
			sleep(20); //interval of 20 mill seconds between "="
		}
		System.out.println();

	}

	//the method takes and checks the user choice during the game 
	public static char choice() {
		String choice;
		char userChoice;
		while(true){
			System.out.print("\n> ");
			//takes String initially to check if it's empty
			choice = scanner.nextLine().trim();
			//if the choice is empty -> ask again
			if(choice.isEmpty())
				continue;
			//cast the choice from String to char, make it case insensitive
			userChoice = Character.toUpperCase(choice.charAt(0));
			//if the choice does not equal to 'A' or 'B' -> ask again
			if(userChoice != 'A' && userChoice != 'B')
				continue;
			System.out.println();
			return userChoice;
		}

	}
	//the method adds or subtracts health points depending on the arguments
	public static int hp (int healthPoints, int change, boolean positive, int language) {
		System.out.println();
		int newHealthPoints = healthPoints;
		//show current health points if there is no change
		if(change == 0) {
			System.out.println(WreckageAndWhispers.GameInteerface.hp[0][language]+ healthPoints);
			return healthPoints;
		}
		//if the change in health points is positive -> add them to the current health points
		if(positive){
			newHealthPoints+= change;
			System.out.println("[+"+change+"] " + WreckageAndWhispers.GameInteerface.hp[1][language] );
			System.out.println(WreckageAndWhispers.GameInteerface.hp[0][language] + newHealthPoints);

			return newHealthPoints;
		}
		//if the change is negative -> subtract them from the current health points
		else {
			newHealthPoints-= change;
			System.out.println("[-"+change+"] " + WreckageAndWhispers.GameInteerface.hp[1][language]);
			//print new health points if the number is greater or equal to 0
			if(newHealthPoints>=0)
				System.out.println(WreckageAndWhispers.GameInteerface.hp[0][language] + newHealthPoints);
			//if the number of new health points is less than 0 -> print 0, since health points can't be negative
			else
				System.out.println(WreckageAndWhispers.GameInteerface.hp[0][language] + "0");
		}
		return newHealthPoints;

	}
	// the method prints the outcome from the chapter 3
	public static int end3(char[][] title, String[][] questions, String[][] choiceAOutcome1, String[][] choiceAOutcome2, String[][] choiceBOutcome1, 
			String[][] choiceBOutcome2, int[][] space, int currentHealth, int change1, int change2, int change3, int change4, boolean[] positive, int difficulty, int speed, int language) {
		title(title, language);
		loop(questions, space[0][0], space[0][1], speed, language);
		char choice3 = choice();
		if(choice3 == 'A') {
			currentHealth = randomEvents(difficulty, 3, currentHealth, speed, language);
			if(checkGameOver(currentHealth)) return currentHealth;
			//using object random to generate the number between 0-1, since 2 is exclusive
			int outcome = random.nextInt(0,2); //the outcome of the final choice in chapter 3 is random (50% chance)
			if(outcome == 1) {
				loop(choiceAOutcome1, space[1][0], space[1][1], speed, language);
				currentHealth = hp(currentHealth,change1,positive[0], language);
				if(checkGameOver(currentHealth)) return currentHealth;
			}
			else {
				loop(choiceAOutcome2, space[2][0], space[2][1], speed, language);
				currentHealth = hp(currentHealth,change2,positive[1], language);
				if(checkGameOver(currentHealth)) return currentHealth;
			}	
		}
		else if(choice3 == 'B') {
			currentHealth = randomEvents(difficulty, 3, currentHealth, speed, language);
			if(checkGameOver(currentHealth)) return currentHealth;
			int outcome = random.nextInt(0,2);
			if(outcome == 1) {
				loop(choiceBOutcome1, space[3][0], space[3][1], speed, language);
				currentHealth = hp(currentHealth,change3,positive[2], language);
				if(checkGameOver(currentHealth)) return currentHealth;
			}
			else {
				loop(choiceBOutcome2, space[4][0], space[4][1], speed, language);
				currentHealth = hp(currentHealth,change4,positive[3], language);
				if(checkGameOver(currentHealth)) return currentHealth;
			}
		}
		return currentHealth;
	}
	//the method prints random events using the randomEventsLogic method
	public static int randomEvents(int difficulty, int chapter, int healthPoints, int speed, int language) {
		//depending on the level of difficulty, the chances of random negative events are higher 
		if(difficulty == 2) {
			switch(chapter) { //40% of random events
			case 1 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsNormal.normalChapter1, 3, healthPoints, 1, speed, language);
			case 11 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsNormal.normalChapter11, 3, healthPoints, 1, speed, language);
			case 2 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsNormal.normalChapter2, 3, healthPoints, 1, speed, language);
			case 22 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsNormal.normalChapter22, 3, healthPoints, 2, speed, language);	
			case 3 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsNormal.normalChapter3, 3, healthPoints, 2, speed, language);
			}
		}
		if(difficulty == 3) {
			switch(chapter) { //60%
			case 1 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsHard.hardChapter1, 5, healthPoints, 2, speed, language);
			case 11 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsHard.hardChapter11, 5, healthPoints, 2, speed, language);
			case 2 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsHard.hardChapter2, 5, healthPoints, 1, speed, language);
			case 22 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsHard.hardChapter22, 5, healthPoints, 2, speed, language);	
			case 3 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsHard.hardChapter3, 5, healthPoints, 1, speed, language);
			}	
		}
		if(difficulty == 4) {
			switch(chapter) { //70%
			case 1 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsExtreme.extremeChapter1, 6, healthPoints, 1, speed, language);
			case 11 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsExtreme.extremeChapter11, 6, healthPoints, 3, speed, language);
			case 2 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsExtreme.extremeChapter2, 6, healthPoints, 3, speed, language);
			case 22 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsExtreme.extremeChapter22, 6, healthPoints, 2, speed, language);	
			case 3 -> healthPoints = randomEventsLogic(WreckageAndWhispers.RandomEventsExtreme.extremeChapter3, 6, healthPoints, 3, speed, language);
			}	
		}
		return healthPoints;
	}
	//the method uses random object to generate random events depending on the difficulty level
	public static int randomEventsLogic (String[][] event, int difficultyPercent, int healthPoints, int change, int speed, int language) {
		//generates numbers from 0 to 9
		int randomChoice = random.nextInt(0,10);
		 //if the generated number is less or equals to the difficulty percentage -> perform the event
		if(randomChoice <=difficultyPercent) {
			loop(event, 0,0, speed, language);
			healthPoints = hp(healthPoints, change, false, language); // (false) random events always are negative
			System.out.println();
		}
		return healthPoints;
	}
	//the method checks and returns true if the game is over
	public static boolean checkGameOver(int healthPoints) {
		if(healthPoints <= 0)
			return true;
		return false;
	}
	//the method prints the specific menu depending on the chosen language
	public static void menu(int language) {
		for(String choice : WreckageAndWhispers.GameInteerface.menu[language]) {
			System.out.println(choice);
		}
	}
	//the method prints the confirming message after setting something in the menu 
	public static void clarification(String result, int language, int index) {
		//prints the message the specific message from 3D array, result set in the main method and reminder of the possibility of changing later
		System.out.println(WreckageAndWhispers.GameInteerface.clarification[index][language][0] + result + WreckageAndWhispers.GameInteerface.clarification[index][language][1]);

	}
	//the method asks the user to press enter to continue (use only in menu system) to make it feel more secure
	public static void pressEnter(int language) {
		for(String choice : WreckageAndWhispers.GameInteerface.pressEnter[language]) {
			System.out.println(choice);
		}
		scanner.nextLine();
	}
	//the methods uses to print the text for speed, difficulty and language settings
	public static void speedDifficultyLanguage(String[] arr) {
		for(String choice : arr) {
			System.out.println(choice);
		}
	}
	//the method prints exit message
	public static void exit(int language) {
		for(String choice : WreckageAndWhispers.GameInteerface.exit[language]) {
			System.out.print(choice);
		}
		//prints "." 3 times at the end with time interval of 1.2 seconds to make the game exiting not instant 
		for(int i = 0; i< 3; i++) {
			System.out.print(".");
			sleep(1200);
		}
		System.out.println("\n------------------------------\n");

	}
	//the method handles the user choice in the menu system
	public static int userChoice(int minNumber, int maxNumber) {
		String userChoice;
		int userChoiceNum = 0;
		while(true){
			System.out.print("\n> ");
			userChoice = scanner.nextLine().trim();
			//check if the input is empty
			if(userChoice.isEmpty())
				continue;
			//check if the Sting matches int to eliminate error
			if(!userChoice.matches("-?\\d+"))
				continue;
			userChoiceNum = Integer.parseInt(userChoice); //if the String matches int -> cast to int
			if(userChoiceNum < minNumber || userChoiceNum > maxNumber) // if the choice is not in the given range -> ask again
				continue;
			return userChoiceNum;
		}
	}

}
