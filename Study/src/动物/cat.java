package 动物;

public class cat extends animal
{

    public cat(int shoutnum, String name) {
        super(shoutnum, name);
    }

    @Override
    protected String getshoutsound() {
        return "喵";
    }
}
