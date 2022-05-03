package p36_generics;


public class GenericMethod {

    public  static <E> void printArray(E[] inputs){
        for (E e: inputs){
            System.out.printf( "%s ", e);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Integer[] intarray = {1, 2, 3};
        Double[] doubleArray = {1.1, 2.2, 3.3};
        Character[] charArray = {'a', 'b', 'c'};

        printArray(intarray);
        printArray(doubleArray);
        printArray(charArray);


    }
}
