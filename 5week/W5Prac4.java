public class W5Prac4 {
    public static void main(String[] args) {
        int day = 2;
        String dayStr = "None";

        switch (day) {
            case 1: {
                dayStr = "Monday";
                break;
            }
            case 2: {
                dayStr = "Tuesday";
                break;

            }
            case 3: {
                dayStr = "Wednesday";
                break;

            }
            case 4: {
                dayStr = "Thursday";
                break;

            }
            case 5: {
                dayStr = "Friday";
                break;

            }
            case 6: {
                dayStr = "Saturday";
                break;

            }
            case 7: {
                dayStr = "Sunday";
                break;

            }
        }
        System.out.println(dayStr);
    }
}
