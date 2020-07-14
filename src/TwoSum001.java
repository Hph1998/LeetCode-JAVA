public class TwoSum001 {
    public static int[] twoSum(int[] nums, int target) {
        int result[]={0,0};   //初始化
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j) {   //数组中同一个元素不能使用两遍
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        break;  //只会对应一个答案
                    }
                }
            }
            if(result[1]!=0){
                break; //无法跳出两层循环，加个判断。
            }
        }
        return result;
    }

}
