package com.api.base;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api.sorting.SortingInterface;
import com.api.sorting.SortingWrapper;


@Controller
public class BaseController {
  
  @Autowired
  SortingInterface temp;
	
  @RequestMapping(value = "/sum", method = RequestMethod.GET)
  @ResponseBody
  public long calculateResultSum(@RequestParam("num1") long num1,@RequestParam("num2") long num2) {
	SUM sum = new SUM(num1,num2);
	return sum.getSUM();
  }
  
  
  @RequestMapping(value = "/sort", method = RequestMethod.POST, headers="Content-Type=application/json")
  @ResponseBody
  public List<Integer> sortedApi(@RequestBody SortingWrapper sortingData){
    if (sortingData.getMethod().equals("bubble")){
      return temp.bubbleSort(sortingData.getData());
    }
    return null;
  }
}