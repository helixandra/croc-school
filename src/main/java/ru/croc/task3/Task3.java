package ru.croc.task3;

public class Task3 {
    static class Point {
        double x;
        double y;
    }

    public static double getSideLength(Point first, Point second) {
        return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 2));
    }

    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Incorrect parameters");
            System.exit(1);
        }

        Point A = new Point();
        Point B = new Point();
        Point C = new Point();

        A.x = Double.parseDouble(args[0]);
        A.y = Double.parseDouble(args[1]);
        B.x = Double.parseDouble(args[2]);
        B.y = Double.parseDouble(args[3]);
        C.x = Double.parseDouble(args[4]);
        C.y = Double.parseDouble(args[5]);

        double AB = getSideLength(A, B);
        double BC = getSideLength(B, C);
        double AC = getSideLength(A, C);
        double p = (AB + BC + AC) / 2;
        double area = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));

        System.out.println("Площадь треугольника : " + String.format("%.2f", area));
    }
}
