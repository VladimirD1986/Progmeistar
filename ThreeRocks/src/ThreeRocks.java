import java.util.Scanner;

public class ThreeRocks {
    public static void game(){
        int i = 0;
        int count;
        int rockA, rockB, guessA, guessB;
        char chooseP = 'A';
        Player a = new Player();
        Player b = new Player();

        while((a.count() != 0) && (b.count() != 0)) {
            i++;
            System.out.print("Round " + String.format("%2d", i) + ": ");
            rockA = a.roll();
            rockB = b.roll();
            count = rockA + rockB;
            if (chooseP == 'A') {
                guessA = Player.guess(a.count() + b.count());
                System.out.print("A(" + a.count() + "):Roll(" + rockA + "):Choose(" + guessA + ")  ");
                do {
                    guessB = Player.guess(a.count() + b.count());
                } while (guessB == guessA);
                System.out.print("B(" + b.count() + "):Roll(" + rockB + "):Choose(" + guessB + ")  ");
            }
            else {
                guessB = Player.guess(a.count() + b.count());
                System.out.print("B(" + b.count() + "):Roll(" + rockB + "):Choose(" + guessB + ")  ");
                do {
                    guessA = Player.guess(a.count() + b.count());
                } while (guessB == guessA);
                System.out.print("A(" + a.count() + "):Roll(" + rockA + "):Choose(" + guessA + ")  ");
            }

            //System.out.print("A(" + a.count() + "):Roll(" + rockA + "):Choose(" + guessA + ")  ");
            //System.out.print("B(" + b.count() + "):Roll(" + rockB + "):Choose(" + guessB + ")  ");

            System.out.print("Rocks Summary = " + count + ", ");

            if (guessA == count) {
                System.out.println("A WINS!");
                a.win();
                chooseP = 'A';
            }
            else if (guessB == count) {
                System.out.println("B WINS!");
                b.win();
                chooseP = 'B';
            }
            else {
                System.out.println("NO ONE WINS!");
            }
        }
        if (a.count() == 0) {
            System.out.print("A WINS THE GAME!");
        }
        else {
            System.out.print("B WINS THE GAME!");
        }
    }

    public static void main(String[] args) {
        String s;
        Scanner c = new Scanner(System.in);
        System.out.print("Press Enter to Start the game.");
        s = c.nextLine();
        ThreeRocks.game();
    }
}
