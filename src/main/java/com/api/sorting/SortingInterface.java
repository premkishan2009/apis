package com.api.sorting;

import java.util.List;

public interface SortingInterface {
  List<Integer> bubbleSort(List<Integer> list);
  int[] quickSort(int[] list);
  int[] heapSort(int[] list);
  int[] mergeSort(int[] list);
  

}
