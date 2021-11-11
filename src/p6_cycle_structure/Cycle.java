package p6_cycle_structure;

public class Cycle {
    public static void main(String[] args){
        System.out.println("while cycle structure:");
        int i = 0;
        while( i < 5 ){
            i++;
            if(i == 3) {continue;}  // 判断条件1是用== 2是要加括号 3是语句块都要大括号
            System.out.println(i);
        }

        System.out.println("for cycle structure:");
        for(i=0; i<5; i++){// 各个元素之间用 ； 隔开
            System.out.println(i);
        }

        System.out.println("enhanced for cycle structure:");
        int[] nums = {1, 2, 3, 4, 5}; // 大括号，和python不同
        for(int j: nums){ // 变量前面加类型
            System.out.println(j);
            if (j == 2){break;}
        }
    }
}
