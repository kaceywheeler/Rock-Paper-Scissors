//Kacey Wheeler
//AP Computer Science: 3B
//11-4-19
//Boolean Labs Part 2
//Rock Paper Scissors

package boo2;

import java.util.Random;
public class RockPaperScissors {
	
	public char setComputer() {
		
		char computer = 0;
		int num = (int)(Math.random() * 2);
		
		switch (num) {
			case 0 : computer = 'R'; break;
			case 1 : computer = 'P'; break;
			case 2 : computer = 'S'; break;
		}
		return computer;
		}
	
	//Method to calculate who wins the game of rock, paper, scissors
	public String wins(char player, char computer) {
		String answer;
		
		//Instances where player wins
		if (player == 'R'&& computer == 'S') {
			answer = "!Player wins <<Rock Breaks Scissors>>!";
		}
		
		else if (player == 'P' && computer == 'R') {
			answer = "!Player wins <<Paper Covers Rock>>!";
		}
		
		else if (player == 'S' && computer == 'P') {
			answer = "!Player wins <<Scissors Cuts Paper>>!";
		}
		
		//Instances where computer wins
		else if (computer == 'R'&& player == 'S') {
			answer = "!Computer wins <<Rock Breaks Scissors>>!";
		}
		
		else if (computer == 'P' && player == 'R') {
			answer = "!Computer wins <<Paper Covers Rock>>!";
		}
		
		else if (computer == 'S' && player == 'P') {
			answer = "!Computer wins <<Scissors Cuts Paper>>!";
		}
	
		//Instances where computer and player pick the same
		else if (computer == player) {
			answer = "!Draw Game!";
		}
		
		//If program or computer inputs are not valid
		else {
			answer = "!Input not valid!";
		}
		
		//Return result of game
		return answer;
	
}
}
