package level22.lesson09.task02;

/*
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
Требования:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        map.put("name1", "Ivanov");
        map.put("name2", "Ivanov");
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> map : params.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            if (value != null) {
                stringBuilder.append(key + " = '" + value + "' and ");
            }
        }
        return stringBuilder.delete(stringBuilder.length() - 4, stringBuilder.length()).toString();
    }
}
