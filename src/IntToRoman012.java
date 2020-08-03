import java.util.HashMap;

public class IntToRoman012 {

    public String intToRoman(int num) {

        if(num>3999||num<1){//不在范围内直接return
            return null;
        }

        //规则存在HashMap方便取
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>(){
            {
                put(1,"I");
                put(5,"V");
                put(10,"X");
                put(50,"L");
                put(100,"C");
                put(500,"D");
                put(1000,"M");
                put(4,"IV");
                put(9,"IX");
                put(40,"XL");
                put(90,"XC");
                put(400,"CD");
                put(900,"CM");
            }
        };

        String res = "";//结果
        int i = 1;//所在位置 个位 十位 百位。。。

        //从个位开始取
        while(num>0){
            int temp = num % 10;//当前位置数值
            int key = temp * i;//其实际表示数值
            int center = key;//678大于5逐步减到5中断
            if(hashMap.containsKey(key)){//在规则种存在直接连接
                res = hashMap.get(key) + res;
            }else {
                for(int j=0;j<temp;j++){//在规则中不存在，向下找规则连接
                    res = hashMap.get(key/temp) + res;
                    center = center - key/temp;//678大于5的数字逐步减到5
                    if(hashMap.containsKey(center)){//把5规则连接，跳出for循环
                        res = hashMap.get(center) + res;
                        break;
                    }
                }
            }
            i = i * 10;
            num = num / 10;
        }

        return res;
    }

    public static void main(String[] args) {

        IntToRoman012 intToRoman012 = new IntToRoman012();
        System.out.println(intToRoman012.intToRoman(58));
    }
}
