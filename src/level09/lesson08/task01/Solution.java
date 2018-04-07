package level09.lesson08.task01;

/*
/* Исключения

Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:

NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать

ArithmeticException и URISyntaxException. Как это сделать?

*/

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution {

    public static void main(String[] args) throws Exception {

        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException

    {

        int i = (int) (Math.random() * 4);

        if (i == 0)

            throw new NullPointerException();

        if (i == 1)

            throw new ArithmeticException();

        if (i == 2)

            throw new FileNotFoundException();

        if (i == 3)

            throw new URISyntaxException("", "");

    }

}
