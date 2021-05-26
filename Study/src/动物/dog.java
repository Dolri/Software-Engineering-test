package 动物;

public class dog extends animal
{
    public dog(int shoutnum, String name) {
        super(shoutnum, name);
    }
    @Override
    protected String getshoutsound() {
        return "汪";
    }
}
