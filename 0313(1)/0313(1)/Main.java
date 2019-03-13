import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        Ashe ashe = new Ashe();
        Jhin jhin = new Jhin();

        ashe.showInfo();
        System.out.println();
        jhin.showInfo();

        System.out.println("\njhin is attacked from ashe");

        jhin.hurt(ashe.qAttack());

        ashe.showInfo();
        System.out.println();
        jhin.showInfo();

        System.out.println("\njhin is attacked from ashe");

        jhin.hurt(ashe.eAttack());

        ashe.showInfo();
        System.out.println();
        jhin.showInfo();
    }
}
