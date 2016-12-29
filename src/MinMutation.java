import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Created by baobinbin on 2016/12/26.
 * 给定开始字符串和结束字符串
 * 判断开始字符串转化为结束字符串需要的最小变异次数
 * 注意：每次变异必须为bank数组中的字符串
 */
public class MinMutation {


    public static void main(String[] args) {
        String start = "AAAACCCC";
        String end = "CCCCCCCC";

        String[] bank = {"AAAACCCA", "AAACCCCA", "AACCCCCA", "AACCCCCC", "ACCCCCCC", "CCCCCCCC", "AAACCCCC", "AACCCCCC"};
        System.out.println(minMutation(start, end, bank));
    }


    public static int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) return 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        Map<String, Integer> mutationCount = new HashMap<>();
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            for (int i = 0, len = bank.length; i < len; i++) {
                int index = curr.length();
                String _bank = bank[i];
                if (_bank == null)
                    continue;
                int ld = 0;
                while (--index >= 0) {
                    if (curr.charAt(index) != _bank.charAt(index)) {
                        ld++;
                    }
                }
                if (ld == 1) {
//                    System.out.println(curr + "-----可能出现的变异----->" + _bank);
                    bank[i] = null;
                    queue.add(_bank);
                    Integer count = 1;
                    if (mutationCount.containsKey(curr)) {
                        count += mutationCount.get(curr);
                    }
                    mutationCount.put(_bank, count);
                }
            }
        }
        if(mutationCount.containsKey(end)){
//            System.out.println(mutationCount);
            return mutationCount.get(end);
        }
        return -1;
    }
}
