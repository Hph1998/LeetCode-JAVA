import java.util.Arrays;

public class ThreeSumClosest016 {

    public int threeSumClosest(int[] nums, int target) {

        int min = Integer.MAX_VALUE;//因为找最小值先给个最大值跟
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);//排序的作用在暴力解法下似乎效果不大
        int len = nums.length;
        for(int i = 0;i < len - 2;i++){//第一层只要到倒数第三个后面jk兜底
            for(int j = i+1;j<len-1;j++){//第二层只要到倒数第二个后面k兜底
                for(int k = j+1;k<len;k++){//兜底之王
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<Math.abs(min)){//比较绝对值
                        min = nums[i]+nums[j]+nums[k]-target;//满足重新赋值最小值
                    }
                }
            }
        }
        return min+target;//注意不是返回min而是三数之和
    }

    public static void main(String[] args) {

        ThreeSumClosest016 threeSumClosest016 = new ThreeSumClosest016();
        int[] nums = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest016.threeSumClosest(nums,1));
    }

}
