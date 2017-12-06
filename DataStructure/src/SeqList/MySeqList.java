package SeqList;

import java.util.List;

/**
 * Created by githu on 2017/12/6.
 */
public class MySeqList<T> implements MyList {
    //用于存放数据
    protected Object[] element;

    //线性表的长度
    protected int n;


    MySeqList(Object[] values) {
        this(values.length);
        for (int i = 0; i < values.length; i++) {
            this.element[i] = values[i];
        }
        this.n = element.length;
    }

    MySeqList(int length) {
        this.element = new Object[length];
        this.n = 0;
    }

    MySeqList() {
        this(64);
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public Object get(int i) {
        if (i >= 0 && i < n) {
            return element[i];
        }
        return null;
    }

    public void set(int i, Object x) {
        if (x == null) {
            throw new NullPointerException();
        }
        if (i >= 0 && i < n) {
            element[i] = x;
        } else {
            throw new IndexOutOfBoundsException(i + "");
        }
    }

    public int insert(int i, Object x) {
        if (x == null) {
            throw new NullPointerException();
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(i + "");
        }
        Object[] source = this.element;
        if (this.n == element.length) {
            this.element = new Object[element.length * 2];
            for (int j = 0; j < source.length; j++) {
                this.element[i] = source[i];
            }
        }
        for (int k = this.n - 1; k >= i; k--) {
            element[k + 1] = element[k];
        }
        element[i] = x;
        this.n++;
        return i;
    }

    public int insert(Object x) {
        return insert(this.n,x);
    }

    public Object remove(int i) {
        
        
        
        
        return null;
    }

    public void clear() {

    }

    public int search(Object key) {
        return 1;
    }

    public boolean contains(Object key) {
        return true;
    }

    public int insertDifferent(Object x) {
        return 1;
    }

    public Object remove(Object key) {
        return null;
    }

    public void addAll(List list) {

    }
}
