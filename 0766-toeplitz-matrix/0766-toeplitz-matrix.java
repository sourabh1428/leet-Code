class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return true;
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> buffer = new LinkedList<>();
        for(int j = 0; j < col; j++) buffer.add(matrix[0][j]);
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(buffer.get(j - 1) != matrix[i][j]) return false;
            }
            buffer.remove(buffer.size() - 1);
            buffer.add(0, matrix[i][0]);
        }
        return true;
    }
}