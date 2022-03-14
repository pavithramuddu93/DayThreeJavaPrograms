package com.linecomparison;
public class UC1LineComparison {
        public static void line() {
            System.out.println("Welcome to line comparison computation program");
            Integer x1 = 2, x2 = 6, y1 = 5, y2 = 4;
            Integer c1 = 2, c2 = 6, d1 = 4, d2 = 5;
            Double AB, CD;
            AB = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
            System.out.println("Length of line AB :" + AB);
        }
    public static void main(String[] args) {
        UC1LineComparison l = new UC1LineComparison();
        l.line();

    }

}