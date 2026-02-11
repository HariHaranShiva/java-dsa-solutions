package org.example.Jan20;

public class LinearSearchInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 54, 22, 67, 40, 9, 19};
        int target = 67;
       int ans =  returnElement(num, target);
        System.out.println(ans);
    }
    static int returnElement(int[] num, int target){
        if(num.length == 0) return -1;

        //Return Index of the element
//        for (int index = 0; index < num.length; index++) {
//            int element = num[index];
//            if(element == target){
//                return index;
//            }
//        }

        //return Targeted element
        for(int a : num){
            if(a == target){
                return a;
            }
        }
        return -1;
    }
}
