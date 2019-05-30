package ArrayHourglass;

public class Solution {
    static int hourglassSum(int[][] arr) {
        final int[][] hourGlassPattern = {{1,1,1},{0,1,0},{1,1,1}};
        int maxSum=-64;

        for(int col=0;col<4;col++){
            for(int row=0;row<4;row++){
                int sum=0;

                for(int glassCol=0;glassCol<3;glassCol++){
                    for(int glassRow=0;glassRow<3;glassRow++){
                        sum += arr[row+glassRow][col+glassCol] * hourGlassPattern[glassRow][glassCol];
                    }
                }
            if(sum>maxSum){
                maxSum=sum;
            }
            }
        }
        return maxSum;
    }
}
