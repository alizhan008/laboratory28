import java.util.Random;
import java.util.TreeSet;

public class TraderWay {

   public void run(){
       Random random = new Random();
       City bishkek = new City("������",random.nextInt(50,100));
       City tokmok = new City("������",300);
       City osh = new City("��", random.nextInt(50,100));
       City tashkent = new City("�������", random.nextInt(50,100));
       City almaty = new City("����-���",random.nextInt(50,100));

       TraderAndWagon traderAndWagon = new TraderAndWagon(100,random.nextInt(1,5),1000);
   }
}
