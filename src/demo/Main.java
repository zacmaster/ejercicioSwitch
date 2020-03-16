package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator. Please write an operation :)");
        String input = sc.nextLine();
        System.out.println(calculate(input));


    }

    public static String calculate(String input){
        String[] words = input.split(" ");
        String operador = words[1];
        Long n1 = Long.valueOf(words[0]);
        Long n2 = Long.valueOf(words[2]);
        switch (operador){
            case "+":
                return (n1 + n2) + "";
            case "-":
                return  (n1 - n2) + "";
            case "*":
                return (n1 * n2) + "";
            case "/":
                if(n2 == 0) return "Division by zero!";
                else return (n1 / n2) + "";
            default:
                return "Unknow operator";
        }
    }
}
