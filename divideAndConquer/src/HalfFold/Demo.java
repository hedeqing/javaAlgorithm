package HalfFold;

public class Demo {
    public static void main(String[] args) {
        int var;
        int[] a = {6, 2, 3, 7, 4, 5};
        sort(a);
        var = binareSearch(a, 0, 5, 4);
        show(a);
        System.out.println("所查找的数下标为：" + var);
    }

    /**
     * @param a
     */
    public static void show(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println(" ");
    }

    /**
     * @param a
     */
    public static void sort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
    }

    /**
     * @param a
     * @param low
     * @param high
     * @param var
     * @return
     */
    public static int binareSearch(int[] a, int low, int high, int var) {
        int n = a.length;
        int mid;
        if (low > high)
            return -1;
        else {
            mid = (low + high) / 2;
            if (a[mid] == var) {
                return mid;
            } else if (a[mid] > var)
                return binareSearch(a, mid + 1, high, var);
            else return binareSearch(a, low, mid - 1, var);
        }
    }
}