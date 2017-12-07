package SeqList;


/**
 * Created by githu on 2017/11/13.
 * 
 * 
 * 暂停对java的多态，继承不太了解。
 */
public class SortedList<T extends Comparable<?super T>>extends SeqList<T> {
    
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
    public int insert(T x){
        
        int i=0;
        if(this.isEmpty()||x.compareTo(this.get(this.size()-1))>0){
            i=this.n;
        }else {
            while (i<this.n&&x.compareTo(this.get(i))>0){
                i++;
            }
        }
        super.insert(i,x);
        
        return i;
    }
    
    
}
