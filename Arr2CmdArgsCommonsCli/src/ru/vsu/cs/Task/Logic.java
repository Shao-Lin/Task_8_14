package ru.vsu.cs.Task;


public class Logic {
    public static int[][] createNewArray(int[][] line) {
        int I = 0;
        int J = 0;
        int K = 0;
        int maxSum = -1;

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[0].length; j++) {
                for (int k = 0; i + k < line.length && j + k < line[0].length; k++) {
                    int currentSum = getSumOfSectorMatrix(line, i, j, k);
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                        I = i;
                        J = j;
                        K = k;
                    }
                }
            }
        }

        return formNewMatrix(line, I, J, K);
    }

    public static int getSumOfSectorMatrix(int[][] arr, int i, int j, int k) {
        int sum = 0;
        for (int cI = i; cI <= i + k; cI++) {
            for (int cJ = j; cJ <= j + k; cJ++) {
                sum += arr[cI][cJ];
            }
        }
        return sum;
    }

    public static int[][] formNewMatrix(int[][] arr, int i, int j, int k) {
        int[][] results = new int[k + 1][k + 1];
        int rI = 0;
        for (int cI = i; cI <= i + k; cI++) {
            int rJ = 0;
            for (int cJ = j; cJ <= j + k; cJ++) {
                results[rI][rJ] = arr[cI][cJ];
                rJ++;
            }
            rI++;
        }
        return results;
    }
}
