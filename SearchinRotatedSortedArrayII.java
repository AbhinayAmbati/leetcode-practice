import java.util.ArrayList;
import java.util.Collections;

public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        ArrayList<Integer> alist = new ArrayList<>();
        for(int n : nums){
            alist.add(n);
        }
        Collections.sort(alist);
        boolean res = callPowerHouse(alist,target);
        return res;
    }
    public boolean callPowerHouse(ArrayList<Integer> alist, int target){
        int left =0, right = alist.size()-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(alist.get(mid) == target) return true;
            if(alist.get(mid) < target) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}
