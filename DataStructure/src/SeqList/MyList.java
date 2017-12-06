package SeqList;

import java.util.List;

/**
 * Created by githu on 2017/12/6.
 * 
 * 线性表:
 *    是有n(n>=0)个类型相同的数据元素（a0,a1,a2,...,a(n-1)）组成的有限序列 ，
 *    记作（a0,a1,a2,...,a(n-1)）,其中，元素a1的数据类型可以是整数，浮点数，
 *    字符或者类；n是线性表的元素个数，称为线性长度。若n=0,则为空表，若n>0,
 *    则ai（0<i<n-1）有且就有一个前驱元素a(i-1)和一个后继元素a(i+1),a0没有前驱
 *    元素，a(n-1)没有后继元素。 的
 * 
 * 
 **/
public interface MyList<T> {
    //判断线性表是否为空
     boolean isEmpty();
    //返回线性表个数
     int size();
    //返回第i个元素
    T get(int i);
    //设置第i个元素为X
    void set(int i,T x);
    //返回线性表所有元素的描述字符串
    String toString();
    //插入x作为第i个元素,x!=null ,返回元素序号i
    int insert(int i ,T x);
    //在线性表最后插入x元素，返回x序号
    int insert(T x);
    //删除第i个元素，返回被删除
    T remove(int i);
    //删除线性表所有元素
    void clear();
    //查找首次出现于key相等元素，返回元素符号
    int search(T key);
    //判断是否包含关键字为key元素
    boolean contains(T key);
    //插入不重复元素
    int insertDifferent(T x);
    //删除首次出现与key相等元素，返回被删除元素
    T remove(T key);
    //比较两个线性表所有元素是否对应相等
    boolean equals(Object obj);
    //在this中添加所有的元素，集合并运算
    void  addAll(List<T> list);
        
        
        
}
