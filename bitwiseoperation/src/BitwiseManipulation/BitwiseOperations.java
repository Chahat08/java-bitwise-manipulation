package BitwiseManipulation;

public interface BitwiseOperations {
    int setKthBitOfInteger(int x, int k);
    int clearKthBitOfInteger(int x, int k);
    void setKthBitOfArray(int[] array, int k);
    void clearKthBitOfArray(int[] array, int k);
    String getIntegerAs32BitString(int x);
    int getBitStringAsInteger(String bitstring);
    int setBitStringInIntegerAtPositionK(int x, String bitString, int k);
    int setNBitsInIntegerStartingFromPositionK(int x, int n, int k);
    int clearNBitsInIntegerStartingFromPositionK(int x, int n, int k);

}
