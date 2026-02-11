package org.Jan21;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,  3, 5, 6, 54, 98};
        int target = 54;
//        int start = 1;
//        int end = 4;
        System.out.println(LinearSear(arr,target,1, 4));
    }
    static int LinearSear(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

    // ultra-clean code
//    static int search(int[] arr, int target, int start, int end) {
//        for (int i = start; i <= end; i++)
//            if (arr[i] == target) return i;
//        return -1;
//    }

}
