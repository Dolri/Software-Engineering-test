package jisuanqi;

public class jsfactory {
    public static jisuan inputs(String jstype)
    {
        switch (jstype)
        {
            case "+":
                return new add();

            case "-":
                return new minus();

            case "*":
                return new mul();

            default:
                return new div();

        }
    }
}
