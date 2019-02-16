package com.tryking.java8;

/**
 * @author tryking
 */
public class Lambda {
    public static void main(String[] args) {
        // Lambda 表达式允许把函数作为一个方法的参数（函数作为参数传递进方法中）
        // 使用 Lambda 表达式可以使代码变的更加简洁紧凑

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // 不用声明类型
        MathOperation subtraction = (a, b) -> 0;
        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        Lambda lambda = new Lambda();
        System.out.println(lambda.operate(1,2,addition));

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
