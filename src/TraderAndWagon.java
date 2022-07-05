import java.util.Random;

public class TraderAndWagon {

    private int maxLoadCapacity;
    private int speedOfMovement;
    private int money;


    public TraderAndWagon(int maxLoadCapacity, int speedOfMovement, int money) {
        this.maxLoadCapacity = maxLoadCapacity;
        this.speedOfMovement = speedOfMovement;
        this.money = money;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
