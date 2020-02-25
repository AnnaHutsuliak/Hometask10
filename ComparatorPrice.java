package come.epam.hometask;
import java.util.Comparator;

      public class ComparatorPrice implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Book price1 = (Book) o1;
            Book price2 = (Book) o2;
            if (price1.getPrice() > price2.getPrice()) {
                return -1;
            } else if (price1.getPrice() < price2.getPrice()) {
                return 1;
            } else return 0;
    }
}
