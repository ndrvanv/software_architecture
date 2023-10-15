package lesson2.factoryMethod;

import lesson2.templateMethod.LogReader;
import lesson2.templateMethod.PoemReader;

public class SpeceficReaderCreator extends BaseLogReaderCreator{
    @Override
    protected LogReader createLogReaderInstance(LogType logType) {
        return switch (logType){
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case DataBase -> new DataBaseReader();
            case System -> new OperationSystemLogEventReader();
        };
    }
}
