package come.epam.hometask;

public class Validator {
    private final static int MAX_NUMBER_PERCENT = 100;
    private final static int MIN_NUMBER_PERCENT = 1;
    private final static int MAX_YEAR_OF_CHOSEN_BOOK = 2020;
    private final static int MIN_YEAR_OF_CHOSEN_BOOK = 2010;

    public static  void checkNumberPercent(int percent_user_enter) throws Exception {
        if (percent_user_enter < MIN_NUMBER_PERCENT || percent_user_enter > MAX_NUMBER_PERCENT) {
            throw new Exception (String.valueOf(0));
        }
    }

    public static  void checkYearOfChosenBook(int year_user_enter) throws Exception {
        if (year_user_enter < MIN_YEAR_OF_CHOSEN_BOOK || year_user_enter > MAX_YEAR_OF_CHOSEN_BOOK) {
            throw new Exception (String.valueOf(1));
        }
    }
}