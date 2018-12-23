package level17.lesson04.task02;

/* Синхронизированные заметки 2
Класс Note будет использоваться нитями. Поэтому сделай так, чтобы ве методы были синхронизированы
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = null;
            notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
