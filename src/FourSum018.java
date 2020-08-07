import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4){
            return res;
        }
        Arrays.sort(nums);//排序的作用在暴力解法下似乎效果不大 但是可以去重
        int len = nums.length;
        for(int i = 0;i < len - 3;i++){//第一层只要到倒数第四个后面jkl兜底
            int a = nums[i];
            for(int j = i+1;j<len-2;j++){//第二层只要到倒数第三个后面kl兜底
                int b = nums[j];
                for(int k = j+1;k<len-1;k++){//第三层只要到倒数第二个后面l兜底
                    int c = nums[k];
                    for(int l = k+1;l<len;l++){//最后一层兜底之王
                        int d = nums[l];
                        if(a+b+c+d==target){//如果存在这组数据满足条件
                            List<Integer> temp = new ArrayList<>();
                            temp.add(a);
                            temp.add(b);
                            temp.add(c);
                            temp.add(d);
                            if(!res.contains(temp)) {//且这组数据不重复
                                res.add(temp);
                            }
                        }
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        FourSum018 fourSum018 = new FourSum018();

        System.out.println(fourSum018.fourSum(new int[]{-3,-2,-1,0,0,1,2,3},0));

    }

}
