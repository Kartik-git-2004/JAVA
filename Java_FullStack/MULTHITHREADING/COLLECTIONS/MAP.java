import java.util.*;
public class MAP {
    public static void main(String[] args) {
        //key value pair
        //key should be unique
        //value can be duplicate
        //no index access
        //no order
        //null key and null value allowed   
        Map<Integer,String> mao = new HashMap<>();
        mao.put(1,"java");
        mao.put(2,"python");
        mao.put(3,"c++");
        mao.put(4,"ruby");
        mao.put(4,"java");
        mao.put(1,"javascript");
        mao.put(null,"ruby");
        System.out.println(mao);
// iterating using .keySet()
        for(Integer key :mao.keySet()){
            System.out.println(key+" "+mao.get(key));

        }

        // using .values()
        for(String value:mao.values()){
            System.out.println(value+" ");
        }
        // using .entrySet()
        for(Map.Entry<Integer,String> entry:mao.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
