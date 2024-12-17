package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class ReCap {
    public static void main(String[] args) {
        int num1 = 1, num2=2, num3=3;
        char alpha = 'a', beta = 'b', ci = 'c';

        System.out.println("Το num είναι: " + (++num1 + num2));
        System.out.println(num1);
        System.out.println("Οι χαρακτήρες είναι: "+ alpha +" + " + beta +" + " + ci + " και όλοι μαζί :" + (alpha +beta + ci));

        BigInteger megaloNoumero1 = new BigInteger("1000000000");
        BigInteger megaloNoymero2 = new BigInteger("2000000000");
        BigInteger sum;
        int quiz = (int) (Math.random() * 4);

        sum = megaloNoumero1.add(megaloNoymero2);

        System.out.printf("Το σύνολο των μεγάλων είναι: %,d\n" ,sum);
        System.out.printf("Το μιμιμουμ της μεταβλητής είναι: %d\n" , quiz);

    }
}