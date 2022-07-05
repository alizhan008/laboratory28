import com.products.ProductQuality;

import java.util.Random;

public abstract class Events {

    private void normalDay() {
        System.out.println("Ничего не произошло");
    }

    private void rain(TraderAndWagon traderAndWagon, int num) {
        traderAndWagon.setSpeedOfMovement(traderAndWagon.getSpeedOfMovement() - 2);
        Random rnd = new Random();
        switch (rnd.nextInt(6)){
            case 1:
                ProductQuality.NORMAL.setNum(0);
            case 2:
                ProductQuality.SLIGHTLY_FLAWED.setNum(num);
                break;
            case 3:
                ProductQuality.HALF_OF_IS_SPOILED.setNum(num);
                break;
            case 4:
                ProductQuality.ALMOST_ALL_GONE.setNum(num);
                break;
            case 5:
                ProductQuality.RUINED_IN_THE_TRASH.setNum(num);
                break;
        }
    }

    private void theSmoothRoad(TraderAndWagon traderAndWagon){
        Random rnd = new Random();
        if (traderAndWagon.getSpeedOfMovement() == rnd.nextInt(6)){
            traderAndWagon.setSpeedOfMovement(+2);
        }
    }

    private void theWheelIsBroken(){
        System.out.println("День в пустую, стоим на месте");
    }

    private void river(){
        System.out.println("Потратил целый день, пока искал брод");
    }

    private void metALocal(TraderAndWagon traderAndWagon){
        Random rnd = new Random();
        traderAndWagon.setSpeedOfMovement(rnd.nextInt(2,5));
    }

    private void highwayBandits(TraderAndWagon traderAndWagon,ProductQuality quality){
        Random rnd = new Random();
        if (traderAndWagon.getMoney() == 0){
            ProductQuality[] productQualities = ProductQuality.values();
            for (int i = rnd.nextInt(5); i < ProductQuality.values().length; i++) {
                System.out.println("Разбойники забрали товар" + productQualities[i]);
            }
        }else {
            traderAndWagon.setMoney(-100);
            System.out.println("Торговец откупился деньгами");
        }
    }

    private void roadsideInn(){}
    private void productIsSpoiled(ProductQuality quality){
        Random rnd = new Random();
        int num = rnd.nextInt(6);
        switch (num){
            case 1:
                ProductQuality.NORMAL.setNum(0);
            case 2:
                ProductQuality.SLIGHTLY_FLAWED.setNum(0);
                break;
            case 3:
                ProductQuality.HALF_OF_IS_SPOILED.setNum(0);
                break;
            case 4:
                ProductQuality.ALMOST_ALL_GONE.setNum(0);
                break;
            case 5:
                ProductQuality.RUINED_IN_THE_TRASH.setNum(0);
                break;
        }
    }


}
