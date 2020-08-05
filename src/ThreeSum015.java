import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum015 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new LinkedList<>();
        if(nums.length < 3){
            return res;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i < len - 2;i++){
            int left = i+1;
            int right = len - 1;
            while(left<right){
                if((i>0&&nums[i]!=nums[i-1])||i==0){//第一个便不用做什么判断，但是后面的数相当于是nums[j]+nums[k]的相反数，如果nums[i]=nums[i-1]，在前面已经找完了所有配置的数，有必要再找一遍吗？
                    if((nums[left]+nums[right]+nums[i])==0){
                        if(nums[left]!=nums[left-1]||(left-1==i)){//比如-2，0，0，2，2，可以动手画画，先是
                            res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        }
                        left++;
                        right--;
                    }
                    if((nums[left]+nums[right]+nums[i])<0){
                        left++;//说明有一个数小了，只能增加左边的
                    }
                    if((nums[left]+nums[right]+nums[i])>0){
                        right--;//说明有一个数大了，只能减少右边的
                    }

                }
                else{
                    left++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ThreeSum015 threeSum015 = new ThreeSum015();
        int[] a = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum015.threeSum(a));
    }
}
