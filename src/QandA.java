import java.util.Scanner;

public class QandA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name");
        String name = s.nextLine();
        System.out.println("Hello " + name + "!");

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");

        int age = 1;
        age = scan.nextInt();

        if (age < 10) {
            System.out.println("You're a yougn one");
        } else if (age > 10 & age < 20) {
            System.out.println("You're probably around my age!");
        } else if (age > 20) {
            System.out.println("YOu're still pretty yougn");
        } else if (age > 30) {
            System.out.println("You're already getting old");
        } else if (age > 40) {
            System.out.println("You're pretty old already");
        }

        System.out.println("How are you feeling today on a scale from 1 to 10");

        int mood = 1;
        mood = scan.nextInt();

        if (mood == 10) {
            System.out.println("Thats fantastic");
        } else if (mood > 5 & mood < 10) {
            System.out.println("Thats great");
        } else if (mood < 5) {
            System.out.println("Thats too bad");
        } else if (mood == 4) {
        }

    }

}




        




