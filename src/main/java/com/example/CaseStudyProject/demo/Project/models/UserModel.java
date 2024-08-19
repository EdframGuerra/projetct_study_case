package com.example.CaseStudyProject.demo.Project.models;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "TB_User")


public class UserModel implements Serializable {
    private  static  final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column(name = "nome", nullable = false, length = 50)
    private  String name;

    @Column(name = "sobrenome", nullable = false, length = 50)
    private String surname;

    @Column(name = "idade", nullable = false)
    private  int idade;

    public UserModel() {}

    public UserModel(String name, String surname, int idade) {
        this.name = name;
        this.surname = surname;
        this.idade = idade;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idade=" + idade +
                '}';
    }
}
