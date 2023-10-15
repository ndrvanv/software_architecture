package lesson2.factoryMethod;

import lesson2.templateMethod.LogReader;

public abstract class BaseLogReaderCreator {

    public LogReader createLogReader(LogType logType, Object data){
        LogReader logReader = createLogReaderInstance(logType);
//        TODO: Выполнение подготовительных действий над объектом
        logReader.setDataSource(data);

        return logReader;
    }
    /**
     * Фабричный метод
     * @param logType тип log-reader
     * @return конкретный объект лог-ридера
     */
    protected abstract LogReader createLogReaderInstance(LogType logType);
}
