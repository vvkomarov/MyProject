public class Solution {
    /*
<<<<<<< HEAD
    Немного массивов
=======
    some test
>>>>>>> Initial commit
     */

    public static final class Account {
        private String name;
        private float money;

        public float getMoney() {
            return money;
        }

        public String getName() {
            return name;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        Account [] acc = new Account[5];
=======
        Account [] acc = new Account[6];
>>>>>>> Initial commit
        acc[0] = new Account();
        acc[0].setName("Василий");
        acc[0].setMoney(10000f);

        acc[1] = new Account();
        acc[1].setName("Не Василий");
        acc[1].setMoney(100f);

        acc[2] = new Account();
        acc[2].setName("Иван");
        acc[2].setMoney(15000f);

        acc[3] = new Account();
        acc[3].setName("не Иван");
        acc[3].setMoney(10f);

        acc[4] = new Account();
        acc[4].setName("Антон");
        acc[4].setMoney(15f);

<<<<<<< HEAD
=======
        acc[5] = new Account();
        acc[5].setName("Vladimir");
        acc[5].setMoney(20000f);

>>>>>>> Initial commit
        for (int z = 0; z < acc.length;z++) {
            float currentmoney = acc[z].getMoney();
            currentmoney = currentmoney + currentmoney*0.1f;
            acc[z].setMoney(currentmoney);
        }

        for (int z = 0; z < acc.length;z++) {
            System.out.println("Name: "+ acc[z].getName()+ " Money: " + acc[z].getMoney());
        }
    }
}