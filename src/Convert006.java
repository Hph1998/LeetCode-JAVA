import java.util.HashMap;

public class Convert006 {
    public String convert(String s, int numRows) {
        if(numRows == 1){//一行就不变呗 不加过不了 报超出时间限制
            return s;
        }

        int len = s.length();
        String res = "";

        for (int i = 0; i < numRows; i++) { //按示例几行解释几行
            for (int j = i; j < len; j += (numRows - 1) * 2) {//找规律 两竖线间隔与numRows的关系
                res = res + s.charAt(j);
                if (i > 0 && i < numRows - 1) { //不是第一行或最后一行 中间的数
                    int sec = j + 2 * (numRows - i - 1); //找规律 中间斜着的跟numRows和i的关系
                    if (sec < len) {
                        res = res + s.charAt(sec);
                    }
                }
            }
        }
        return res;
    }
}
