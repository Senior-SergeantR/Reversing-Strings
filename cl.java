package ReversingStrings;


import java.util.Scanner;

public class cl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the String Reverse App" +
                "\n Enter the String to reverse: ");
        String entry = sc.nextLine();

        String nonStrg ="";

        char ch;

        System.out.println("Original String: "+ entry);


        for (int i = 0; i<entry.length(); i++){
            ch = entry.charAt(i);
            nonStrg=ch+nonStrg;

        }

        System.out.println("Reversed String:  "+nonStrg);

    }
}
