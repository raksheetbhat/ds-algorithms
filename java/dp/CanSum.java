import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class CanSum {
    /**
     * time complexity
     * 
     * space
     * 
     */
    public static void main(String[] args){
        int[] arr = {5,4,1,10};
        int target = 15;
        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        //System.out.println(foo(arr.length-1, arr, target));
        //cansum(target, arr, map, list);
    
        List<Integer> li = howsum(target, arr);    
        System.out.println(li);

        Map<Integer, List<Integer>> map1 = new HashMap<>();
        List<Integer> li1 = howsumMemo(target, arr, map1);
        System.out.println(li1);

        List<Integer> li2 = minSum(target, arr);
        System.out.println(li2);
    }
    public static boolean foo(int i, int[] arr, int target) {
        if(target == 0) return true;
        if(i<0) return false;
        System.out.println(i+", "+target);
        

        return foo(i-1, arr, target) || foo(i-1, arr, target % arr[i]);
    }
    public static boolean cansum(int target, int[] arr, Map<Integer, Boolean> map, List<Integer> list) {
        if(map.containsKey(target)) return map.get(target);
        if(target == 0) return true;
        if(target < 0) return false;

        for(int i : arr) {
            int rem = target - i;
            if(cansum(rem, arr, map, list) == true) {
                map.put(target, true);
                list.add(i);
                return true;
            }
        }

        map.put(target, false);
        return false;
    }

    public static List<Integer> howsum(int target, int[] arr) {
        if(target == 0) return new ArrayList<Integer>();
        if(target < 0) return null;

        for(int i : arr) {
            int rem = target - i;
            List<Integer> res = howsum(rem, arr);
            if(res != null) {
                res.add(i);
                return res;
            }
        }

        return null;
    }

    public static List<Integer> howsumMemo(int target, int[] nums, Map<Integer, List<Integer>> map) {
        if(map.containsKey(target)) return map.get(target);
        if(target == 0) return new ArrayList<Integer>();
        if(target < 0) return null;

        for(int i : nums) {
            int rem = target - i;
            List<Integer> li = howsumMemo(rem, nums, map);
            if(li != null) {
                li.add(i);
                map.put(i, li);
                return li;
            }
        }

        return null;
    }

    public static List<Integer> minSum(int target, int[] nums) {
        if(target == 0) return new ArrayList<>();
        if(target < 0) return null;

        List<Integer> res = null;

        for(int i : nums) {
            int rem = target - i;
            List<Integer> v = minSum(rem, nums);
            if(v != null) {
                if(res == null || v.size() < res.size()) {
                    v.add(i);
                    res = v;
                }
            }
        }

        return res;
    }
}