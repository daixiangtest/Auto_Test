package Java_basics.day07;

/**
 * Java（封装、继承、多态）创建三个类，组成一个继承树，表示游戏中的角色
 *
 *游戏角色题目
 * 父类：Role（角色），是所有职业的父类
 * 1）属性：name，表示角色的名字
 * 2）方法：public int attack()，该方法返回值为角色的攻击对敌人的伤害
 *
 * Role的第一个子类：Magicer（法师）
 * 1）属性：魔法等级（范围为1~10）
 * 2）方法：public int attack()，该方法返回法师的攻击对敌人造成的伤害值
 *       法师攻击伤害值为：魔法等级*魔法基本伤害值（固定为5）
 *
 * Role的第二个子类：Soldier（战士）
 * 1）属性：攻击伤害值
 * 2）方法：public int attack()，该方法返回战士对敌人造成的伤害值
 *       战士的攻击伤害值为：其攻击伤害属性值
 * 再设计一个Team类，表示一个组队。
 * 1）addMember，表示组队增加一个成员
 *       注意：组队成员最多为6人
 *       提示：应当利用一个数组属性，保存所有成员
 * 2）attackSum，表示组队所有成员进行攻击时，对敌人造成的总伤害
 */

public class TestGame {
    public static void main(String[] args) {
        Magicer m = new Magicer();
        m.setName("基拉法师");
        m.setLevel(10);
        System.out.println(m.getName() + "攻击伤害为：" + m.attack());
        Soldier s = new Soldier();
        s.setName("狂战士");
        s.setHurt(100);
        System.out.println(s.getName() + "攻击伤害为：" + s.attack());
        Team t = new Team();
        t.addRoles(s);
        t.addRoles(m);
        System.out.println("所有组队成员的总伤害为：" + t.attackSum());
    }
}

//角色，所有职业的父类
//创建的父类
abstract class Role {
    private String name;//名字

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //返回角色的攻击对敌人的伤害
    //使用抽象方法方便子类重构
    public abstract int attack();
}

//成员组队
class Team {
    static int i = 0;//组队成员数
    static Role roles[] = new Role[6];
    public void addRoles(Role role) {
        roles[i++] = role;
    }

    public int attackSum() {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += roles[j].attack();
        }
        return sum;
    }
}

//法师
class Magicer extends Role {
    private int level;//范围1~10

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 1 && level <= 10) {
            this.level = level;
        } else {
            System.out.println("魔法等级已经到达上限！");
        }
    }

    public int attack() {
        return level * 5;
    }
}

//战士
class Soldier extends Role {
    private int hurt;//攻击伤害值

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public int attack() {
        return hurt;
    }
}
