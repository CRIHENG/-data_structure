package Tree.BinaryTree;

public class BinaryTreeImp {
    public Note root;

    public void insert(long value) {
        Note newNode = new Note(value);
        Note current = root;
        Note parent;
        if (root != null) {
            root.value = value;
            return;
        } else {
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


    }

    public Note find(int value) {
        Note current = root;

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
