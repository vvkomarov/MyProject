package level18.lesson10.home08;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                reader.close();
                break;
            } else {
                ReadThread readThread = new ReadThread(s);
                readThread.run();
                readThread.join();
            }
        }
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                HashMap<Integer, Integer> hashMap = new HashMap<>();
                while (fileInputStream.available() > 0) {
                    int k = fileInputStream.read();
                    if (hashMap.containsKey(k)) {
                        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                            if (entry.getKey().equals(k)) {
                                entry.setValue(entry.getValue() + 1);
                            }
                        }
                    } else {
                        hashMap.put(k, 1);
                    }
                }
                int max = 0;
                for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue() > max) {
                        max = entry.getValue();
                    }
                }
                for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue().equals(max)) {
                        if (resultMap.containsKey(entry.getKey().toString())) {
                            resultMap.put(entry.getKey().toString(), resultMap.get(entry.getKey().toString()) + entry.getValue());
                        } else {
                            resultMap.put(entry.getKey().toString(), entry.getValue());
                        }
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
