public class IsMatch010 {

    public boolean isMatch(String s, String p) {

        //如果模式串为空，则只能匹配空的匹配串。
        if (p.isEmpty()){
            return s.isEmpty();
        }
        //记录匹配串的第一个字符是否被模式串匹配。
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        //模式串包含两个字符及以上并且第二个字符为 * 。
        if (p.length() >= 2 && p.charAt(1) == '*'){
            //如果模式串第三个字符往后可以匹配原匹配串
            //或者匹配串删除第一个匹配的字符后可以被模式串匹配，则表示可匹配。
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            //如果模式串只有一个字符或者第二个字符不是* ，
            //则匹配串第一个字符被模式串匹配并且分别删除第一个字符后模式串还能匹配匹配串。
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }

    }


    public static void main(String[] args) {
        IsMatch010 isMatch010 = new IsMatch010();
        isMatch010.isMatch("aaa","a*");
    }

}
