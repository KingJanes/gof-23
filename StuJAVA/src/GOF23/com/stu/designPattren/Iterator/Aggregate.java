package GOF23.com.stu.designPattren.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *   定义聚合类
 * */
public class Aggregate {

        private List<Object> list = new ArrayList<Object>();

        public void add(Object obj){
            list.add(obj);
        }
        public boolean remove(Object obj){
            return list.remove(obj);
        }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyInterarot interator(){
            return  new InsideInterator();
        }




    /**
     *
     * */
    private class InsideInterator implements MyInterarot{

        private int cursor ;

        @Override
        public Object get() {
            return list.get(cursor);
        }

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public int of(Object obj) {
           return list.indexOf(obj);
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()){
                return true;
            }
            return false;
        }

        @Override
        public void next() {
            if (cursor < list.size()){
                cursor ++;
            }
        }

        @Override
        public boolean isFirst() {
            return cursor == 0 ? true : false;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size()-1) ? true : false;
        }
    }
}
