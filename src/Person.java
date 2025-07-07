/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oleksandr
 */
class Person {
    String name, surname, address;
    char gender;

    public Person() {
    }

    public Person(String name, String surname, String address, char gender) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.gender = gender;
    }
    String getData()
    {
        return name+""+surname+", sex: "+(gender=='f'||gender=='F'?"female":"male")+", address: "+address;
    }
}
