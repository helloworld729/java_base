package p10_character;

public class MyCharacter {
    public static void main(String[] args){
        Character ch = 'a'; // 装箱

        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit('1')); // java 有时也会自动创建封装类型
    }
}
