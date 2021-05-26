package 单例模式;

public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.GetInstance();
        Singleton b = Singleton.GetInstance();
    }
}
