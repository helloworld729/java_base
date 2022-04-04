package p25_Interface;

// 如果用public修饰，那么文件名要修改为接口名
interface Sports{
    public void setHomeTeam(String name);
    public void setVisitingTeam(String name);
}


interface Football extends Sports{
    public void homeTeamScored(int points);
}


public class MySports implements Football {
    // 类中必须要对方法进行实现，所以接口优点类似于c语言中的函数体在后面，但是前面要先声明一下。
    public void setHomeTeam(String name){
        System.out.println("设置主队名称: " + name);
    }

    public void setVisitingTeam(String name){
        System.out.println("设置客队名称: " + name);
    }

    public void homeTeamScored(int points){
        System.out.println("设置主队得分： " + points);
    }

    public static void main(String[] args){
        MySports mysports = new MySports();
        mysports.setHomeTeam("中国");
        mysports.setVisitingTeam("越南");
        mysports.homeTeamScored(3);
    }

}
