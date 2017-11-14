package SeqList;

/**
 * Created by githu on 2017/11/7.
 */
public class SeqList<T> extends Object {
    //定义元素 
    //存放任意类型的数据
    public Object[] element;
    //表元素的长度
    public int n;

    //初始化顺序表
    public SeqList(int length) {
        this.element = new Object[length];
        this.n = 0;
    }

    //初始化空表
    public SeqList() {
        this(1);
    }

    //用数组来初始化顺序表的元素
    public SeqList(T[] values) {

        this(values.length);

        for (int i = 0; i < values.length; i++) {
            this.element[i] = values[i];
        }
        this.n = element.length;

    }

    //判断列表是否为空
    public boolean isEmpty() {
        return this.n == 0;
    }

    //返回List长度
    public int size() {
        return this.n;
    }

    //返回第i个元素 0<=i<1 若越界返回null
    public T get(int i) {

        if (i >= 0 && i < this.n) {
            return (T) this.element[i];

        }
        return null;
    }

    //设置元素
    public void set(int x, T value) {
        if (value == null) {
            throw new NullPointerException("value==null");
        }
        if (x >= 0 && x < this.n)
            this.element[x] = value;
        else
            throw new IndexOutOfBoundsException(x + "");

    }

    public String toString() {
        String str = this.getClass().getName() + "(";
        if (this.n > 0)
            str += this.element[0].toString();
        for (int i = 1; i < this.n; i++) {
            str += "," + this.element[i].toString();
        }
        return str + ")";

    }

    //插入操作
    /*@c  插入的位置
    * @T X  插入的元素
    * 可以插入任何位置 首部中部尾部*/
    public int insert(int c, T x) {
        //当顺序表的长度等于存放长度这是对数组进行扩容从,操作方法 建立新的数组 将原来存放的放入新的数组中
        if (n == 0) {
            this.element[c] = x;
            n++;
            return 1;
        }
        if (this.n == element.length) {
            Object[] source = this.element;
            this.element = new Object[element.length * 2];
            int i;
            for (i = 0; i < source.length; i++) {
                this.element[i] = source[i];
            }
        }
        //j==1 c=2  因为C表示的是数组的长度而不是位置 C 的值其实就是数组的最后以为加1这么设计66
        for (int j = this.n - 1; j >= c; j--) {
            this.element[j + 1] = this.element[j];

        }
        this.element[c] = x;
        this.n++;
        return 1;
    }

    //追加
    public int insert(T x) {

        return this.insert(this.n, x);

    }

    //删除remove

    public T remove(int i) {
        T old = (T) this.element[i];
        for (int j = i; j < this.n - 1; j++) {
            this.element[j] = this.element[j + 1];
        }
        this.element[this.n - 1] = null;
        this.n--;
        return old;
    }

    //线性查找

    public int search(T key) {
        for (int i = 0; i < this.size(); i++) {
            if (key.equals(this.element[i])) {
                return i;
            }
        }
        return -1;
    }

    //判断该元素是否在这个集合中
    public boolean contains(T key) {
        return this.search(key) != -1;
    }

    //插入不重复的数据
    public int insertDifferent(T t) {
        if (!contains(t))
            return this.insert(t);
        return -1;
    }

    //删除首次成共的元素
    public T remove(T t) {
        if (contains(t))
            return remove(search(t));
        return null;
    }

    //构造器浅拷贝   
    // 复制是， 基本类型 可以使用浅拷贝，如果有引用类 或者对象引用那么就要实现深拷贝
   /* public  SeqList(SeqList<T> list){
        this.n=list.n;
        this.element=list.element;
        
    }*/
    //构造深拷贝
    //这并不能演示引用同一个实例导致的数据修改错误   深度拷贝应该是，复制每个引用类型
    /*成员变量所引用的数组对象，直至该对象可达的所有对象。
    * */
    public SeqList(SeqList<? extends T> list) {
        this.n = list.n;

        this.element = new Object[list.element.length];
        for (int i = 0; i < list.n; i++) {
            this.element[i] = list.element[i];
        }

    }
   // 顺序表比较相等
    //两个线性表别叫应该长度和元素都相等
     public boolean equals(Object obj){
         if(this==obj)return  true;
         if(obj instanceof SeqList<?>){
             SeqList<T> list =(SeqList<T>)obj;
             if(this.n==list.n){
                 for(int i=0;i<this.n;i++){
                     if(!(this.get(i).equals(list.get(i)))){
                         return false;
                     }
                     return true;
                 }
             }
         }
         return  false;
     }
     
     public void addAll(SeqList<?extends T> list){
         
         if(list!=null) 
             for(int i=0 ;i<list.n;i++)
                this.insert(list.get(i));
             
     }
   
     
}