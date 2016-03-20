package shildt.book.exampleOther;


/**
 * Created by SuperStar on 01.12.2014.
 */
class SwitchEx {
    public static void main(String args[]) {
        String season;
        for (int i = 1; i <= 13; i++) {
            switch (i) {
                case 12:
                case 1:
                case 2:
                    season = "zima";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "vesna";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "leto";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "osen";
                    break;
                default:
                    season = "error";
            }
            System.out.println(season);
        }


    }
}
