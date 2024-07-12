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
                System.out.println("guess number is low");
            } else if (b < a) {
                System.out.println("guess number is higher");
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
            System.out.println("you cleared in round 1");
        } else if (c > 5 && c < 10) {
            System.out.println("you clear in round 2");
        } else {
            System.out.println("you cleared in round 3");
        }
    }
    public void playagain(){
        generaterandomnumber();
        takeinput();
        iscorrectnumber();
        numberofguess();
    }

}
//Driver Code
public class guessthenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        playinggame play = new playinggame();
        play.generaterandomnumber();
        play.takeinput();
        play.iscorrectnumber();
        play.numberofguess();
        
        System.out.println("Do you want to play again?");
        String str=sc.next();
        if(str.toUpperCase()=="YES"){
            play.playagain();
        }
        else{
            System.out.println("code runs sucessfully");
        }


    }
}
