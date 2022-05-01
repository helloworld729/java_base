public class Pipe {
    private int upheight;//表示顶管道端的高度
    private int downheight;//表示底端管道段的高度
    private int xpos;
    public Pipe()
    {
        upheight=0;
        downheight=0;
        xpos=0;
    }
    public Pipe(int maxheight,int xpos)//给管道一个最大总长度（maxheight)=upheight+downheight。还有管道的水平位置
    {
        double num;
        num=Math.random();
        while(num==0)
            num=Math.random();
        upheight=(int) (maxheight*num);//随机产生一个顶端管道段高度（<maxheight)
        downheight=maxheight-upheight;//用总长度减去upheight
        this.xpos=xpos;
    }
    public void setxpos(int xpos)
    {
        this.xpos=xpos;
    }
    public int getxpos()
    {
        return xpos;
    }
    public int getupheight()
    {
        return upheight;
    }
    public int getdownheight()
    {
        return downheight;
    }
    public String tosting()
    {
        return "("+upheight+","+downheight+")";
    }
}