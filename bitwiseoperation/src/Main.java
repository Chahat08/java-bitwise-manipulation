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
        int[] arr = {0,1};
        bitwiseOperations.setKthBitOfArray(arr, 2); //4,1
        for(int i:arr) System.out.println(i);
        System.out.println();
        bitwiseOperations.setKthBitOfArray(arr, 3); //12,1
        for(int i:arr) System.out.println(i);
        System.out.println();
        bitwiseOperations.setKthBitOfArray(arr, 33); //12,3
        for(int i:arr) System.out.println(i);
        System.out.println();
        bitwiseOperations.clearKthBitOfArray(arr, 2); //8,3
        for(int i:arr) System.out.println(i);
        System.out.println();


    }
}