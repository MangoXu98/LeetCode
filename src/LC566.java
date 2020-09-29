public class LC566 {
    static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res=new int[r][c];
        int row=nums.length;
        int col=nums[0].length;
        if(r*c!=row*col){
            return nums;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=nums[(i*c+j)/col][(i*c+j)%col];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums1= {{1,4},{3,2}};
        int r=1,c=4;
        int[][] num=matrixReshape(nums1,r,c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
