
//鸟类
public class Bird {
    private int flyheight;//飞行高度
    private int xpos;//距离y轴（窗口左边缘）的位置，
    public static int up=1;//向上飞
    public static int down=-1;//向下飞
    public Bird()
    {
        flyheight=200;
        xpos=30;
    }
    public void fly(int direction)
    {
        if(direction==Bird.up)
            flyheight-=20;//每次向上飞20m
        if(direction==Bird.down)
            flyheight+=20;//每次向下飞20m
    }
    public int getflyheight()//获得当前飞行高度
    {
        return flyheight;
    }
    public int getxpos()//获得当前鸟的水平位置
    {
        return xpos;
    }
    public boolean hit(Pipe Pipe[])//检测是否碰到管道。只有在鸟经过管道的过程才有可能相撞
    {
        for(int i=0;i<Pipe.length;i++)//遍历管道进行检测，是否相撞
        {
            if(getxpos()+20>=Pipe[i].getxpos()&&getxpos()<=Pipe[i].getxpos()+20)//鸟经过管道
                if(flyheight<Pipe[i].getupheight()||flyheight>Pipe[i].getdownheight())//鸟与管道相撞
                    return true;
        }
        return false;
    }
}