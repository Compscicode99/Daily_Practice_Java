
import java.util.HashMap;
import java.util.Map;

public class PROB4 {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<Integer,String>();
        h.put(100, "Prathmesh");
        h.put(101, "Sumit");
        h.put(102, "Shivam");
        h.put(103, "Gautam");
        h.put(104, "Ankit");

        for ( Map.Entry<Integer,String> obj : h.entrySet() ){
            System.out.println( obj.getKey()+" , "+obj.getValue());
        }

        if(h.containsKey(102)){
            System.out.println("it is present.");
        }
        else{
            System.out.println("it is not present");
        }

    }
}
