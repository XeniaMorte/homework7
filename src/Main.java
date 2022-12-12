import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static void main(String[] args) throws ParseException {
        Set<TeacherTask> teacherTasks = new HashSet<>();
        while (teacherTasks.size() <= 15) {
            TeacherTask teacherTask = new TeacherTask(getRandomNumberUsingNextInt(2, 9), (getRandomNumberUsingNextInt(2, 9)));
            teacherTasks.add(teacherTask);
        }


        System.out.println(teacherTasks);
        var table = new Table();

        PasspoR qa = new PasspoR("dfghjuikol", 123, LocalDate.parse("2002-05-05"));
        PasspoR qw = new PasspoR("dfghjuikol", 1223, LocalDate.parse("2002-05-05"));
        PasspoR qe = new PasspoR("hjuikol", 1123, LocalDate.parse("2002-01-05"));
        PasspoR qr = new PasspoR("kol", 1423, LocalDate.parse("2002-05-07"));
        PasspoR qt = new PasspoR("d3dkol", 1234, LocalDate.parse("2002-05-01"));

        table.addPerson(qa);
        table.addPerson(qw);
        table.addPerson(qe);
        table.addPerson(qr);
        table.addPerson(qt);

        System.out.println(table.searchByNumber(1123));
    }

}


