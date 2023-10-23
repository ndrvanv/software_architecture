package lesson4.task1;

public interface Factory {

    /**
     * Получить информацию о детали по идентификатору
     * @param id идентификатор детали
     * @return информация о детали
     * @throws RuntimeException Некоректный номер детали/Деталь не найдена/Деталь устарела
     */

    ComponentInfo getComponentInfo(int id);

}
