package sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class test134 {
    class SparseArray {
        Vector<Integer> newArr ;
        public class EmptyInSparseArrayException extends RuntimeException{
            public EmptyInSparseArrayException(){}
        }

        //실행 시 예외: 스택이 가득 참
        public class OverflowIntSparseArrayException extends RuntimeException{
            public OverflowIntSparseArrayException(){}
        }

        public void init(int[] arr, int size) {
            newArr.setSize(size);
            for (int i = 0; i < size; i++)
                newArr.set(i,arr[i]);
        }

        public void set(int i, int val) {
            newArr.set(i, val);
        }

        public void get(int i){
           newArr.get(i);
        }
    }
}
