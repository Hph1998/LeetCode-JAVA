public class IsValid020 {

    public boolean isValid(String s) {
        char[] c = s.toCharArray();//先转数组
        String res = "";
        for (char value : c) {//遍历
            if (value == '(' || value == '[' || value == '{') {//左括号加进来
                res = res + value;
            } else {
                if(res.isEmpty()){//res为空 但value是有括号 必然不符合
                    return false;
                }
                //三种情况符合value有括号遇到res最后一个是左括号
                if ((value == '}' && res.charAt(res.length() - 1) == '{') || (value == ']' && res.charAt(res.length() - 1) == '[') || (value == ')' && res.charAt(res.length() - 1) == '(')) {
                    res = res.substring(0, res.length() - 1);//去掉res的左括号
                } else {//只要不满足以上三种情况 必然不符合
                    return false;
                }
            }
        }

        return res.isEmpty();//最后res为空满足 反之
    }

    public static void main(String[] args) {

        IsValid020 isValid020 = new IsValid020();
        System.out.println(isValid020.isValid("[])"));

    }

}
