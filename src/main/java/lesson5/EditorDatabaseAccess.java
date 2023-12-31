package lesson5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Data Access Layer
 */
public class EditorDatabaseAccess implements DatabaseAccess{

    private final Database editorDataBase;

    public EditorDatabaseAccess(Database editorDataBase) {
        this.editorDataBase = editorDataBase;
    }

    /**
     * Добавить сущность в проект
     * @param entity
     */
    @Override
    public void addEntity(Entity entity) {
        editorDataBase.getAll().add(entity);
    }

    /**
     * Удалить сущность из проекта
     * @param entity
     */
    @Override
    public void removeEntity(Entity entity) {
        editorDataBase.getAll().remove(entity);
    }

    /**
     * Получить список всех текстур
     * @return
     */
    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> models = new ArrayList<>();
        for (Entity entity: editorDataBase.getAll()){
            if(entity instanceof Texture){
                models.add((Texture)entity);
            }
        }
        return models;
    }

    /**
     * Получить список всех моделей
     * @return
     */
    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity: editorDataBase.getAll()){
            if (entity instanceof Model3D){
                models.add((Model3D)entity);
            }
        }
        return models;
    }
}
