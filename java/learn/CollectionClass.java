import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionClass {
    public static void main(String[] args) {
        List<Sample> list = new ArrayList<>();

        for(int i=0;i<=6;i++){
            list.add(new Sample(i));
        }

        //list.remove(1);

        for(Iterator<Sample> iter = list.iterator(); iter.hasNext();) {
            //list.add(new Sample(10));
            
            if(iter.next().val % 2 == 0) iter.remove();
        }

        for(Sample s : list) {
            System.out.println(s.val);
        }
    }
}

class Sample {
    int val;

    public Sample(int val) {
        this.val = val;
    }
}