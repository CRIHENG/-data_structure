package SeqList;

import org.junit.Test;

/**
 * Created by githu on 2017/11/7.
 */
public class test {
    @Test
    public void test() {

        SeqList<String> c = new SeqList<String>(new String[]{"3", "4"});
        c.insert("1");
        c.insert("2");
        c.insert("3");
        c.insert("4");
        c.insert("5");
        c.insert(5, "6");
        SeqList<String> b = new SeqList<String>(new String[]{"3", "4"});
        b.insert("1");
        b.insert("2");
        b.insert("3");
        b.insert("4");
        b.insert("5");
        c.addAll(b);
        System.out.println(c.remove(5) + "----------");
        System.out.println(c.insertDifferent("1"));
        System.out.println(c.insertDifferent("7"));
        System.out.println(c.remove("7"));
        for (int i = 0; i < c.n; i++) {
            System.out.println(c.element[i]);
        }

    }


    @Test
    public void copy() {
        String[] source = new String[]{"1", "2", "3", "4", "5", "6", "7"};
        SeqList<String> easy = new SeqList<String>(source); //
        SeqList<String> easyCopy = new SeqList<String>(easy);

        System.out.println(easyCopy.toString());
        System.out.println(easy.toString());


        easy.remove(0);
        System.out.println(easy.toString());
        System.out.println(easyCopy.toString());

    }

    @Test
    public void copyII() {
        //deepcopy
        int n = 5;
        SeqList<StringBuffer> lista = new SeqList<StringBuffer>(n - 1);
        for (int i = 0; i < n; i++)
            lista.insert(new StringBuffer((char) ('A' + i) + ""));
        SeqList<StringBuffer> listb = new SeqList<StringBuffer>(lista);
        System.out.println(lista.toString());
        System.out.println(listb.toString());

        lista.insert(new StringBuffer("F"));
        listb.remove(listb.size() - 1);
        lista.remove(lista.size() - 2);
        StringBuffer stringBuffer = lista.get(0);
        stringBuffer.setCharAt(0, 'x');
        SeqList<StringBuffer> listc = new SeqList<StringBuffer>(lista);
        //这里我们可以看到我们支队LISTA 做了替换A 元素 并没有对B元素进行替换 而导致了B的a元素也进行了替换
        //推测只要修改原引用里的数据都会对b造成影响
        //我又做了一个删除的动作 返现A&b中都把E删除了
        //原因因为lista 和list b 用的都是同一个引用，
        System.out.println(lista.toString());
        System.out.println(listb.toString());
        System.out.println(listc.toString());

    }


    @Test
    public void test000() {
        MySeqList<Integer> i = new MySeqList<Integer>();
        i.insert(1);
        i.insert(2);
        i.insert(3);
        i.insert(4);
        System.out.println(i.size());
        i.clear();
        i.insert(1);
        System.out.println(i.get(0));
        System.out.println(i.get(1));
        System.out.println(i.remove(0));



    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
