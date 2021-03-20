package devid.com;

import java.time.LocalDate;
import java.util.Objects;

/*
@USER: Java02
@DATE: 20.03.2021
@NAME: Student
*/
public class SchoolBoy {
    private String clas;
    private String nameTeacher;
    private String scores;
    private String nameMother;
    private String nameFather;
    private LocalDate dateOfBirthMother;
    private LocalDate dateOfBirthfather;
    private String phoneNumberMother;
    private String phoneNumberFather;
    private String cityOfLive;

    public SchoolBoy() {
    }

    public SchoolBoy(String clas, String nameTeacher, String scores, String nameMother, String nameFather, LocalDate dateOfBirthMother, LocalDate dateOfBirthfather, String phoneNumberMother, String phoneNumberFather, String cityOfLive) {
        this.clas = clas;
        this.nameTeacher = nameTeacher;
        this.scores = scores;
        this.nameMother = nameMother;
        this.nameFather = nameFather;
        this.dateOfBirthMother = dateOfBirthMother;
        this.dateOfBirthfather = dateOfBirthfather;
        this.phoneNumberMother = phoneNumberMother;
        this.phoneNumberFather = phoneNumberFather;
        this.cityOfLive = cityOfLive;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public LocalDate getDateOfBirthMother() {
        return dateOfBirthMother;
    }

    public void setDateOfBirthMother(LocalDate dateOfBirthMother) {
        this.dateOfBirthMother = dateOfBirthMother;
    }

    public LocalDate getDateOfBirthfather() {
        return dateOfBirthfather;
    }

    public void setDateOfBirthfather(LocalDate dateOfBirthfather) {
        this.dateOfBirthfather = dateOfBirthfather;
    }

    public String getPhoneNumberMother() {
        return phoneNumberMother;
    }

    public void setPhoneNumberMother(String phoneNumberMother) {
        this.phoneNumberMother = phoneNumberMother;
    }

    public String getPhoneNumberFather() {
        return phoneNumberFather;
    }

    public void setPhoneNumberFather(String phoneNumberFather) {
        this.phoneNumberFather = phoneNumberFather;
    }

    public String getCityOfLive() {
        return cityOfLive;
    }

    public void setCityOfLive(String cityOfLive) {
        this.cityOfLive = cityOfLive;
    }

    @Override
    public String toString() {
        return "SchoolBoy{" +
                "clas='" + clas + '\'' +
                ", nameTeacher='" + nameTeacher + '\'' +
                ", scores='" + scores + '\'' +
                ", nameMother='" + nameMother + '\'' +
                ", nameFather='" + nameFather + '\'' +
                ", dateOfBirthMother=" + dateOfBirthMother +
                ", dateOfBirthfather=" + dateOfBirthfather +
                ", phoneNumberMother='" + phoneNumberMother + '\'' +
                ", phoneNumberFather='" + phoneNumberFather + '\'' +
                ", cityOfLive='" + cityOfLive + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolBoy schoolBoy = (SchoolBoy) o;
        return Objects.equals(clas, schoolBoy.clas) && Objects.equals(nameTeacher, schoolBoy.nameTeacher) && Objects.equals(scores, schoolBoy.scores) && Objects.equals(nameMother, schoolBoy.nameMother) && Objects.equals(nameFather, schoolBoy.nameFather) && Objects.equals(dateOfBirthMother, schoolBoy.dateOfBirthMother) && Objects.equals(dateOfBirthfather, schoolBoy.dateOfBirthfather) && Objects.equals(phoneNumberMother, schoolBoy.phoneNumberMother) && Objects.equals(phoneNumberFather, schoolBoy.phoneNumberFather) && Objects.equals(cityOfLive, schoolBoy.cityOfLive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clas, nameTeacher, scores, nameMother, nameFather, dateOfBirthMother, dateOfBirthfather, phoneNumberMother, phoneNumberFather, cityOfLive);
    }
}
