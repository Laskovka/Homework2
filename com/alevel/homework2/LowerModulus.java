package com.alevel.homework2;

public class LowerModulus {
    public static void main(String[] args) {
        double numberOne = 3.9;
        double numberTwo = -6.4;
        double numberThree = -3.7;
        double moduleOfNumberOne = numberOne > 0 ? numberOne : numberOne * -1;
        double moduleOfNumberTwo = numberTwo > 0 ? numberTwo : numberTwo * -1;
        double moduleOfNumberThree = numberThree > 0 ? numberThree : numberThree * -1;
        if (moduleOfNumberOne <= moduleOfNumberTwo && moduleOfNumberOne <= moduleOfNumberThree) {
            System.out.println(moduleOfNumberOne);
        } else if (moduleOfNumberTwo <= moduleOfNumberOne && moduleOfNumberTwo <= moduleOfNumberThree) {
            System.out.println(moduleOfNumberTwo);
        } else {
            System.out.println(moduleOfNumberThree);
        }
    }
}
