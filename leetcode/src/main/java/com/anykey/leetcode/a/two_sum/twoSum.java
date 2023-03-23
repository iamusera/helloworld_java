package com.anykey.leetcode.a.two_sum;

import java.util.ArrayList;
import java.util.List;

public class twoSum {
    public static List<Integer> arr = new ArrayList<>();;
    public int target;

    public twoSum(List<Integer> arr, int target){
        twoSum.arr =arr;
        this.target=target;
    };

    public twoSum() {
        
    }

    public static class inner{
        private twoSum ts;
        twoSum m = new twoSum();
        int s = m.target;
        public twoSum tsop;
        List<?> a = arr;
    };
    public int[] cal1(){
        int [] result = new int[2]; 
        for(int i=0; i<arr.size(); i++){
            for(int j=(i+1); j<arr.size(); j++){
                System.out.println(i+" - " + j);
                if(arr.get(i) + arr.get(j) == target){
                    result[0] = arr.get(i);
                    result[1] = arr.get(j);
                }
            }
        }
        return result;
    }
}