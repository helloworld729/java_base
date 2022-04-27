package p15_regex;

import sun.lwawt.macosx.CSystemTray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static void main(String[] args){

        String content = "I am noob from runoob.com.";
        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);//调用 pattern 对象的match方法返回match对象
        System.out.println(isMatch);

        //关于斜线
        System.out.println("\\");
        System.out.println("\\\\");

        // 捕获组
        String line = "knight hava learned java for 20 days...";
        String capture_pattern = "(\\D*)(\\d+)(.*)";  // 从左到右计算其开括号来计算补货组的编号
        Pattern capture_r = Pattern.compile(capture_pattern);  // pattern 对象
        Matcher capture_m = capture_r.matcher(line);  // Matcher 对象

        if (capture_m.find()){  // 如果匹配到了的话
            System.out.println(capture_m.groupCount());  // 返回分组数
            System.out.println(capture_m.group(0));      // 返回整个匹配到的结果
            System.out.println(capture_m.group(1));      // 返回   分组1 的结果
            System.out.println(capture_m.group(2));      // 返回   分组2 的结果
            System.out.println(capture_m.group(3));      // 返回   分组3 的结果
        }

        // Matcher方法
        /*Matcher方法：索引：start, end*/
        String REGEX1 = "\\bcat\\b"; // cat 两侧都是字符边界，包括空格和真的字符串边界
        String content1 = "cat cat cate cat";
        Pattern p1 = Pattern.compile(REGEX1);
        Matcher m1 = p1.matcher(content1);
        int count = 0;
        while (m1.find()){  // match对象发生了移动
            count ++;
            System.out.println(m1.start());
            System.out.println(m1.end());
        }

        /*Matcher方法：查找：lookingAt从头开始, matches*/
        String REGEX2 = "knight";
        String content2  = "this is knight...";
        String content3 =  "knight is learning java";
        Pattern p2 = Pattern.compile(REGEX2);
        Matcher m2 = p2.matcher(content2);
        Matcher m3 = p2.matcher(content3);

        System.out.println(m2.matches());
        System.out.println(m2.lookingAt());
        System.out.println(m3.lookingAt());  // 从开头位置可以匹配且覆盖
        System.out.println(m3.matches());

        /*Matcher方法：替换：replaceFirst, replaceAll*/
        System.out.println("Matcher方法：替换：replaceFirst, replaceAll");
        String REGEX3 = "a*b";//匹配若干a之后为b的串，a可以出现0次
        String content4 = "aabfooaabfooabfoobkkk";
        String replace = "-";
        Pattern p4 = Pattern.compile(REGEX3);
        Matcher m4 = p4.matcher(content4);
        StringBuffer sf = new StringBuffer();
        while (m4.find()){
            m4.appendReplacement(sf, replace);//将匹配到的内容替换为replace，然后append到 直到 当前位置的字串后，这个结果存储到StringBuffer内
            System.out.println(sf.toString());
        }
        m4.appendTail(sf);  // 把没有匹配的尾串append到StringBuffer后
        System.out.println(sf.toString());

        String REGEX5 = "foo";
        String conrent5 = sf.toString();
        Pattern p5 = Pattern.compile(REGEX5);
        Matcher m5 = p5.matcher(conrent5);
        String res5 = m5.replaceFirst("Knight");
        String res6 = m5.replaceAll("Knight");
        System.out.println("replace_first: " + res5);
        System.out.println("replace_all: " + res6);

    }
}
