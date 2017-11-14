package SeqList;

import java.util.Comparator;

/**
 * Created by githu on 2017/11/13.
 */
public class SortedList<T extends Comparator<?extends T>>extends SeqList<T> {
    
    public SortedList(){
        super();
    }
    public SortedList(int length){
        super(length);
    }
    public SortedList(T[] values){
        super(values.length);
        for (int i=0;i<values.length;i++){
            this.insert(values[i]);
        }
    }
}
