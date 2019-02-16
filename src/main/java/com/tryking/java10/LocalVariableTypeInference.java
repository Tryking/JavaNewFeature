package com.tryking.java10;

import java.util.ArrayList;

/**
 * @author tryking
 * 局部变量类型推断
 * <p>
 * 能够帮助我们快速编写更加简洁的代码
 * <p>
 * 局部变量类型推断的保留字 var 的使用势必会引起变量类型可视化缺失，
 * 并不是任何时候使用 var 都能容易、清晰的分辨出变量的类型。
 */
public class LocalVariableTypeInference {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("2");
        System.out.println(list.toString());
        var stream = list.stream();
        System.out.println(stream.toString());
    }
}
