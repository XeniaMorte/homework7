import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Table {
    public Table() {

    }

    public Set<PasspoR> base = new HashSet<>();

    public void addPerson(PasspoR passpoR) {
        if (passpoR.fio != null && !Objects.equals(passpoR.birthDate, LocalDate.now()) && passpoR.number != 0) {
            base.add(passpoR);
        }
    }


    public PasspoR searchByNumber(int number) {
        for (PasspoR pass : base) {
            if (pass.number == number) {
                return pass;
            }
        }
        return null;
    }
}
