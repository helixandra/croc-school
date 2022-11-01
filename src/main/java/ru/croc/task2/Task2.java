package ru.croc.task2;

public class Task2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Incorrect parameters");
            System.exit(1);
        }
        int entry = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int num = Integer.parseInt(args[2]);
        int sum = entry;

        for (int i = 0; i < num - 1; ++i) {
            entry += d;
            sum += entry;
        }

        System.out.println("Sum : " + sum);
    }
}
