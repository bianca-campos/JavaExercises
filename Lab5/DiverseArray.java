package Lab5;


public class DiverseArray {
    private int[] inputArr;


    public DiverseArray(int[] inputArr) {
        this.inputArr = inputArr;
    }

    /**
     * This method return the sum of the values of one dimensional array
     *
     * @param arr - input the array
     * @return - sum of the values of one dimensional array
     */
    public static int arraySum(int[] arr){
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++){
             sumArr += arr[i];
        }
        return sumArr;
    }

    /**
     * return an array that represents the sum of the rows of a two dimensional array
     *
     * @param arr2D - input 2D array
     * @return - sum of the rows of a two dimensional array
     */
    public static int[] rowSums(int[] [] arr2D){
        int[] sumArr = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++) {
            sumArr[i] = arraySum(arr2D[i]);
        }
        return sumArr;
    }

    /**
     * analyses the rows sum
     *
     * @param arr2D - input 2D array
     * @return - return true if all rows in arr2D have different row sums. Otherwise, false
//     */
        public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for(int i = 0; i < sums.length - 1; i++) {
            for(int j = i + 1; j < sums.length; j++) {
                if(sums[i] == sums[j]){
                    return false;
                }
            }
        }
        return true;
    }
    }

