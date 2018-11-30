package quickSort;

public class Demo {
    /**
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private static int partition(int arr[], int low, int high) {
    /*选定轴值
    始终选择第一个元素作为枢轴。
    始终选择最后一个元素为枢轴。
    选择一个随机元素作为枢轴。
    选择中位数作为枢轴。
    本次最后一个作为轴值
    */

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // 当数组中的值比pivot小时，与前一个数交换，遍历一遍后，即可交换值
            if (arr[j] < pivot) {
                i++;
                //swap arr[i] and arr[j]
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }

        //swap arr[i+1] and arr[high] (pivot)
        int temp2 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp2;

        return i + 1; //the position of pivot
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            //pi is partitioning index
            int pi = partition(arr, low, high);

            // recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 2, 5, 8, 6, 9, 7};
        quickSort2(a, 0, 7);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
    }

    /**
     * @param a
     * @param low
     * @param high
     */
    public static void quickSort2(int[] a, int low, int high) {
        if (low < high) {
            //分治法的话需要找到分区值
            int p = partition2(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    /**
     * @param a
     * @param low
     * @param high
     * @return
     */
    private static int partition2(int[] a, int low, int high) {
        int pivot = a[high];
        int j = low - 1;
        int temp;
        for (int i = low; i < a.length; i++) {
            //如果有比pivot大的值后移
            if (a[i] > pivot) {
                j++;
                temp = a[j];
                a[j] = a[high];
                a[high] = temp;
            }
        }
        //如果没有出现比pivot大的话，原值还是原值
        temp = a[j + 1];
        a[j + 1] = a[high];
        a[high] = temp;

        return j + 1;
    }
}
