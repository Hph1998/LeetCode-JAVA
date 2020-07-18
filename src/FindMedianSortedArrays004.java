import java.util.HashMap;

public class FindMedianSortedArrays004 {
    //要求时间复杂度O(log(m+n)) 没达到但通过 现在是O(m+n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int temp1=0;//记录遍历nums1[]的位置
        int temp2=0;//记录遍历nums2[]的位置
        HashMap hashMap = new HashMap();//好像也没必要用 数组就能搞定
        double res=0;
        for(int i = 0; i<len/2+1; i++){ //排序排到一半就出结果
            if(temp1>=nums1.length){
                hashMap.put(i, nums2[temp2]);
                temp2++;
            }else if(temp2>=nums2.length){
                hashMap.put(i, nums1[temp1]);
                temp1++;
            }else if(nums1[temp1]<nums2[temp2]) {
                hashMap.put(i, nums1[temp1]);
                temp1++;
            }else {
                hashMap.put(i, nums2[temp2]);
                temp2++;
            }
        }
        if(len % 2 == 1){//判断总个数奇偶
            res = Double.parseDouble(hashMap.get(len/2).toString());
        }else{
            res = (Double.parseDouble(hashMap.get(len/2-1).toString()) + Double.parseDouble(hashMap.get(len/2).toString()))/2.0;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{3,4};
        //findMedianSortedArrays(nums1,nums2);
    }
}
