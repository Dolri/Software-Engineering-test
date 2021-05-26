package 复杂模式;

public abstract class hookabstractclass
{
     public void templatemethod()
     {
       abstractmethod1();
       hookmethod();
       if(hookmethod1())
       {
           specificmethod();
       }
       abstractmethod2();
     }

    protected abstract void abstractmethod1();

    protected abstract void abstractmethod2();

    private void specificmethod()
    {
        System.out.println(1);
    }

    protected  boolean hookmethod1()
    {
        return true;
    }

    private void hookmethod()
    {

    }


}
