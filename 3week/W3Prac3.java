public class W3Prac3 {
    public static void main(String[] args) {
        String[] browsers = new String[4];
        browsers[0]="Google Chrome";
        browsers[1]="Microsoft Edge";
        browsers[2]="Mozilla Firefox";
        browsers[3]="Naver Whale";
        System.out.print("이건 new 방법입니다.\n");
        for (int i=0; i<browsers.length; i++) {
            System.out.printf("브라우저 이름: %s, 브라우저 이름 길이: %d\n", browsers[i], browsers[i].length());
        }
        System.out.print("\n이건 초기화 방법입니다.\n");
        String[] browsers2 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox","Naver Whale"};
        for (int i=0; i<browsers2.length; i++) {
            System.out.printf("브라우저 이름: %s, 브라우저 이름 길이: %d\n", browsers2[i], browsers2[i].length());
        }
    }
}
