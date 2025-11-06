import java.util.Scanner;

public class SmartLight {
    String name;
    boolean isOn;
    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }
    void toggle() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }
    void getStatus() {
        if (isOn) {
            System.out.printf("%s(이)가 켜져있습니다.\n", name);
        } else {
            System.out.printf("%s(이)가 꺼져있습니다.\n", name);
        }
    }

    SmartLight(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        SmartLight[] smartLights = new SmartLight[N];
        for (int i=0; i<N; i++) {
            String name = sc.nextLine();
            smartLights[i] = new SmartLight(name);
        }
        while (true) {
            String originalCommand = sc.nextLine();
            String command = originalCommand.split("\\s+")[0];
            switch (command) {
                case "ON": {
                    String targetName = originalCommand.split("\\s+")[1];
                    for (SmartLight light: smartLights) {
                        if (light.name.equals(targetName)) {
                            light.turnOn();
                            break;
                        }
                    }
                    break;
                }
                case "OFF": {
                    String targetName = originalCommand.split(" ")[1];
                    for (SmartLight light: smartLights) {
                        if (light.name.equals(targetName)) {
                            light.turnOff();
                            break;
                        }
                    }
                    break;
                }
                case "TOGGLE": {
                    String targetName = originalCommand.split(" ")[1];
                    for (SmartLight light: smartLights) {
                        if (light.name.equals(targetName)) {
                            light.toggle();
                        }
                    }
                    break;
                }
                case "STATUS": {
                    for (SmartLight light: smartLights) {
                        light.getStatus();
                    }
                    break;
                }
                case "EXIT": {
                    return;
                }
                default: {
                    System.out.println("잘못된 명령어를 입력하셨습니다.");
                    break;
                }
            }
        }
    }
}
