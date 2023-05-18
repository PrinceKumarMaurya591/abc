package org.example.searchinandsorting;

import java.util.Arrays;

public class SelectionSort {


        public static void selectionSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] array = { 5, 2, 8, 12, 1 };
            selectionSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }
