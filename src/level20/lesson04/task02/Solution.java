package level20.lesson04.task02;

/* Как сериализовать JavaRush?
Сделайте так, чтобы сериализация класса JavaRush была возможной
*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }
}
