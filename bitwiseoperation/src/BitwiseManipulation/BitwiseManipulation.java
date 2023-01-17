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

    @Override
    public void setKthBitOfArray(int[] array, int k) {
        int idx = k%32;
        int position = k/32;
        array[idx] = setKthBitOfInteger(array[idx], position);
    }

    @Override
    public void clearKthBitofArray(int[] array, int k) {
        int idx = k%32;
        int position = k/32;
        array[idx] = clearKthBitOfInteger(array[idx], position);
    }
}
