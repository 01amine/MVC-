package model;

public class Diplome {
    private String grade ;
    private String specialite;
    public Diplome(){}
    public Diplome(String grade,String specialite){
        this.grade = grade;
        this.specialite = specialite;
    }
    String getGrade(){
        return this.grade;
    }
    String getSpecialite(){
        return this.specialite;
    }
    void setGrade(String Grade){
        this.grade = grade;
    }
    void setSpecialite(String specialite){
        this.specialite = specialite;
    }
}
