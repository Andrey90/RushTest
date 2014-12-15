package shildt.book;

/**
 * Created by SuperStar on 01.12.2014.
 */
class IfElse {
    public static void main(String args[]) {
        int month = 12;
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "zima";
        } else if (month == 3 || month == 4 || month == 5)
            season = "vesna";

        else if (month == 6 || month == 7 || month == 8)
            season = "leto";

        else if (month == 9 || month == 10 || month == 11)
            season = "osen";
        else
            season = "notMonth";
        System.out.println(season);
    }
}
