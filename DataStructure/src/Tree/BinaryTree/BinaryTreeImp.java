package Tree.BinaryTree;

public class BinaryTreeImp {
    public Note root;

    public void insert(long value) {
    Note newNode=new Note(value);
    Note current =root;
    Note parent;
        if (root != null) {
            root.value = value;
            return;
        }else{
            while (true){
   parent=current;
   if(current.value>value){
      current=current.leftNote;
      if(current==null) {
          parent.leftNote = newNode;
          return;
      }
   }else {
       current=current.rightNote;
       if(current==null){
           parent.rightNote=newNode;
           return;
       }
   }
            }
        }



    }
}
