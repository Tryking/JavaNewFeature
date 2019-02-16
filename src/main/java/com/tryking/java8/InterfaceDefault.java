package com.tryking.java8;

/**
 * @author tryking
 */
public class InterfaceDefault {
    public static void main(String[] args) {
        // Java8 之前，接口可以有 常量 和 抽象方法，我们不能在接口中提供方法实现
        // Java8 接口中，引入了新功能 -- 默认方法 和 静态方法
    }

    class LogOracle implements logging {

    }

    interface logging {
        String ORACLE = "Oracle_Database";
        String MYSQL = "Mysql_Database";

        default void logInfo(String message) {
            getConnection();
            System.out.println("Log Message : " + "INFO");
            closeConnection();
        }

        static void getConnection() {
            System.out.println("Open Database connection");
        }

        static void closeConnection() {
            System.out.println("Close Database connection");
        }
    }

}
