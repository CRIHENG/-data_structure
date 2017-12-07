package SeqList;

import org.junit.Test;

public class MyJosePhus {

    /**
     * 顺序表实现约瑟夫环
     * <p>
     * 题目：从第i个开始 每隔distance 删除一个元素 当剩最后一个元素返回该元素;
     */
    @Test
    public void josePhous() {
        SeqList<Character> seq = new SeqList<Character>();
        for (int i = 0; i < 5; i++) {
            seq.insert(i, (char) ('A' + i));
        }
        int distance = 2;
        int i = 0;
        while (seq.size() > 1) {
            i = (i + distance - 1) % seq.size();//?不懂
            seq.remove(i);
        }
        System.out.println(seq.get(0));
    }
}
