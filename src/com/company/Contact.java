package com.company;

public class Contact {
    private String Name;
    private String Phone;

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}

