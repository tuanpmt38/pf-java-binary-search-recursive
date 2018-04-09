public class BinarySearchRecursive {
    static int binarySearchrecursive(int arrlist[], int low, int high, int value) {
        if (low <= high) {
            int mid = (high + low) / 2;
            if (arrlist[mid] == value) return mid;
            if (arrlist[mid] > value) return binarySearchrecursive(arrlist, low, mid + 1,value);
            return binarySearchrecursive(arrlist, mid - 1, high, value);
        }
        return -1;

    }

    public static void main(String[] args) {
        int value = 67;
        int arrList[] = {1, 2, 3, 33, 55, 67, 79,45,63,99,56};
        int resultIndex = binarySearchrecursive(arrList, 0, arrList.length - 1, value);
        System.out.println("Index is: " + resultIndex);
    }
}
