package math;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sorting.SortingImpl;
import sorting.SortingInterface;
import sorting.SortingWrapper;


@Controller
public class ExampleController {
	
	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	
 
   
  
  @RequestMapping(value = "/sum", method = RequestMethod.GET)
  @ResponseBody
  public long calculateResultSum(@RequestParam("num1") long num1,@RequestParam("num2") long num2) {
	SUM sum = new SUM(num1,num2);
	redisTemplate.opsForValue().set(sum.getKey(), String.valueOf(sum.getSUM()));
    return sum.getSUM();
  }
  
  @RequestMapping(value = "/get", method = RequestMethod.GET)
  @ResponseBody
  public String returnResultSum(@RequestParam("num1") long num1,@RequestParam("num2") long num2) {
	  
	SUM sum = new SUM(num1,num2);
	return redisTemplate.opsForValue().get(sum.getKey());
    }
  
  @RequestMapping(value = "/sort", method = RequestMethod.POST, headers="Content-Type=application/json")
  @ResponseBody
  public List<Integer> sortedApi(@RequestBody SortingWrapper sortingData){
    SortingInterface temp = new SortingImpl();
    if (sortingData.getMethod().equals("bubble")){
      return temp.bubbleSort(sortingData.getData());
    }
    return null;
  }
}