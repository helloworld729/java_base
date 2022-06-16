package p25_high_Interface;

// 如果用public修饰，那么文件名要修改为接口名
interface Sports{
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}


interface Football extends Sports{
    public void homeTeamScored(int points);
}

interface Music{
    public void play(String name);
}

class KAICHANG implements Music{
    public void play(String name){
        System.out.println("播放开场音乐");
    }
}

public class MySports implements Football {
    private static KAICHANG kaichang = new KAICHANG();

    public static void main(String[] args){
        kaichang.play("hello");
        MySports mysports = new MySports();
        mysports.setHomeTeam("中国");
        mysports.setVisitingTeam("越南");
        mysports.homeTeamScored(3);
    }

    public void setHomeTeam(String name){
        System.out.println("设置主队名称: " + name);
    }

    public void setVisitingTeam(String name){
        System.out.println("设置客队名称: " + name);
    }

    public void homeTeamScored(int points){
        System.out.println("设置主队得分： " + points);
    }

}
