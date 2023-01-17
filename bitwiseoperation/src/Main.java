import BitwiseManipulation.BitwiseManipulation;

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
        BitwiseManipulation bitwiseManipulation = new BitwiseManipulation();
        System.out.println(bitwiseManipulation.setKthBitOfInteger(0, 2));
        System.out.println(bitwiseManipulation.setKthBitOfInteger(0, 3));
        System.out.println(bitwiseManipulation.clearKthBitOfInteger(12, 2));
    }
}