public class MyAtoi008 {

    public int myAtoi(String str) {

        str = str.trim();//上来先去除前后空格
        int len = str.length();
        int i=0;
        int end=-1;//标记结束位置 -1字符串除首位可能是+-全是数字 0表示首位除+-的其他非数字
                   //1为首位是+-但第二位不是数字
        if(str.equals("")||str.equals("+")||str.equals("-")){//空 或者 只有+-返回0
            return 0;
        }
        if(str.charAt(0)=='+'||str.charAt(0)=='-'){//首位是+-从第二位开始循环
            i=1;
        }
        for(;i<len;i++){
            if(!Character.isDigit(str.charAt(i))){//遇到非数字标记end
                end=i;
                break;
            }
        }

        if((end==1&&!Character.isDigit(str.charAt(0)))||end==0){//end=1时有可能第二位是小数点
            return 0;
        }else {
            int res;
            try{
                if(end==-1){
                    res = Integer.parseInt(str);
                }else{
                    res = Integer.parseInt(str.substring(0,end));
                }
            }catch (Exception e){//超出int表示范围处理异常后判断正负
                if(str.charAt(0)=='-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }

            return res;
        }

    }

    public static void main(String[] args) {
        MyAtoi008 myAtoi008 = new MyAtoi008();
        int a = myAtoi008.myAtoi("-91283472332");
        System.out.println(a);
    }
}
