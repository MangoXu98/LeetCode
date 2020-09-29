import java.util.Arrays;

public class LC88 {
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        int j=0;
        while(j<n){
            nums1[i]=nums2[j];
            i++;j++;
        }
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1= {1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge(nums1,m,nums2,n);
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
