
package com.example.devops.app;

public class App {
    public static void main(String[] args) {
        AppService svc = new AppService();
        String msg = svc.greet("DevOps Engineer");
        System.out.println(msg);
    }
}
