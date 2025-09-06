import java.util.*;

public class  IntersectionofTwoArrays{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> isPresent = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(!isPresent.contains(nums1[i])){
                        isPresent.add(nums1[i]);
                    }
                }
            }
        }
        ArrayList<Integer> l = new ArrayList<>(isPresent);
        int[] ar = new int[l.size()];
        for(int i = 0; i < l.size();i++){
            ar[i] = l.get(i);
        }
        return ar;
    }
}