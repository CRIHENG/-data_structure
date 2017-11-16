package LinkList;

import org.junit.Test;

/**
 * Created by githu on 2017/11/16.
 */
public class test {
    @Test
    public void testSinglyList() {
        //单链表遍历操作
        Node<Integer> head = new Node<Integer>(1, new Node<Integer>());

        Node<Integer> p = head;
        while (p != null) {
            System.out.println(p.data.toString());
            p = p.next;
        }
        //循环一次以后会出现nullpointerException
        while (p != null) {
            System.out.println(p.data.toString());
            // p.next=p;
        }

    }

    /**
     * 1.空表插入
     * 2.头插入
     * 3.中间插入
     * 4.尾插入
     */
    @Test
    public void inserSinglyList() {

        //1
        Node<Integer> head = new Node<Integer>(1, null);
        //2
        Node<Integer> insertHead = new Node<Integer>(2, head);
        //3
        Node<Integer> front = new Node<Integer>(3, head);
        insertHead.next = front;
        //4
        Node<Integer> fin = new Node<Integer>(4, null);
        head.next = fin;

        while (insertHead != null) {
            System.out.println(insertHead.data.toString());
            insertHead = insertHead.next;
        }

    }


}
