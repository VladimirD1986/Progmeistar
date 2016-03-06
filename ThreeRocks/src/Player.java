import java.util.Random;

public class Player {
    int rocks = 3;
    public void win(){
        this.rocks--;
    }

    public int roll(){
        Random rand = new Random();
        return rand.nextInt(this.rocks + 1);
    }

    public static int guess(int i){
        Random rand = new Random();
        return rand.nextInt(i + 1);
    }

    public int count(){
        return this.rocks;
    }

}
