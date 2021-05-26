package 房子父类;

public class afang extends 房子父{
    @Override
    public void fangchungzi() {
        System.out.println("窗子向南");
    }

    @Override
    public void dadiji() {
      System.out.println("地基用石头建造");
    }

    @Override
    public void jianqiangti() {
        System.out.println("墙体由板砖建造");
    }
    public void diaoding()
    {
        System.out.println("巴洛克风格，十分美观");
    }
}
