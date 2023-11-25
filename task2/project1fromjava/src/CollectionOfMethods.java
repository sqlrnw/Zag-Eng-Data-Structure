public class CollectionOfMethods {

 public static int ReversedInt(int revValue) {
     int reverse = 0;
     while (revValue != 0) {
         int reminder = revValue % 10;
         reverse = reverse * 10 + reminder;
         revValue = revValue / 10;
     }
     return reverse;
     }
    public static int RandomValue(int minValue,int maxValue)
    {
     int randomValue =(int)(Math.random()*(maxValue-minValue)+minValue);
     return randomValue ;
    }
    public static char RandomChar()
    {
     char randomChar = (char)(Math.random()*26+65);
     return randomChar ;
    }
    public static  <T> void Stackk(T [] anythingYouWantToPrint)
    {
     for(int i=0;i< anythingYouWantToPrint.length;i++)
         System.out.println(anythingYouWantToPrint[i]);
    }

}
