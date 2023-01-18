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

        System.out.println("STRING METHODS");
        System.out.println(bitwiseOperations.getIntegerAs32BitString(8));
        System.out.println(bitwiseOperations.getIntegerAs32BitString(9234));
        System.out.println();
        System.out.println(bitwiseOperations.getBitStringAsInteger("100"));
        System.out.println(bitwiseOperations.getBitStringAsInteger("00000"));
        System.out.println();
        System.out.println(bitwiseOperations.setBitStringInIntegerAtPositionK(0, "100", 3));//8
        System.out.println(bitwiseOperations.setBitStringInIntegerAtPositionK(10, "100", 2));//4 // 1100: 12
        System.out.println();
        System.out.println(bitwiseOperations.setNBitsInIntegerStartingFromPositionK(0, 3, 3));//1110: 14
        System.out.println(bitwiseOperations.clearNBitsInIntegerStartingFromPositionK(14, 1, 2));//1010: 10


        System.out.println("NEW METHODS");
        System.out.println(bitwiseOperations.readKthBitOfInteger(33559540, 2));
        System.out.println(bitwiseOperations.readKthBitOfArray(arr, 2)); // 0
        System.out.println(bitwiseOperations.readKthBitOfArray(arr, 3)); // 1
        String[] strs = bitwiseOperations.getIntegerAs8FourBitStrings(33559540);
        for(String str:strs) System.out.println(str);
    }
}