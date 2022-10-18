# ZohoPrep

/*Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
*/

#java

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int rows=0,rowe=matrix.length-1,cols=0,cole=matrix[0].length - 1;
        while(rows<=rowe && cols<=cole) {
            for (int j=cols;j<=cole;j++){
                res.add(matrix[rows][j]);
            }
            rows++;            
            for(int j=rows;j<=rowe;j++){
                res.add(matrix[j][cole]);
            }
            cole--;
            if(rows<=rowe) {
                for (int j=cole;j>=cols;j--){
                    res.add(matrix[rowe][j]);
                }
            }
            rowe--;
            if(cols<=cole){
                for (int j=rowe;j>=rows;j--){
                    res.add(matrix[j][cols]);
                }
            }
            cols++;
        }
        return res;
    }
}
