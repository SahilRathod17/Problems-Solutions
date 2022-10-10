import java.util.*;

public class cal {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        //output : gregory
        System.out.println(c.getTimeZone().getID());
        Calendar d = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(d.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

    }
}
