package 动物;

public abstract class animal
{
     int shoutnum;
     String name;
     public animal(int shoutnum,String name)
     {
         this.name = name;
         this.shoutnum = shoutnum;
     }
     protected abstract String getshoutsound();
     public String shout()
     {
         String result ="";
         for(int i = 0 ; i <= shoutnum;i++)
         {
             result+= getshoutsound()+",";
         }
         return "我的名字叫做"+name+""+result;
     }
}
