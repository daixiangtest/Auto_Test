package Java_basics.练习;

import java.util.Arrays;

/**
 * 定义一个Card的扑克牌类的创建和洗牌
 * 该类有两个private访问权限的字符串变量face和suit：
 * 分别描述一张牌的牌面值（如：A、K、Q、J、10、9、…、3、2等）和花色（如：“黑桃”、“红桃”、“梅花”和“方块”）。
 * 定义Card类中的public访问权限的构造方法，为类中的变量赋值；
 * 定义protected访问权限的方法getFace()，得到扑克牌的牌面值;
 * 定义protected访问权限的方法getSuit()，得到扑克牌的花色;
 * 定义方法toString()，返回表示扑克牌的花色和牌面值字符串（如“红桃A”、“梅花10”等）。
 * （1）使用Card类的构造方法给deck数组的52张牌赋值，请写出实现上述功能的程序段。
 * （2）请编写模拟洗牌的程序段，即把数组deck中的扑克牌随机打乱存放顺序。
 */
public class JavaCard {
    private String face; //牌面值
    private String suit; //花色

    public JavaCard() {
    }

    public JavaCard(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return suit + face;
    }
}

class Test001 {
    public static void main(String[] args) {
        //（1）使用Card类的构造方法给deck数组的52张牌赋值，请写出实现上述功能的程序段。
        String[] suit = {"红桃", "黑桃", "红方", "梅花"};
        String[] face = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        JavaCard[] cards = new JavaCard[52];
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < face.length; j++) {
                cards[i * 13 + j] = new JavaCard(face[j], suit[i]);
            }
        }
        System.out.println("==========洗牌前===========");
        System.out.println(Arrays.toString(cards));
        //（2）请编写模拟洗牌的程序段，即把数组cards中的扑克牌随机打乱存放顺序。

        for (int i=0;i<cards.length;i++){
            int mun= (int) (Math.random()*cards.length);
            JavaCard a=cards[i];
            cards[i]=cards[mun];
            cards[mun]=a;
        }
        System.out.println("==========洗牌后===========");
        System.out.println(Arrays.toString(cards));
    }
}
