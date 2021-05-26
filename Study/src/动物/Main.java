package 动物;

public class Main
{
    public static void main(String[] args)
    {
        cat a = new cat(5,"小乖");
        dog b = new dog(4,"小可");
        String B =  a.shout();
        String c = b.shout();
        System.out.println(B);
        System.out.println(c);
    }
}
