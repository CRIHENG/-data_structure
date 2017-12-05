package Tree.BinaryTree;


import org.junit.Test;

public class TestTree {
@Test
    public void testTree01(){
     BinaryTreeImp binaryTreeImp=new BinaryTreeImp();
     binaryTreeImp.insert(10);
     binaryTreeImp.insert(1);
     binaryTreeImp.insert(3);
     binaryTreeImp.insert(20);
     System.out.println(binaryTreeImp.root.leftNote.value);
     System.out.println(binaryTreeImp.root.leftNote.rightNote.value);
     System.out.println(binaryTreeImp.root.rightNote.value);
     System.out.println(binaryTreeImp.find(3).value);
}
}
