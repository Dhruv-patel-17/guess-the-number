import java.util.Random;
import java.util.Scanner;

class playinggame {
    public int a;
    public int b;
    public int c = 0;

    // Generating Random number
    public int generaterandomnumber() {
        Random ran = new Random();
        b = ran.nextInt(0, 100);
        return b;
    }

    // Taking input from user
    public void takeinput() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess The Number between 0 to 100");
            a = sc.nextInt();
            if (b > a) {
                System.out.println("The number you guess is lower than the actual number");
                System.out.println("HINT: Try to maximize the number");
            } else if (b < a) {
                System.out.println("The number you guess is higher than the actual number");
                System.out.println("HINT: Try to minimize the number");
            }
            c++;
        } while (a != b);
    }

    // Prints when guess is correct
    public void iscorrectnumber() {
        System.out.println("correct Guess");
    }

    // How many rounds a user takes for guessing the correct number
    public void numberofguess() {
        if (c < 5) {
            System.out.println("Congratulations");
            System.out.println("You cleared in round 1");
        } else if (c > 5 && c < 10) {
            System.out.println("You clear in round 2");
        } else {
            System.out.println("You cleared in round 3");
        }
    }

    //for playing the game again
    public void playagain(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play again?(yes or no)");
        String str=sc.next();
        String str1=str.toUpperCase();
        if(str1.equals("YES")){
            generaterandomnumber();
            takeinput();
            iscorrectnumber();
            numberofguess();
            playagain();
            
        }
        else{
            System.out.println("code runs sucessfully");
        }
        
    }

}
//Driver Code
public class guessthenumber {
    public static void main(String[] args) {
       
        playinggame play = new playinggame();
        play.generaterandomnumber();
        play.takeinput();
        play.iscorrectnumber();
        play.numberofguess();
        play.playagain();
        
        


    }
}
