public class RomanToInt013 {

    public int romanToInt(String s) {

        //罗马数字和整型之间的规则
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int res = 0;//结果
        int index = 0;//索引

        while (s.length() != 0){
            int temp = s.indexOf(romans[index]);//字符串开头对应的罗马数字位置
            if(temp == 0){//必须是开头
                res = res + nums[index];
                s = s.substring(romans[index].length());//缩短字符串直到为0结束循环
                if(index == 12){//或index==12，字符串后续只有IIIIII的情况跳出循环
                    res = res + s.length();
                    break;
                }
            }else{
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        RomanToInt013 romanToInt013 = new RomanToInt013();
        System.out.println(romanToInt013.romanToInt("MCMXCIV"));

    }

}
