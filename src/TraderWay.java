import java.util.Random;
import java.util.TreeSet;

public class TraderWay {

   public void run(){
       Random random = new Random();
       City bishkek = new City("Бишкек",random.nextInt(50,100));
       City tokmok = new City("Токмок",300);
       City osh = new City("Ош", random.nextInt(50,100));
       City tashkent = new City("Ташкент", random.nextInt(50,100));
       City almaty = new City("Алма-ата",random.nextInt(50,100));

       TraderAndWagon traderAndWagon = new TraderAndWagon(100,random.nextInt(1,5),1000);
   }
}
