public class W5Prac5 {
    enum Month {
        JAN(1, "January", "1월"), FEB(2, "February", "2월"), MAR(3, "March", "3월"),
        APR(4, "April", "4월"), MAY(5, "May","5월"), JUN(6, "June", "6월"),
        JUL(7, "July","7월"), AUG(8, "August","8월"), SEP(9, "September", "9월"),
        OCT(10, "October", "10월"), NOV(11, "November","11월"), DEC(12, "December","12월");
        int month;
        String name;
        String nameKorea;
        Month(int month, String name, String nameKorea) {
            this.month = month;
            this.name = name;
            this.nameKorea = nameKorea;
        }
        int getMonth() {
            return month;
        }
        String getName() {
            return name;
        }
        String getNameKorea() {
            return nameKorea;
        }
    }

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.printf("Value: %s, Num: %d, Name: %s, 이름: %s\n", month, month.getMonth(), month.getName(), month.getNameKorea());
        }
    }
}
