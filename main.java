public class Main
{
    public static void main(String[] args){
        RockPaperScissors rps = new RockPaperScissors();
        String computerAnswer = rps.getComputerAnswer();
        String myAnswer = rps.getMyAnswer();
        System.out.println("Your move is " + myAnswer);
        System.out.println("Computer's move is " + computerAnswer);
        rps.game(computerAnswer, myAnswer);
    }
}
