package com.tryking.java9;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * @author tryking
 */
public class BetterTryWithResource {
    public static void main(String[] args) throws IOException {
        System.out.println(beforeJava9("test"));
        System.out.println(Java9("test"));
    }

    private static String beforeJava9(String message) throws IOException {
        // Try-with-resources是 java7 中一个新的异常处理机制，它能够很容易地关闭在try-catch语句块中使用的资源。
        // 所有实现了java中的java.lang.AutoCloseable接口的类都可以在try-with-resources结构中使用。
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        try (BufferedReader br1 = br) {
            return br1.readLine();
        }
    }

    private static String Java9(String message) throws IOException {
        // 以上实例中我们需要在 try 语句块中声明资源 br1，然后才能使用它。
        //在 Java 9 中，我们不需要声明资源 br1 就可以使用它，并得到相同的结果。
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        try (br) {
            return br.readLine();
        }
    }
}
