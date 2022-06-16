package leetcode;

/*
* java 逻辑表达式如何写与？
* &：逻辑与，两侧都会判断，需要严格保证两侧都不会越界
* &&：短路与，减少非必要判断，减少异常，例如如果左侧为false，那么右侧就必要判断了
* */

class Solution20220226 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int valCount = 0;

        int i = 0;
        int j = length -1 ;

        while(i<=j){
            // 目标是找异常值，非异常pass
            while(i<length && nums[i]!=val){
                i++;
            }
            // 找非异常值，异常pass/计数
            while(j>-1 && nums[j]==val){
                j--;
                valCount++;
            }

            if (i<j){
                nums[i] = nums[j];
                nums[j] = val;
            }

        }
        // System.out.println(valCount);
        return length - valCount;

    }
}