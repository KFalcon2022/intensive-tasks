package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = -5;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {

        String answer="";
        byte answerCount = 0;
        double x1,x2;

        if (a==0 & b!=0 ){
            //это линейное уравнение
            answerCount = 1;
            x1 = -1*c/b;
            answer = "Корень: "+x1;
        } else{

            double d;
            d = Math.pow(b, 2) - 4 * a * c;

            if(d==0 & a!=0){
                answerCount = 1;
                x1 = -1*b/(2*a);
                answer = "Корень: "+x1;
            } else if (d>0) {
                answerCount = 2;
                answer = "Корни: ";
                x1 = (-1*b+Math.sqrt(d))/(2*a);
                x2 = (-1*b-Math.sqrt(d))/(2*a);

                if (x1<x2){
                    answer += x1 + ";" + x2;
                }else {
                    answer += x2 + ";" + x1;
                }
            }
        }
        answer = "Количество решений: "+answerCount + ". " + answer;
        return answer;
    }
}