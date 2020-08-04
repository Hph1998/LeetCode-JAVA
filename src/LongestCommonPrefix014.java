public class LongestCommonPrefix014 {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0){//空直接返回空
            return "";
        }
        if(strs.length==1){//只有一个元素直接返回当前元素
            return strs[0];
        }

        String res = strs[0];//从最长开始递减
        int len = res.length();
        for(int i = 0; i<len; i++){//第一层循环是第一个元素长度逐渐减1
            int k = 1;//标记匹配后面元素的个数
            for(int j = 1;j<strs.length; j++){//第二层循环是从第二个元素向后匹配
                if(strs[j].indexOf(res)==0){//存在公共前缀k+1
                    k++;
                }else{
                    break;//只要有一个不存在直接跳出第二层循环
                }
                if(k==strs.length){//匹配后面元素跟数组长度相等结束
                    return res;
                }
            }
            res = res.substring(0,len-i-1);
        }

        return "";
    }

    public static void main(String[] args) {

        LongestCommonPrefix014 longestCommonPrefix014 = new LongestCommonPrefix014();
        System.out.println(longestCommonPrefix014.longestCommonPrefix(new String[] {"c","cc","ccc"}));

    }

}
