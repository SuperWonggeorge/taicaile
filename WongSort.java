package demo.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * @date ：Created in 2021/5/31 20:42
 * @description：Wong's sort
 * @modified By：
 * @version: 999.999.999$
 */

public class WongSort {
    public static int[] sort(int[] array) {

        //selectSort
//        if (array.length > 0){
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array.length; j++) {
//                    if (array[i] > array[j]){
//                        int temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                    }
//                }
//            }
//        }

        //bubbleSort
//        if (array.length > 0){
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array.length - i - 1; j++) {
//                    if (array[j] > array[j + 1]){
//                        int temp = array[j];
//                        array[j] = array[j + 1];
//                        array[j+1] = temp;
//                    }
//                }
//            }
//        }

        //insertSort
//        if (array.length > 0) {
//            for (int i = 0; i < array.length - 1; i++) {
//                int cur = array[i + 1];
//                int idx = i;
//                while (idx >= 0 && cur < array[idx]) {
//                    array[idx + 1] = array[idx];
//                    idx--;
//                }
//                array[idx + 1] = cur;
//            }
//        }

        //heapSort
        
        return array;
    }

    public static void main(String[] args) {

        int[] a = new int[]{5, 6, 9, 4, 2, 1, 8, 7};
        int[] b = a.clone();
        Arrays.sort(b);

        Long timeDiff = 1L;
        try {
            Instant inst1 = Instant.now();
            sort(a);
            Instant inst2 = Instant.now();
            timeDiff = Duration.between(inst1, inst2).toMillis();
        } catch (Exception e) {
            System.out.println("报错了，太菜了");
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(a));

        int prev = a[0];
        for (int i : a) {
            if (i < prev) {
                System.out.println("顺序不对，太菜了");
                return;
            }
            prev = i;
        }


        if (!Arrays.equals(a,b)){
            System.out.println("两个都不一样，看清楚点啊，太菜了");
            return;
        }

        if ( timeDiff > 10L ){
            System.out.println("超时了，太菜了");
            return;
        }

        System.out.println("是从小到大有序的，牛逼");
    }
}
