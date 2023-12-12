package com.galina_magazinova.javacore.chapter15Lambdas;

public class LambdaDemo3 {
    public static void main(String[] args) {

        // это лямбда выражение выясняет, является ли одно число множителем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10,2)){
            System.out.println("2 является множителем 10");
        }
        if(!isFactor.test(10,3)){
            System.out.println("3 не является множителем 10");
        }
    }
}
