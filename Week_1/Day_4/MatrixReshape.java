class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] newMat = new int[r][c];
        if(m*n == r*c){
            for(int i=0; i<m*n; i++){
                newMat[i/c][i%c] = mat[i/n][i%n];
            }
        }
        else{
            return mat;
        }
        return newMat;
    }
}
