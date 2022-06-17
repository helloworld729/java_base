package p13_Array;

public class MyArray {
    public int[] mysort(int [] nums){
        for(int i= 0; i< nums.length-1; i++){
            for(int j=0; j < nums.length - i - 1; j++){
                if(nums[j] >= nums[j+1]){
                    int temp = 0;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        MyArray nums2 = new MyArray();
        int [] nums3 = {1, 3, 5, 2, 6};
        System.out.println(nums3.length);

        for(int k: nums2.mysort(nums3)){
            System.out.println(k);
        }

    }
}
