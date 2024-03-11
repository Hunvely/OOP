import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateFormat.format(date));
    }
}
