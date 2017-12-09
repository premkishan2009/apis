package com.api.sorting;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SortingImpl implements SortingInterface{

  @Override
  public List<Integer> bubbleSort(List<Integer> list) {
    // TODO Auto-generated method stub
    for (int j = 0; j < list.size(); j++){
    for (int i = 0; i < list.size() - 1 - j; i++){
      if (list.get(i) > list.get(i+1)){
        list.set(i, list.get(i) + list.get(i+1));
        list.set(i+1, list.get(i) -list.get(i+1));
        list.set(i, list.get(i) - list.get(i+1));
      }
      }
    }
    return list;
  }

  @Override
  public int[] quickSort(int[] list) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int[] heapSort(int[] list) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int[] mergeSort(int[] list) {
    // TODO Auto-generated method stub
    return null;
  }

}
