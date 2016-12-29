/**
 * Created by baobinbin on 2016/12/29.
 * 输入一个数字，判断是否为回文数
 * 要求空间复杂度为O(1) 因为可能会导致内存溢出
 */
public class IsPalindrome {

    public static void main(String[] args) {
        isPalindrome(13231);
    }


    public static boolean isPalindrome(int x) {
        if (x < 0)//负数不是回文数
            return false;
        if (x < 10)//小于10的全部是回文数
            return true;
        int paraNum = x;
        int revNum = 0;
        System.out.println(Integer.highestOneBit(x));
        System.out.println(Integer.bitCount(x));
        return false;
    }
}
