package gr.aueb.cf.ch2;

public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 65;
        int start =10;
        int hop = 30;
        int jumps =0;
        boolean diafora;

        jumps = (target - start) / hop + 1;

        System.out.println(jumps);
    }
}
