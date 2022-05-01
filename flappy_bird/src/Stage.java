import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stage extends JPanel{
    private Pipe Pipe[];//管道数组
    private Bird Bird;//鸟
    private int space;//上下管道之间的间隔
    public JLabel scoreboard;//计分面板
    private int score;//计分
    public Stage()
    {
        space=150;//<span style="font-family: arial, helvetica, sans-serif;">上下管道之间的间隔为150</span>
        score=0;
        scoreboard=new JLabel("得分："+score);
        Pipe=new Pipe[5];//总共5跟根
        for(int i=0;i<Pipe.length;i++)
        {
            Pipe[i]=new Pipe(400-space,i*130+110);//柱子每隔110m放一根
            //system.out.println(Pipe[i].tosting());
        }
        Bird=new Bird();
    }
    public void play()
    {
        Timer timer=new Timer();//定时任务，即使不操作也能动
        timer.schedule(new TimerTask()
        {
            public void run()
            {

                if(Bird.hit(Pipe))//碰到，重置所有数据成员
                {
                    //system.out.println("碰到了");
                    score=0;
                    scoreboard.setText("得分："+score);
                    Pipe=new Pipe[10];
                    for(int x=0;x<Pipe.length;x++)
                        Pipe[x]=new Pipe(400-space,x*130+110);
                    Bird=new Bird();
                }
                else{//没碰到
                    //system.out.println("没碰到");
                    Bird.fly(Bird.down);//鸟默认向下飞
                    for(int x=0;x<Pipe.length;x++)//管道每次往前移动10m，造成鸟向右移动的效果
                    {
                        Pipe[x].setxpos(Pipe[x].getxpos()-10);
                    }
                    score=score+10;
                    scoreboard.setText("得分："+score);
                }
                repaint();
            }
        }, 0, 1000);//在不操作的情况下，每一秒飞一次
        this.requestFocus();//获取”输入“焦点

        this.addKeyListener(new KeyAdapter() {//加入键盘时间
            public void keypressed(KeyEvent e)
            {
                if(e.getKeyCode()==38){
                    action(Bird.up);
                } else if(e.getKeyCode()==40){
                    action(Bird.down);
                }

            }


            });
        }
        public void action(int direction)//按下上下方向键后执行的函数
        {

            if(Bird.hit(Pipe))
            {
                //system.out.println("碰到了");
                score=0;
                scoreboard.setText("得分："+score);
                Pipe=new Pipe[10];
                for(int x=0;x<Pipe.length;x++)
                    Pipe[x]=new Pipe(400-space,x*130+110);
                Bird=new Bird();
            }
            else{
                //system.out.println("没碰到");
                if(direction==Bird.up)
                {
                    Bird.fly(Bird.up);
                }
                else if(direction==Bird.down)
                {
                    Bird.fly(Bird.down);
                }
                for(int x=0;x<Pipe.length;x++)//管道每次往前移动10m，造成鸟向右移动的效果
                {
                    Pipe[x].setxpos(Pipe[x].getxpos()-10);
                }
                score=score+10;
                scoreboard.setText("得分："+score);
            }
            repaint();
        }
        public void paint(Graphics g)
        {
            g.setColor(g.getColor());
            g.fillRect(0, 0, getWidth(), getHeight());//用默认颜色清屏
            g.setColor(Color.red);
            g.fill3DRect(Bird.getxpos(), Bird.getflyheight(), 20, 20, true);//红色画鸟
            g.setColor(Color.green);
            for(int i=0;i<Pipe.length;i++)//绿色画管道
            {
                g.fill3DRect(Pipe[i].getxpos(), 0, 20, Pipe[i].getupheight(), true);
                g.fill3DRect(Pipe[i].getxpos(),Pipe[i].getupheight()+space, 20, Pipe[i].getdownheight(), true);
            }
            if(Pipe[0].getxpos()+20<=0)//如果第一根管道出界，就删掉第一根管道，把后面的往前挪，再新创建一根管道
            {
                for(int i=1;i<Pipe.length;i++)
                    Pipe[i-1]=Pipe[i];
                Pipe[Pipe.length-1]=new Pipe(400-space,(Pipe.length-1)*130+110);
                //system.out.println(Pipe[Pipe.length-1].tosting());
            }
        }
        public static void main(String[] args) {
        // todo auto-generated method stub
        JFrame jf=new JFrame("flappyBird");
        Stage app=new Stage();
        jf.setLayout(null);
        app.setBounds(0,20,600,400);
        app.scoreboard.setBounds(0, 0, 100, 20);
        jf.add(app);
        jf.add(app.scoreboard);
        jf.setSize(610, 460);
        jf.setVisible(true);
        app.play();//游戏开始
    }

    }