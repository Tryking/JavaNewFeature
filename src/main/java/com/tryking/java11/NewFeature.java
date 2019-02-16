package com.tryking.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author tryking
 */
public class NewFeature {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. 在 Java 10 中，var 变量不能在 Lambda 中声明，而在 Java 11 中，可以在 Lambda 中声明
        // (var x, var y) -> x.process(y)
        //  等价于
        //  (x, y) -> x.process(y)

        // 2. 标准化的 HTTP Client API
        //   以前在程序中使用 HttpClient 时，需要引入 apache 的工具包，现在变为了原生。
        String uri = "http://www.baidu.com/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
