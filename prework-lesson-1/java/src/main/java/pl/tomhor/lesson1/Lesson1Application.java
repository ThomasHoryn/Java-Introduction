package pl.tomhor.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Lesson1Application {

    public static void main(String[] args) {
        //https://data-flair.training/blogs/read-java-console-input/
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
        SpringApplication.run(Lesson1Application.class, args);
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        int a = in.nextInt();
        System.out.println("You entered integer "+a);
    }

}
