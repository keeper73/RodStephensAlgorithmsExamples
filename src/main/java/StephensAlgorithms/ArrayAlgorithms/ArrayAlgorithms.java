package StephensAlgorithms.ArrayAlgorithms;

public class ArrayAlgorithms {

    public static int[][] distanceToTheNearestEdge(int m, int n){
        int[][] arr = new int[m][n];
        for(int i =0;i<=(m-1)/2;i++){
            for(int j=0; j<=(n-1)/2;j++){
               arr[i][j]=Math.min(i, j);;
                arr[i][m-j-1]=Math.min(i, j);;
                arr[n-i-1][j]=Math.min(i, j);;
               arr[n-i-1][m-j-1]=Math.min(i, j);;
            }
        }
        return arr;
    }
}
