public class LongestPalindrome005 {
    public static String longestPalindrome(String s) {

        int len = s.length();

        while (len > 0) {

            //暴力解法 类似滑动块 加入长度为5 第一次循环12345
            //第二次循环1234 2345
            //第三次循环123 234 345 直至找到回文return
            F:
            for (int k = 0; k < s.length() - len + 1; k++) {//还是当前长度，子串不同
                int i = k,j = k+len-1;
                while(i<j) {
                    if(s.charAt(i)==s.charAt(j)){
                        i++;
                        j--;
                    } else{
                        continue F;
                    }
                }
                return s.substring(k,k+len);
            }
            len--;//这个长度的都已经找完了，找下一个长度
        }
        return s;
    }

    public static void main(String[] args) {
        String s = longestPalindrome("cbbd");
        System.out.println(s);
    }
}
