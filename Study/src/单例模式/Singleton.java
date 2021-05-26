package 单例模式;

public class Singleton
{

    private static Singleton instance;
    private Singleton()
    {

    }
    public static Singleton GetInstance()
    {
        if(instance ==null)
        {
            instance = new Singleton();
            System.out.println(1);
        }
        else
        {
            System.out.println(2);
        }
        return instance;
    }
}
