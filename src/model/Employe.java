package model;

import java.util.List;

public class Employe {
    private String code;
    private String nom;
    private String grade;
    private String situation;
    private List<String> souhaits;

    public Employe() {
    }

    public Employe(String code, String nom, String grade, String situation, List<String> souhaits) {
        this.code = code;
        this.nom = nom;
        this.grade = grade;
        this.situation = situation;
        this.souhaits = souhaits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public List<String> getSouhaits() {
        return souhaits;
    }

    public void setSouhaits(List<String> souhaits) {
        this.souhaits = souhaits;
    }
    
    
}
