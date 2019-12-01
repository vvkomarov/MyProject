package level21.lesson02.task02;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static java.lang.Integer.toUnsignedString;

/*
Сравниваем модификаторы
Реализовать логику метода isAllModifiersContainSpecificModifier, который проверяет, содержит ли переданный параметр
allModifiers значение конкретного модификатора specificModifier.
P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.
Требования:
1. Метод isAllModifiersContainSpecificModifier должен быть статическим.
2. Метод isAllModifiersContainSpecificModifier должен возвращать значение типа boolean.
3. Метод isAllModifiersContainSpecificModifier должен принимать два параметра типа int.
4. Метод isAllModifiersContainSpecificModifier должен возвращать корректное значение в соответствии с условием
задачи(true, если заданный модификатор присутствует в allModifiers, иначе false).

В общем, как я понял, модификаторы устанавливаются числом int (как и права доступа к файлам).
В двоичном представлении это будет выглядеть, как нужная единичка на своём месте, типа такого:
01000000 - у единичного модификатора и
11100001 - у списка всех модификаторов класса-метода.
То есть надо логическим AND (&) сравнить все модификаторы класса-метода и конкретный модификатор.
int mod = allModifiers & specificModifier;

на выходе получим цифру модификатора, если такой модификатор есть в списке всех и ноль, если нет.
В нужном месте (где у обоих двоичных представлений стоит 1 - 01000000 и 11100001)логическое & вернет единичку, это значит, что модификатор присутствует.
Дальше уже дело техники проверить на то, ноль у нас или больше нуля:
return (mod > 0);

Но, я ввел ещё доп. проверку на всякий случай:
switch (mod) {
            case Modifier.PRIVATE:  return true;
            case Modifier.PUBLIC:  return true;
            case Modifier.STATIC: return true;
        }

Все модификаторы я перечислять не стал, оставил только эти три - Валька и так съел.
*/

public class Solution {
    public static void main(String[] args) {
        int modifiersOfThisClass = Solution.class.getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.PRIVATE));     //false
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.FINAL));       //false
    }

    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {
        System.out.println(Modifier.toString(allModifiers) + " -> " + Modifier.toString(specificModifier));
        return (allModifiers & specificModifier) != 0;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
