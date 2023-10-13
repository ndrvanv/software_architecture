package org.gb.lesson1.store.modeleElements;

import java.util.Date;

public class Buyer {

//    region Инициализация и конструкторы

    {
        id = ++ counter;
    }
//    endregion Инициализация и конструкторы

//    region Свойства
    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    endregion

//    region Поле
private static int counter = 0;
    private int id;
    private String gender;
    private String name;
    private String lastname;
    private String patronymic;
    private Date birthday;

//    endregion Поле


}
