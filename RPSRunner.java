//Kacey Wheeler
//AP Computer Science: 3B
//11-4-19
//Boolean Labs Part 2
//Rock Paper Scissors Runner

package boo2;
import java.util.Scanner;
import boo2.RockPaperScissors;

public class RPSRunner {
	public static void main(String[] args) {
		
		//Create new Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Get input from player for their choice
		System.out.println("Rock-Paper-Scissors - Pick your weapon[R,P,S]: ");
		char player = keyboard.next().charAt(0);
		
		//Output player choice
		System.out.println("Player had " + player);
		
		//Create new object
		RockPaperScissors ref = new RockPaperScissors();
		
		//Save random choice of computer as variable
		char computer = ref.setComputer();
		
		//Output computer random choice
		System.out.println("Computer had " + computer);
		
		//Output who wins the game
		System.out.println(ref.wins(player, computer));
		
		
		
		
		

}
}