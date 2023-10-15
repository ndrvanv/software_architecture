package lesson2.singletoneMethod;

// Singleton
//Одиночка — это порождающий паттерн проектирования. Он гарантирует, что у
//класса есть только один экземпляр, и предоставляет к нему глобальную точку
//доступа
public class Program {
    public static void main(String[] args) {
        Logging.getLogging().addLogInfo("1 word");
        Logging.getLogging().addLogInfo("2 words");
        Logging.getLogging().addLogInfo("3 words");
        Logging.getLogging().addLogInfo("4 words");
        Logging.getLogging().addLogInfo("5 words");

        Logging.getLogging().showLogFile();
    }
}
