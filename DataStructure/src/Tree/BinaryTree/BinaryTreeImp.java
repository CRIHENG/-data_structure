package Tree.BinaryTree;

public class BinaryTreeImp {
    public Node root;

    public void insert(long value) {
     Node newNode =new Node(value);
     Node parent;
     Node current=root;
     if(root==null){
         root=newNode;
         return;
     }
     while (true) {
         parent = current;
         if (current.value > value) {
             current = current.leftNote;
             if (current == null) {
                 parent.leftNote = newNode;
                 return;
             }
         } else {
             current = current.rightNote;
             if (current == null) {
                 parent.rightNote = newNode;
                 return;
             }
         }
     }

    }

    public Node find(int value) {
        Node current = root;

        while (current.value != value) {
            if (current.value < value) {
                current = current.leftNote;
            } else {
                current = current.rightNote;
            }
        }
        if (current == null) {
            return null;
        }
        return current;
    }
}
