package REF_UBPandNUBP;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;


public class REF_UBPandNUBP {
    public static void main(String[] args) throws IOException {
        String sourcetwo = "C:/Users/vkomarov/Downloads/2.xml";//Заголовок пакета
        File source = new File(sourcetwo);
        File sourceTwo = new File("C:/Users/vkomarov/Downloads/2.xml");//продолжение пакета

        for (int j = 1000; j < 1800; j++) {
            String destinationFileName = "C:/Users/vkomarov/Downloads/Пакет/REF_UBPandNUBP_inc_20180507112846_11" + j + ".xml";//Место сохранения файлов
            File dest = new File(destinationFileName);
            copyFileUsingJava7Files(source, dest);
            String a = "\n" + "<RecordNum>500000000320G" + j + "000</RecordNum>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(a), StandardOpenOption.APPEND);
            String c = "<ControlNum>0</ControlNum>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(c), StandardOpenOption.APPEND);
            String d = "<RegistryCode>G9911</RegistryCode>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(d), StandardOpenOption.APPEND);
            String f = "<OrgCode>502G" + j + "</OrgCode>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(f), StandardOpenOption.APPEND);
            String g = "<OrgOGRN>112510083" + j + "</OrgOGRN>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(g), StandardOpenOption.APPEND);
            String h = "<OrgFullName>TO(Download)" + j + "</OrgFullName>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(h), StandardOpenOption.APPEND);
            String p = "<OrgINN>809010" + j + "</OrgINN>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(p), StandardOpenOption.APPEND);
            String k = "<OrgKPP>81900" + j + "</OrgKPP>";
            Files.write(Paths.get(destinationFileName), Collections.singleton(k), StandardOpenOption.APPEND);
            writeFileUsingJava7Files(sourcetwo, destinationFileName);
        }
    }


    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    private static void writeFileUsingJava7Files(String source, String dest) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(source), "utf-8"));
        String strLine;
        while ((strLine = reader.readLine()) != null) {
            Files.write(Paths.get(dest), Collections.singleton(strLine), StandardOpenOption.APPEND);
        }
    }
}
