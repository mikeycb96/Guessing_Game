public class GuessingGame {

    public static void main(String[] args) {

        int secretNumber = 5;
        int guess = 6;

        if(guess == secretNumber ){
            System.out.println("Correct!");
        } else if(guess > secretNumber){
            System.out.println("Too High!");
        } else if(guess < secretNumber){
            System.out.println("Too Low!");
        }
    }
}
