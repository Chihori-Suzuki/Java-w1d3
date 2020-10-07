import java.lang.Math;
import java.util.Scanner;

public class SchissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int comuter = (int)(Math.random() * 3);

        String strCom = "";
        String strUser = "";
        String result = "";

        switch(comuter){
            case 0:
                strCom = "scissor";
                if(user == 0){
                    strUser = "scissor too";
                    result = "It is a draw";
                }else if (user == 1){
                    strUser = "rock";
                    result = "You lose";
                }else if (user == 2){
                    strUser = "paper";
                    result = "You won";
                }
                break;
            case 1:
                strCom = "rock";
                if(user == 0){
                    strUser = "scissor";
                    result = "You lose";
                }else if (user == 1){
                    strUser = "rock too";
                    result = "It is a draw";
                }else if (user == 2){
                    strUser = "paper";
                    result = "You won";
                }
                break;
            case 2:
                strCom = "paper";
                if(user == 0){
                    strUser = "scissor";
                    result = "You lose";
                }else if (user == 1){
                    strUser = "rock";
                    result = "You won";
                }else if (user == 2){
                    strUser = "paper too";
                    result = "It is a draw";
                }
                break;
        }
        System.out.println("The computer is " + strCom + ". You are " + strUser + ". " + result + ".");
    }
}
