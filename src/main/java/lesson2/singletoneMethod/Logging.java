package lesson2.singletoneMethod;

public class Logging {
    private static Logging logging;
    private static String loggerFile = "Here's logging file: \n\n";

    public static synchronized Logging getLogging(){
        if(logging == null){
            logging = new Logging();
        }
        return logging;
    }

    private Logging(){

    }

    public void addLogInfo(String logInfo){
        loggerFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(loggerFile);
    }
}
