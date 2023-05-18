package org.example.array;
import java.util.ArrayList;
import java.util.List;
public class HowDoYouFindTheLeadersInAnArray {




        public static List<Integer> findLeaders(int[] array) {
            List<Integer> leaders = new ArrayList<>();
            int n = array.length;
            int maxRight = array[n - 1];
            leaders.add(maxRight);

            for (int i = n - 2; i >= 0; i--) {
                if (array[i] > maxRight) {
                    maxRight = array[i];
                    leaders.add(maxRight);
                }
            }

            return leaders;
        }

        public static void main(String[] args) {
            int[] array = { 16, 17, 4, 3, 5, 2 };
            List<Integer> leaders = findLeaders(array);
            System.out.println("Leaders in the array are: " + leaders);
        }
    }
