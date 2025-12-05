public class StairCaseSearch {

    public static boolean Staircasesearch(int matrix[][],int key)
    {
        int col=0, row=matrix.length-1;

      while (row >= 0 && col < matrix[0].length){
            if(matrix[row][col]==key)
            {
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                row--;

            }
            else
            {col++;

            }

        }
        System.out.println("Key not Found !");
        return false;
    }
    public static void main(String args[]){
         int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key=14;
        Staircasesearch( matrix, key);
}
}
