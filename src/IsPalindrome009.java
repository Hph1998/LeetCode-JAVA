public class IsPalindrome009 {
    public boolean isPalindrome(int x) {

        if(x<0){//按示例是个负数直接false
            return false;
        }

        int temp = x;
        int[] resA = new int[10];//存个十百千万
        int res = 0;
        int i = 0;//标记x是几位数

        while(temp>0){//个位变首位存在数组，以此类推
            resA[i]=temp%10;
            temp=temp/10;
            i++;
        }

        for(int j = 0;j<i;j++){
            res = res*10+resA[j];
        }
        if(res==x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        IsPalindrome009 isPalindrome009 = new IsPalindrome009();
        System.out.println(isPalindrome009.isPalindrome(101));
    }
}
