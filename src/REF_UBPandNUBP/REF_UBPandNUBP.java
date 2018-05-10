package REF_UBPandNUBP;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;


public class REF_UBPandNUBP {
    public static void main(String[] args) throws IOException {
        File source = new File("C:/Users/vkomarov/Downloads/1.xml");
        String sourcetwo = "C:/Users/vkomarov/Downloads/2.xml";
        int Count = 0;

        for (int j = 1130; j < 1131; j++) {
            String destinationFileName = "C:/Users/vkomarov/Downloads/Пакет/REF_UBPandNUBP_inc_20180510112846_11" + j + ".xml";
            File dest = new File(destinationFileName);
            copyFileUsingJava7Files(source, dest);
            String a = "\n" + "<RecordNum>500000000320G" + j + "000</RecordNum>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(a), StandardOpenOption.APPEND);
            String b = "<ControlNum>0</ControlNum>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(b), StandardOpenOption.APPEND);
            String c = "<RegistryCode>G" + j + "</RegistryCode>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(c), StandardOpenOption.APPEND);
            String d = "<OrgCode>502G" + j + "</OrgCode>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(d), StandardOpenOption.APPEND);
            String e = "<OrgOGRN>112510083" + j + "</OrgOGRN>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(e), StandardOpenOption.APPEND);
            String f = "<OrgFullName>TO(Download)" + j + "</OrgFullName>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(f), StandardOpenOption.APPEND);
            String g = "<OrgINN>809010" + j + "</OrgINN>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(g), StandardOpenOption.APPEND);
            String h = "<OrgKPP>81900" + j + "</OrgKPP>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(h), StandardOpenOption.APPEND);
            writeFileUsingJava7Files(sourcetwo, destinationFileName);
            Count++;
            System.out.println("Сгенерировано " + Count + " файлов.");
        }
    }


    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        try {
            Files.copy(source.toPath(), dest.toPath());
        } catch (FileAlreadyExistsException e) {
            System.out.println("Файл " + dest.getCanonicalPath() + " перезаписан.");
            Files.delete(dest.toPath());
            Files.copy(source.toPath(), dest.toPath());
        }
    }

    private static void writeFileUsingJava7Files(String source, String dest) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(source), "UTF-8"));
        String strLine;
        while ((strLine = reader.readLine()) != null) {
            strLine += "\n";
            Files.write(Paths.get(dest), strLine.getBytes("ISO-8859-5"), StandardOpenOption.APPEND);
        }
    }
}