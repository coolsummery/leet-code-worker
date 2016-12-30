/**
 * Created by baobinbin on 2016/12/29. 输入一个数字，判断是否为回文数 要求空间复杂度为O(1) 因为可能会导致内存溢出
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(13231));
    }


    public static boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
