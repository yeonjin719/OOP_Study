public class W4Subway {
    static class Subway {
        int SubwayNum;
        void setSubwayNum(int l) {
             SubwayNum = l;
        }
        void run() {
            System.out.println("Line "+ SubwayNum +" runs");
        }

    }

    public static void main(String[] args) {
        Subway subway = new Subway();
        subway.setSubwayNum(10);
        subway.run();
    }
}
