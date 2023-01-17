import BitwiseManipulation.*;
public class Main {
    int x=0;

    void setBit(int position) {
        int flag = 1;
        flag = flag << position;
        this.x = this.x|flag;
    }

    void clearBit(int position) {
        int flag = 1;
        flag = ~(flag<<position);
        this.x = this.x&flag;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        System.out.println(main.x);
        main.setBit(2);
        System.out.println(main.x);
        main.setBit(3);
        System.out.println(main.x);
        main.clearBit(2);
        System.out.println(main.x);


        System.out.println("METHODS TEST");
        BitwiseOperations bitwiseOperations = new BitwiseManipulation();
//        BitwiseManipulation bitwiseManipulation = new BitwiseManipulation();
        System.out.println(bitwiseOperations.setKthBitOfInteger(0, 2));
        System.out.println(bitwiseOperations.setKthBitOfInteger(0, 3));
        System.out.println(bitwiseOperations.clearKthBitOfInteger(12, 2));
    }
}