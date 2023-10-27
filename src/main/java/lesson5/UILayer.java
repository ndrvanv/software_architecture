package lesson5;

public interface UILayer {
    void openProject(String filename);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);
}
