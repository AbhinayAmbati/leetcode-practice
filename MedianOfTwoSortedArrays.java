import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int mid = list.size();
        if(mid % 2 == 1){
            return list.get(mid/2);
        }else{
            return (list.get(mid/2 -1 ) + list.get(mid/2)) / 2.0;
        }
    }
}