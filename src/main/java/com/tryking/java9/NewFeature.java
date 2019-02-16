package com.tryking.java9;

import java.util.List;
import java.util.Set;

/**
 * @author tryking
 */
public class NewFeature {
    public static void main(String[] args) {

        // 1. 增加 NewFeature，在jshell中可以直接输入表达式并查看其执行结果。
        //    当需要测试一个方法的运行效果，或是快速的对表达式进行求值时，jshell都非常实用。

        // 2. 在集合上，java9 增加了 List.of() 、 Set.of()、 Map.of()等工厂方法来创建不可变集合。
        // 在之前需要使用 Collections.unmodifiableSet() 等方法来实现。


        // 3. 引入模块系统，并且将 JDK 也进行了模块化，JDK9 一共由 94 个模块组成
        //    通过新增的 jlink 工具可以创建出每个应用所独有的Java运行时镜像。

        List<String> citys = List.of("Beijing", "Shanghai", "Nanjing");
        System.out.println(citys.toString());

        Set<String> strings = Set.of("1", "2");
        System.out.println(strings.toString());

    }
}
