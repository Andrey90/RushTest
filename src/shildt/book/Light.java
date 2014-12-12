package shildt.book;

/**
 * Created by SuperStar on 25.11.2014.
 */
class Light {
    public static void main(String args[]){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.println(distance);
    }
}
