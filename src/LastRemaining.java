import java.util.Vector;

/**
 * Created by baobinbin on 2016/12/30. 消除游戏 Elimination Game 给定一个数组长度 交替从左到右 从右到左删除不相邻的一个数字
 * 直到剩下最后一个数字
 */
public class LastRemaining {

    public static void main(String[] args) {
            lastRemaining(72);
    }



    public static int lastRemaining(int n) {
        Vector<Integer> vector = new Vector<>();
        if (n == 1) {
            return n;
        }
        for (int i = 1; i <= n; i++) {
            vector.add(i);
        }
        while (true) {
            for (int i = 0; i < vector.size(); i++) {
                if (vector.size() == 0 || vector.size() == 1) {
                    break;
                }
                vector.remove(i);
            }
            System.out.println(vector);
            for (int i = vector.size() - 1; i >= 0; i -= 2) {
                if (vector.size() == 0 || vector.size() == 1) {
                    break;
                }
                vector.remove(i);
            }
            System.out.println(vector);
            if (vector.size() == 0 || vector.size() == 1) {
                break;
            }
        }
        return vector.lastElement();
    }
}
