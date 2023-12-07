package Java_basics.练习.petSupermarket;

public class Tortoise extends Pet{  //乌龟的子类
    private int number;
    private int moeney;
    private String type;
    @Override
    public void calcPrice() {
        if(type.equals("猪鼻龟")){
            moeney=number*50;
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
