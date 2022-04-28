package p5_modifier;

public class StaticCounter {
    // 静态变量
    private static int numInstances = 0;

    // 静态方法-返回数量
    protected static int getCount() {
        return numInstances;
    }

    // 静态方法-数量自增
    private static void addInstance() {
        numInstances++;
    }

    // 构造函数
    StaticCounter() {
        StaticCounter.addInstance();
    }

    // main:类静态方法
    public static void main(String[] arguments) {

        System.out.println("Starting with " +
                StaticCounter.getCount() + " instances");

        for (int i = 0; i < 500; ++i){
            new StaticCounter();
        }

        System.out.println("Created " +
                StaticCounter.getCount() + " instances");

        StaticCounter.addInstance();

        System.out.println("Created " +
                StaticCounter.numInstances + " instances");

    }

}