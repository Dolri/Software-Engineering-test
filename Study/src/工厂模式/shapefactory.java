package 工厂模式;

public class shapefactory {
    public static shape getshape(String inputshape)
    {
        if(inputshape == null)
            return null;
        if(inputshape.equals("circle"))
        {
                 return new circle();
        }
        else if(inputshape.equals("square"))
        {
                  return new square();
        }
        else if(inputshape.equals("triangle"))
        {
            return new triangle();
        }
        else {
            return null;
        }
    }
}
