package p36_generics;

public class MyGeneRics<T> {
    private T t;
    public T get(){
        return this.t;
    }
    public void set(T t){
        this.t = t;
    }

    public static void main(String[] args){
        MyGeneRics<String> StringGene = new MyGeneRics<String>();
        MyGeneRics<Integer> IntGene = new MyGeneRics<Integer>();
        StringGene.set("Knight is learning java");
        IntGene.set(37666);


        System.out.println(StringGene.get());
        System.out.println(IntGene.get());

    }

}
