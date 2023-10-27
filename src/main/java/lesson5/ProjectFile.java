package lesson5;

public class ProjectFile {
    private String filename;
    private int setting1;
    private String setting2;
    private boolean setting3;

    public int getSetting1() {
        return setting1;
    }

    public String getSetting2() {
        return setting2;
    }

    public boolean getSetting3() {
        return setting3;
    }

    public String getFilename() {
        return filename;
    }

    public ProjectFile(String filename) {
        this.filename = filename;
//        Загрузка настроек проекта, получаем объектное представление
        this.setting1 = 1;
        this.setting2 = "..";
        this.setting3 = false;
    }
}
