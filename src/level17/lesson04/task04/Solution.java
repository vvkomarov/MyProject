package level17.lesson04.task04;

/* Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
*/

public class Solution {
    public static class OurPresident {
        private static OurPresident president;

        private OurPresident() {
        }

        static {
            synchronized (OurPresident.class) {
                president = new OurPresident();
            }
        }

        public static OurPresident getOurPresident() {
            return president;
        }
    }

    public static void main(String[] args) {

    }
}
