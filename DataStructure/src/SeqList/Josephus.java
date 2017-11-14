package SeqList;

/**
 * Created by githu on 2017/11/9.
 * <p>
 * josephus环问题：古代某法官要判断N个犯人的死刑，他有一条荒唐的法律，将犯人站成一个圈，从第start个人开始i，没数到
 * distance个烦人，就拉出来弄死，然后再从下一个开始数distance个，疏导的人在弄死，指导剩下的最后一个犯人予以赦免。
 */
public class Josephus {


    public String josephus(int[] number, int start, int distance) {

        SeqList<String> criminals = new SeqList<String>();
        //int number可以传数组作为要处刑的犯人这种属于分离 给定一个数组留一个数
        for (int i = 0; i < number.length; i++) {
            //说明 一个char类型的字符加上一个数字等于他的ASc码的值如果在该值前加上类型的会自动转成字符 
            criminals.insert(number[i] + "");
        }
        System.out.println(criminals.size());
       
       /* while (criminals.size() > 1) {
            i = (i + distance - 1) % criminals.size();
            System.out.println("被干掉" + criminals.get(i));
            criminals.remove(i);
        }*/
        //for循环其实是先执行一圈 然后在开始对循环变量进行操作
        //
        for ( int i =(start+ distance - 1) % criminals.size(); criminals.size() > 1; i = (i + distance - 1) % criminals.size()){
            criminals.remove(i);
    }
        return criminals.get(0);

    }


}
