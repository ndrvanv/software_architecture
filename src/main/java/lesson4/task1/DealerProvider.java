package lesson4.task1;

/**
 * Дилер
 */

public class DealerProvider{

    private Factory factoreProvider;

    public DealerProvider(Factory factoreProvider){
        this.factoreProvider = factoreProvider;
    }
    public ComponentInfo getComponent(int id) throws Exception {
//        if (id < 0 || String.valueOf(id).length() < 6)
//            throw new RuntimeException("Некорректный номер детали");

       try {
           return factoreProvider.getComponentInfo(id);
       }
       catch (RuntimeException e){
           throw new Exception("Ошибка при попытке получить информацию о детали", e.fillInStackTrace());
       }

    }

}
