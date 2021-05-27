package set_map.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Treetest {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.sort(String::compareTo);//重写了比较器
        list.sort(Comparator.naturalOrder());
        list.spliterator();
        var trees= new TreeSet<String>();
        String[] s={"hello","world","my","java"};
        for(String ss:s){
            trees.add(ss);
        }

    }
}
