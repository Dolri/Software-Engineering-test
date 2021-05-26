package 工厂模式;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inshape = sc.next();
        shape createshape = shapefactory.getshape(inshape);
        createshape.draw();
    }
}
