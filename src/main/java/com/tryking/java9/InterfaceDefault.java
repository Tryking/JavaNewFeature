package com.tryking.java9;

/**
 * @author tryking
 */
public class InterfaceDefault {
    public static void main(String[] args) {
        // Java8 之前，接口可以有 常量 和 抽象方法，我们不能在接口中提供方法实现
        // Java8 接口中，引入了新功能 -- 默认方法 和 静态方法
        // Java9 不仅像 Java8 一样支持接口默认方法，同时还支持私有方法。
        // 在 Java9 中，一个接口能定义的中变量、方法：
        //      常量，抽象方法、默认方法、静态方法、私有方法、私有静态方法
    }

    class LogOracle implements logging {

    }

    interface logging {
        String ORACLE = "Oracle_Database";
        String MYSQL = "Mysql_Database";

        private void log(String message, String prefix) {
            getConnection();
            System.out.println("Log Message : " + prefix);
            closeConnection();
        }

        default void logInfo(String message) {
            log(message, "INFO");
        }

        static void getConnection() {
            System.out.println("Open Database connection");
        }

        static void closeConnection() {
            System.out.println("Close Database connection");
        }
    }
}
