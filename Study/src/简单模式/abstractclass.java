package 简单模式;

public abstract class  abstractclass
{
    public void TemplateMethod()
    {
        specificmethod();
        abstractmethod1();
        abstractmethod2();
    }

    public abstract void abstractmethod1();
    public abstract void abstractmethod2();
    public void specificmethod()
    {
        System.out.println(1);
    }

}
