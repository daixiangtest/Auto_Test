package Java_basics.练习;

import java.util.Scanner;

public class Test0010 {
    public static void main(String[] args) {
        System.out.println("*****************欢迎来到PET超市*****************");
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer();
        Pet[] pets = new Pet[100]; // 购物车
        int i = 0;

        System.out.print("请输入您的姓名：");
        customer.setName(input.next());
        System.out.print("请输入您的联系电话：");
        customer.setPhone(input.next());

        while (true) {
            System.out.println("--------------------------------------");
            System.out.print("请选择要购买的宠物（1.金鱼  2.乌龟  0.退出）：");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("请选择种类（1.GOLDFISH_A 2.GOLDFISH_B）：");
                int n = input.nextInt();
                int nums;
                switch (n) {
                    case 1:
                        GoldFish f = new GoldFish("红龙眼金鱼", PetConstant.GOLDFISH_A);
                        System.out.print("请输入购买数量：");
                        nums = input.nextInt();
                        f.setNums(nums);
                        pets[i++] = f;
                        break;
                    case 2:
                        GoldFish f2 = new GoldFish("紫龙睛金鱼",PetConstant.GOLDFISH_B);
                        System.out.print("请输入购买数量：");
                        nums = input.nextInt();
                        f2.setNums(nums);
                        pets[i++] = f2;
                        break;
                    default:
                        System.out.println("种类输入有误");
                }
            } else if (choice == 2) {
                System.out.print("请选择（1.猪鼻龟  2.金钱龟）：");
                int n = input.nextInt();
                int nums;
                switch (n) {
                    case 1:
                        Tortoise t = new Tortoise("猪鼻龟", PetConstant.TORTOISE_BIG);
                        System.out.print("请输入购买数量：");
                        nums = input.nextInt();
                        t.setNums(nums);
                        pets[i++] = t;
                        break;
                    case 2:
                        Tortoise t2 = new Tortoise("金钱龟",PetConstant.TORTOISE_SMALL);
                        System.out.print("请输入购买数量：");
                        nums = input.nextInt();
                        t2.setNums(nums);
                        pets[i++] = t2;
                        break;
                    default:
                        System.out.println("选择输入有误");
                }

            } else if (choice == 0) {
                break;
            } else {
                System.out.println("输入有误！");
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("客户【" + customer.getName() + "】，您选择的宠物如下：");
        System.out.println("宠物名\t数量\t宠物总价");
        System.out.println("-----------------------------");
        int totalPrices = 0;
        for (int j = 0; j < i; j++) {
            totalPrices += pets[j].calcPrice();
            System.out.print(pets[j].getName() + "\t\t");
            if (pets[j] instanceof GoldFish){
                GoldFish g = (GoldFish) pets[j];
                System.out.print(g.getNums() + "\t\t");
                System.out.print(g.calcPrice());
            }
            if (pets[j] instanceof Tortoise){
                Tortoise t = (Tortoise) pets[j];
                System.out.print(t.getNums() + "\t\t");
                System.out.print(t.calcPrice());
            }

            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println("总价为：" + totalPrices + "元！");
        System.out.println("*******************谢谢惠顾*******************");
    }
}

class PetConstant {
    public static final String TORTOISE_SMALL = "TORTOISE_SMALL";
    public static final String TORTOISE_BIG = "TORTOISE_BIG";
    public static final String GOLDFISH_A = "GOLDFISH_A";
    public static final String GOLDFISH_B = "GOLDFISH_B";
}
abstract class Pet {
    private String name;

    public Pet() {
        super();
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 计算总价，抽象方法
    public abstract int calcPrice();

}

class GoldFish extends Pet{
    private String breed;
    private int nums;


    public GoldFish(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    @Override
    public int calcPrice() {
        int totalPrice = 0;
        if (PetConstant.GOLDFISH_A.equals(breed)){
            totalPrice = 10*nums;
        }else if (PetConstant.GOLDFISH_B.equals(breed)){
            totalPrice = 20*nums;
        }
        return totalPrice;
    }
}

class Tortoise extends Pet{
    private String size;
    private int nums;

    public Tortoise(String name, String size) {
        super(name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    @Override
    public int calcPrice() {
        int totalPrice = 0;
        if (PetConstant.TORTOISE_BIG.equals(size)){
            totalPrice = 50*nums;
        }else if (PetConstant.TORTOISE_SMALL.equals(size)){
            totalPrice = 30*nums;
        }
        return totalPrice;
    }
}

class Customer {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
