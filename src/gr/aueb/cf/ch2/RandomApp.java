package gr.aueb.cf.ch2;

public class RandomApp {
    public static void main(String[] args) {

        int max =6;
        int min =1;

        int die = (int) (Math.random() * (max-min+1) + 1);
        System.out.println(die);
    }
}
