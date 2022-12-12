import java.util.Collection;
import java.util.List;

public class Tw {
    private void process(Collection<Integer> firstCollection, List<Integer> list) {
        if (firstCollection.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
    }
   /* В качестве первого параметра метод может принять любую коллекцию (ArrayList, LinkedList, ArrayDeque, HashSet, TreeSet и т. д.)
    Какой из этих коллекций понадобится меньше времени на выполнение данного метода при большом наборе данных? Почему?
    ArrayList.
            LinkedList.
            HashSet.
            Напишите, какую коллекцию стоит использовать, и объясните, почему именно ее. В качестве выполненного задания на платформу код присылать не нужно, только текстовое объяснение вашего решения.
}
*/
}