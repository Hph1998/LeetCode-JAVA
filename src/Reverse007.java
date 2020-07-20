public class Reverse007 {
    public int reverse(int x) {

        String s = String.valueOf(x); //整数转字符串
        int len = s.length();
        int zs = len;
        if(s.charAt(0)=='-'){ //判断正负
            zs = len-1;
        }
        String temp = "";
        for(int i=0;i<zs;i++){ //倒叙
            temp = temp + s.charAt(len-i-1);
        }
        int res = 0;
        try { //处理异常 超过int的范围返回0
            if(zs==len-1){
                res = 0-Integer.parseInt(temp);
            }else{
                res = Integer.parseInt(temp);
            }
        }catch (Exception e){
            return 0;
        }
        return res;
    }

}
