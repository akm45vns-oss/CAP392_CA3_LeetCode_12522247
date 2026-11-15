class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            a.add(nums2[i]);
        }
        Collections.sort(a);
        int n = a.size();
        int mid = n / 2;
        double ans;
        if(n%2==0){
            ans=(a.get(mid-1)+a.get(mid))/2.0;
        }else{
            ans=a.get(mid);
        }
          
 return ans;           
    }
}
