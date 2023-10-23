package lesson4.task1;

import java.util.ArrayList;

/**
 * Завод по производству деталей
 */

public class FactoreProvider implements Factory{

    private ArrayList<ComponentInfo> components = new ArrayList<>();

    {
        for(int i = 0; i < 10; i++){
            components.add(new ComponentInfo(900000 + i, String.format("component description %d", 900000 + i)));
        }
        for(int i = 0; i < 5; i++){
            components.add(new ComponentInfo(1000 + i, String.format("component description %d", 900000 + i)));
        }

    }
    /**
     * Получить информацию о детали по идентификатору
     * @param id идентификатор детали
     * @return информация о детали
     * @throws RuntimeException Некоректный номер детали/Деталь не найдена/Деталь устарела
     */

    public ComponentInfo getComponentInfo(int id) throws RuntimeException{
//        Предусловие
        if (id < 0){
            throw new RuntimeException("Некоректный номер детали");
        }

        if (String.valueOf(id).length() < 6){
            throw new RuntimeException("Некоретный номер детали. Деталь существует но больше не производится");
        }
        // Выполнение подпрограммы
        ComponentInfo componentInfo = null;
        for(ComponentInfo component : components){
            if (component.getId() == id){
                componentInfo = component;
            }
        }
        //        Инвариант 1 ...
        validateComponent(componentInfo);
        // Выполнение подпрограммы
        double price = PriceProvider.getPrice(componentInfo.getId());
        componentInfo.setPrice(price);

        //        Инвариант 2 ...
        validateComponentPrice(componentInfo);

//        Постусловие
        if (componentInfo == null){
            throw new RuntimeException("Деталь не найдена");
        }
        return componentInfo;
    }
    private void validateComponent(ComponentInfo componentInfo){
        if (componentInfo == null){
            throw new RuntimeException("Деталь не найдена");
        }
    }

    private void validateComponentPrice(ComponentInfo componentInfo){
        if (componentInfo.getPrice() <= 0){
            throw new RuntimeException("Стоимость детали указана некоректно");
        }
    }
}
