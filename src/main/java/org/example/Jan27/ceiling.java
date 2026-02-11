package org.example.Jan27;

public class ceiling {
    public static void main(String[] args) {
        //   int[] arr = {25, 23, 12, 10, 9, 5, 4, 2};
        int[] arr = {2, 4, 5, 9, 10, 13, 23, 25};
        int target = 12;
        System.out.println(ceilingNumber(arr, target));
    }

    static int ceilingNumber(int[] arr, int target) {
        if (target > arr[arr.length -1 ]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                //  System.out.println("is Ascending");
//                if (target < arr[mid]) {     //12 < 10
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
                if(target >arr[mid]){
                    start =mid +1;
                }else{
                    end = mid - 1;
                }
            } else {
                //           System.out.println("is Descending");
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return end;
    }
}
