package level20.lesson02.task03;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    static {
        properties.put("Param 4", "55");
        properties.put("Param 5", "enter");
    }

    public static Properties properties1 = new Properties();

    public static void main(String[] args) {
    }

    public static void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            OutputStream outputStream = new FileOutputStream(reader.readLine());
            reader.close();
            properties1.putAll(properties);
            properties1.store(outputStream, "Абра-кадабра");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void save(OutputStream outputStream) {
        PrintWriter writer = new PrintWriter(outputStream);
        try {
            if (!properties.isEmpty()) {
                properties1.putAll(properties);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        writer.close();
    }

    public static void load(InputStream inputStream) {
        try {
            BufferedReader readerInput = new BufferedReader(new InputStreamReader(inputStream));
            properties1.load(readerInput);
            properties.putAll((Map) properties1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
