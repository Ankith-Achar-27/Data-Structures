package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] result = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <=mid && j <=end) {
            if (arr[i] < arr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr[j++];
            }
        }
        while (i <=mid) {
            result[k++] = arr[i++];
        }
        while (j <=end) {
            result[k++] = arr[j++];
        }
        for (int l = 0; l < result.length; l++) {
            arr[start + l] = result[l];
        }
    }
}