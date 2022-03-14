package com.linecomparison;

public class UC2LineComparison {
    public void line()
    {
        Integer x1=2, x2=6, y1=5, y2=4;
        Integer c1=2, c2=6, d1=4, d2=5;
        Double AB, CD;

        AB = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of line AB :" +AB);

        CD = Math.sqrt((c2-c1)^2+(d2-d1)^2);
        System.out.println("Length of line CD :" +CD);

        System.out.println("Check two lines are equal or not :");
        System.out.println(AB.equals(CD));

        System.out.println("Compare two Lines :");
        System.out.println(AB.compareTo(CD));
    }
    public static void main(String[] args) {
        UC2LineComparison l = new UC2LineComparison();
        l.line();

    }
}

