package BitwiseManipulation;

public class BitwiseManipulation implements BitwiseOperations{

    @Override
    public int setKthBitOfInteger(int x, int k) {
        int flag = 1;
        flag = flag << k;
        return x | flag;
    }

    @Override
    public int clearKthBitOfInteger(int x, int k) {
        int flag = 1;
        flag = flag << k;
        return x & (~flag);
    }
}
