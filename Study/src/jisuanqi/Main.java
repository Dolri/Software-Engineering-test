package jisuanqi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个运算数");
        double number1 = sc.nextDouble();
        System.out.println("请输入运算符：");
        String jstype = sc.next();
        System.out.println("请输入第二个运算数");
        double number2 = sc.nextDouble();
        jisuan a = jsfactory.inputs(jstype);
        a.js(number1,number2);
    }
}
