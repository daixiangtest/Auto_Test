package Java_basics.练习.petSupermarket;

public class GoldFish extends Pet{
    private String type;
    private int number;
    private int moeney;
    @Override
    public void calcPrice() {
        if(type.equals("红龙眼金鱼")){
            moeney=number*10;
        }else {
            moeney=number*30;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoeney() {
        return moeney;
     }

    public int getNumber() {
        return number;
    }

}
