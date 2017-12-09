package com.api.sorting;

import java.util.List;

public class SortingWrapper {
  String method;
  List<Integer> data;
  
  
  public void setData(List<Integer> data){
    this.data = data;
  }
  
  public void setMethod(String method){
    this.method = method;
  }
  
  public List<Integer> getData(){
    return this.data;
  }
  
  public String getMethod(){
    return this.method;
  }
  
  @Override
  public String toString()
  { return this.data.toString();}
  
}
