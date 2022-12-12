import java.time.LocalDate;


public class PasspoR {
    String fio;
    int number;
    LocalDate birthDate;

    public PasspoR(String fio, int number, LocalDate birthDate) {
        this.fio = fio;
        this.birthDate = birthDate;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PasspoR{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", birthDate=" + birthDate +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumber() {
        return number;
    }


}

