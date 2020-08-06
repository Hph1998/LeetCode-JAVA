import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations017 {

    public List<String> letterCombinations(String digits) {

        LinkedList<String> res = new LinkedList<>();//返回结果 注意队列！！！
        int len = digits.length();
        if(len==0){//直接退出
            return res;
        }
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};//电话号码规则
        res.add("");//启动作用 不然res.peek()异常
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length()==i){//直到头元素比i长
                String t = res.remove();//取队头
                for(char s : map[x].toCharArray())//取出来的队头依次链接数字对应的字母
                    res.add(t+s);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        LetterCombinations017 letterCombinations = new LetterCombinations017();
        System.out.println(letterCombinations.letterCombinations("23"));
    }


}
