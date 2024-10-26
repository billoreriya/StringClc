import java.beans.Transient;

public class Test{


     int add(String number)
     {
        if(number.isEmpty()){
        return 0;
        }
        else{

            String[] numberArray = number.split(",");
            int sum =0;
            for(String n : numberArray)
            {
                sum += Integer.parseInt(n);
            }
            return sum;
        }
     }
     @Test
     public void oneNumberAdd() {
        assertEquals(1,add( "1"));  
       }
       @Test
       public void twoNumberAdd()
       {
        assertEquals(2,add( "1" + "1"));
       }
    public static void main(String[] args) {

        add(10);
        System.out.println(sum);
    }
}
