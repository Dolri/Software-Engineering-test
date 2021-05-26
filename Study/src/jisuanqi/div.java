package jisuanqi;

public class div extends jisuan{
    @Override
    public void js(double number1, double number2) {
        if(number2 != 0)
           System.out.println(number1/number2);
        else
            System.out.println("除法分母不能为0");
    }
}
