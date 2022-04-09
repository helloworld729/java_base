package p19_exception;

public class MyException {

    public static void main(String[] args){
        int[] a = new int[2];

        try{
            a[0] = 1;
            System.out.println(a[4]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
