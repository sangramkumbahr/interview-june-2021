package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int valueIn = n;
        int rem=0,res=0;
        String str;
        while(valueIn>0)
        {
            rem=valueIn%2;
            valueIn=valueIn/2;
            str+=String.valueOf(rem);
        }
        
        return str;
    
  
  }
}
