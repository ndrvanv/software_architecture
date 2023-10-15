package lesson2.factoryMethod;

import lesson2.templateMethod.LogEntry;
import lesson2.templateMethod.LogReader;

public class Program {
    public static String data = """
                Я помню чудное мгновенье:
                Передо мной явилась ты,
                Как мимолетное виденье,
                Как гений чистой красоты.
                В томленьях грусти безнадежной,
                В тревогах шумной суеты,
                Звучал мне долго голос нежный
                И снились милые черты.""";
    public static void main(String[] args) {
        LogReader logReader = new SpeceficReaderCreator().createLogReader(LogType.Poem, data);
        for (LogEntry log: logReader.readLogEntry()){
            System.out.println(log.getText());
        }
    }
}
