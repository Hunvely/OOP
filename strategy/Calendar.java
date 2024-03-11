package strategy;

import java.util.Scanner;

enum Week {
    SUNDAY {
        @Override
        public String apply(Week msg) {
            return "일요일";
        }
    }, MONDAY {
        @Override
        public String apply(Week msg) {
            return "월요일";
        }
    }, TUESDAY {
        @Override
        public String apply(Week msg) {
            return "화요일";
        }
    }, WEDNESDAY {
        @Override
        public String apply(Week msg) {
            return "수요일";
        }
    }, THURSDAY {
        @Override
        public String apply(Week msg) {
            return "목요일";
        }
    }, FRIDAY {
        @Override
        public String apply(Week msg) {
            return "금요일";
        }
    }, SATURDAY {
        @Override
        public String apply(Week msg) {
            return "토요일";
        }
    };

    public abstract String apply(Week msg);
}

public class Calendar {

    public static String dayday(Week msg) {

        return msg.apply(msg);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("요일을 입력하세요 : ");
        System.out.println(dayday(Week.valueOf(input.next())));
    }
}
