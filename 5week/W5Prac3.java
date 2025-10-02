public class W5Prac3 {
    public static void main(String[] args) {
        String[] array = {"New York", "Beijing", "Seoul"};
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Seoul")) {
                System.out.printf("Seoul 문자열이 %d번 index에 있습니다\n", i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.print("해당 문자열을 찾을 수 없습니다.");
        }
        boolean found2 = false;
        int index = 0;
        for (String city: array) {
            if (city.equals("Seoul")) {
                System.out.printf("Seoul 문자열이 %d번 index에 있습니다\n", index);
                found2 = true;
                break;
            }
            index ++;
        }
        if (!found2) {
            System.out.print("해당 문자열을 찾을 수 없습니다.");
        }
    }
}
