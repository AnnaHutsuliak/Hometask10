package come.epam.hometask;


import java.util.Comparator;

public class ComparatorPublishingHouse implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String publishing_House1 = ((Book) o1).getPublishing_house();
        String publishing_House2 = ((Book) o2).getPublishing_house();
        return publishing_House1.compareTo(publishing_House2);
    }
}
