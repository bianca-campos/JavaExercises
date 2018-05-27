package Lab5;

public class DriverArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 3};
        int[][] mat1 = new int[][]{
                { 1, 3, 2, 7, 3 },
                { 10, 10, 4, 6, 2 },
                { 5, 3, 5, 9, 6 },
                { 7, 6, 4, 2, 1 }
        };
        int[][] mat2 = new int[][]{
                { 1, 1, 5, 3, 4 },
                { 12, 7, 6, 1, 9 },
                { 8, 11, 10, 2, 5 },
                { 3, 2, 3, 0, 6 }
        };


        System.out.println(DiverseArray.arraySum(arr1));
        System.out.println(DiverseArray.rowSums(mat1));
        System.out.println(DiverseArray.rowSums(mat2));
        System.out.println(DiverseArray.isDiverse(mat1));
        System.out.println(DiverseArray.isDiverse(mat2));
    }
}
