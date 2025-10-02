public class W5Assignment11 {
    enum Light {
        RED(30, "빨강"),
        AMBER(10, "주황"),
        GREEN(30, "초록");
        int time;
        String name;
        Light(int time, String name) {
            this.time = time;
            this.name = name;
        }
        int getTime() {
            return time;
        }
        String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        for (Light light : Light.values()) {
            System.out.printf("색상: %s, 켜져있는 시간: %d, 이름: %s불\n", light, light.getTime(), light.getName() );
        }
    }
}
