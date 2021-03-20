package devid.com;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    SchoolBoy boy = new SchoolBoy();
    boy.setCityOfLive("Chernovtsy");
    boy.setClas("4");
    boy.setScores("2-12");
    boy.setDateOfBirthMother(LocalDate.of(1986,6,26));
    boy.setDateOfBirthMother(LocalDate.of(1979,8,23));
    boy.setNameFather("Bogdan");
    boy.setNameMother("Olja");
    boy.setNameTeacher("Svitlana");
    boy.setPhoneNumberFather("+380500560182");
    boy.setPhoneNumberMother("+380502214192");
    System.out.println(boy);
    }
}
