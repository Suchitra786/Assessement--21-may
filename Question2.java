import java.util.HashMap;
import java.util.Map.Entry;
public class Question2 {
  public static void main(String[] args) {
      int sum=0,cnt=0,avg;
    HashMap<Integer, Integer> h1 = new HashMap<Integer,Integer>();

 

    h1.put(22, 50);
    h1.put(56, 90);
    h1.put(11, 30);
    h1.put(35, 20);
    
    for(Entry<Integer, Integer> m : h1.entrySet()){     
        int s=0,t=0;
        s= (int) m.getKey();
        t=(int) m.getValue();
        if(s%2!=0)
        {
            cnt++;
            sum=sum+t;
                
        }
       }
    avg=sum/cnt;
    System.out.println(avg); 
  }
}

 

