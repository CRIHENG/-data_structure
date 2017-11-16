package LinkList;

/**
 * Created by githu on 2017/11/16.
 * 链表节点
 * 
 * 1.数据域
 * 2.节点域（可以理解下一个节点的引用）--》指向HEAP的地址）
 * 3.构造方法；
 * 
 */
public class Node<T> {
    
    public  T data;
    public Node<T> next;
    public Node(T t,Node<T> next){
        this.data=t;
        this.next=next;
    }
    public Node(){
        this(null,null);
    }
    public String toString(){
        
        return this.data.toString();
    }
    
}
