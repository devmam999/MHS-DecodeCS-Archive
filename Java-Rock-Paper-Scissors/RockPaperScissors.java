import java.io.Console;

public class RockPaperScissors {
    public String getComputerAnswer(){
        int num = (int)(Math.random() * 3);
        String answer = "";
        if(num == 0){
            answer = "Rock";
        }
        else if(num == 1){
            answer = "Paper";
        }
        else{
            answer = "Scissor";
        }
        return answer;
    }
    
    public String getMyAnswer(){
        Console cnsl = System.console(); 
        String str = cnsl.readLine("Choose your move: Rock, Paper, or Scissor ");
        if(!str.equals("Rock") && !str.equals("Paper") && !str.equals("Scissor")){
            System.out.println("Error");
            System.exit(0);
        }  
        return str;
    }

    public void game(String cAnswer, String mAnswer){
        if (cAnswer.equals("Rock")){
            if(mAnswer.equals("Paper")){
                System.out.println("You win");
            }
            else if(mAnswer.equals("Rock")){
                System.out.println("Tie");
            }
            else{
                System.out.println("You lose");
            }
        }
        else if (cAnswer.equals("Paper")){
            if(mAnswer.equals("Paper")){
                System.out.println("Tie");
            }
            else if(mAnswer.equals("Rock")){
                System.out.println("You lose");
            }
            else{
                System.out.println("You win");
            }
        }
        else{
            if(mAnswer.equals("Paper")){
                System.out.println("You lose");
            }
            else if(mAnswer.equals("Rock")){
                System.out.println("You win");
            }
            else{
                System.out.println("Tie");
            }
        }
    }
}