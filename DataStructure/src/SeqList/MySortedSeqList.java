package SeqList;


/**
 * 1.子类继承原则
 * 子类不能继承父类的构造方法，子类能够继承除构造方法之外的成员变量和成员方法，包括析构方法；
 * 子类对从父类继承的成员的访问权限，取决于父类成员声明的访问权限，子类能够访问父类的公有和
 * 保护成员，不能访问父类私有的成员；
 * 子类 不能删除从父类继承来的成员。当从父类继承来的成员不能满足子类的需要时，子类不能删除它们
 * 可以重新定义它们，修改或扩充父类成员方法的功能，使父类成员能够适应子类新的需求。
 */

public class MySortedSeqList<T extends Comparable<? super T>> extends MySeqList<T> {

    MySortedSeqList() {
        super();
    }

    MySortedSeqList(int length) {
        super(length);
    }

    MySortedSeqList(T[] values) {
        super(values.length);
        for (int i = 0; i < values.length; i++) {
            this.insert(values);
        }
    }

    public void insert(T x) {
        if (this.size() == 0) {
            super.insert(x);
        } else {
            int i;
            for (i = this.size() - 1; i < this.size(); i--) {
                if (x.compareTo(this.get(i)) > 0) {
                    break;
                }
                if (i == 0) {
                    break;
                }
            }
            if (i == 0) {
                this.insert(i, x);
            } else {
                this.insert(i + 1, x);
            }
        }
    }

    public void insertDifferent(T x) {
        int j = 0;
        for (int i = 0; i < this.size(); i++) {
            if (x.compareTo(this.get(i)) == 0) {
                j++;
            }
        }
        if (j == 0) {
            this.insert(x);
        }


    }

    public void insertII(T x) {
        int i = 0;
        if (this.isEmpty() || x.compareTo(this.get(this.size() - 1)) > 0) {
            i = this.n;
        } else {
            while (i < this.n && x.compareTo(this.get(i)) > 0) {
                i++;
            }

            super.insert(i, x);
            System.out.println(i);
        }
    }

    public int search(T key) {
        for (int i = 0; i < this.size(); i++) {
            if (key.compareTo(this.get(i)) == 0) {
                return i;
            }
        }
        return -1;
    }

    public T remove(T key) {
        return (T) this.remove(this.search(key));
        

    }

}