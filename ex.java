import java.util.ArrayList;
import java.util.List;

class sublist {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n:nums) {
            ArrayList<Integer> list = new ArrayList<>();
            int len = result.size();
            for (int i = 0; i < len; i++) {
                list.addAll(result.get(i));
                list.add(n);
                result.add(list);
            }
        }
        return result;
    }
}