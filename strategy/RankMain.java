package strategy;

enum Rank{
    ;

    private final int match;
    private final int money;
    private int count;

    Rank(int match, int money) {
        this.match = match;
        this.money = money;
    }

    public void pulsCount(){
        this.count++;
    }
}


public class RankMain {

    public static void main(String[] args) {



    }

}
