package p14_datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateTime {
    public static void main(String[] args) throws Exception{
        // Date类
        Date date1 = new Date();
        /*获取自1970/1/1 到当前的毫秒数*/
        long t1 = date1.getTime();

        /*now time,返回 dow Month(MM) dd hh:mm:ss zzz yyyy,这里的MM dd等和后续的格式化对应*/
        System.out.println(date1.toString());

        for (int a=1; a<1000; a++){
            continue;
        }
        Date date2 = new Date();
        long t2 = date2.getTime();

        System.out.println((t2 - t1) + "ms");

        // 格式化时间
        // 可以将yyyy等理解为变量，其链接符号以及不同时间元素的顺序可以自己定义
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        System.out.println(ft.format(date1));


        // java 休眠
        // 这里可以直接 print当前时间
        System.out.println(new Date());
        try{
            Thread.sleep(1000*3);
            System.out.println(new Date());
        }catch (Exception e){
            System.out.println("Exception");
        }

        // 时间测量
        long start = System.currentTimeMillis();
        Thread.sleep(1000*2);/*这里和上面一样需要抛出异常，为了简单就直接在main抛出了*/
        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 返回毫秒差


    }
}
