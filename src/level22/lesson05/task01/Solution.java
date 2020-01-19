package level22.lesson05.task01;

/*
Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример:
«JavaRush — лучший сервис обучения Java.»
Результат:
«— лучший сервис обучения»
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Требования:
1. Класс TooShortStringException должен быть потомком класса RuntimeException.
2. Метод getPartOfString должен принимать строку в качестве параметра.
3. В случае, если строка, переданная в метод getPartOfString содержит менее 4 пробелов должно возникнуть исключение
TooShortStringException.
4. Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
*/
public class Solution {

    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(final String s) {
        if (s.isEmpty()) {
            throw new TooShortStringException();
        } else {
            int k = s.indexOf(" ");
            return s.substring(k + 1, s.length());
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }

}
