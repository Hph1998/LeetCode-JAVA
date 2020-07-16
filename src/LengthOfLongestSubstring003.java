public class LengthOfLongestSubstring003 {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();//字符串长度给下面循环用
        String res = "";
        //两层循环一个个推进
        for(int i=0;i<len;i++){
            String temp="";
            for(int j=i;j<len;j++) {
                if(temp.contains(""+s.charAt(j))){//当前字符串是否已包含某字符
                    break;//包含跳出 从下一个字符再出发
                }else {
                    temp = temp + s.charAt(j);//不包含接起来
                }
            }
            if(temp.length()>res.length()){//谁长就用谁
                res=temp;
            }
        }
        return res.length();
    }
}
