import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class SelfPrac1 {
    static class SelfSmartPhone {
        String brand;
        String model;
        int battery;
        List<String> apps = new ArrayList<>();
        SelfSmartPhone( ) {
            this.battery=50;
            this.model="Unknown";
            this.brand="Unknown";
        }
        SelfSmartPhone(String brand, String model) {
            this.battery=50;
            this.model=model;
            this.brand=brand;
        }
        SelfSmartPhone(String brand, String model, int battery) {
            this.battery=battery;
            this.model=model;
            this.brand=brand;
        }

        void call(String number, int minutes) {
            if (this.battery < 5) {
                System.out.print("CALL FAIL LOW\n");
                return;
            }
            this.battery -= max(1, minutes);
            System.out.printf("CALL OK %d\n", battery);
        }

        void charge(int amount) {
            battery += min(100, amount+battery);
            System.out.printf("BATTERY %d\n", battery);
        }

        boolean install(String appName) {
            for (String name: apps) {
                if (Objects.equals(name, appName)) {
                    System.out.printf("ALREADY %s\n", appName);
                    return false;
                }
            }
            apps.add(appName);
            System.out.printf("INSTALLED %s\n", appName);
            return true;
        }

        boolean uninstall(String appName) {
            boolean ok = apps.remove(appName);
            if (ok) System.out.println("REMOVED " + appName);
            else    System.out.println("NOT FOUND " + appName);
            return ok;
        }

    }

    public static void main(String[] args) {
        String initialize;
        int n;
        SelfSmartPhone smartPhone;

        Scanner sc = new Scanner(System.in);
        initialize = sc.nextLine().trim();
        if (Objects.equals(initialize, "-")) {
            smartPhone = new SelfSmartPhone();
        } else if (initialize.split("\\s+").length == 2) {
            smartPhone = new SelfSmartPhone(initialize.split("\\s+")[0], initialize.split("\\s+")[1]);
        } else {
            String battery = initialize.split("\\s+")[2];
            int IntBattery = Integer.parseInt(battery);
            smartPhone = new SelfSmartPhone(initialize.split("\\s+")[0], initialize.split("\\s+")[1], IntBattery);
        }
        n = sc.nextInt();
        for (int i=0; i<=n; i++) {
            String cmds = sc.nextLine();
            String cmd = cmds.split("\\s+")[0];
            switch (cmd) {
                case "CHARGE" : {
                    int chargeNum = Integer.parseInt(cmds.split("\\s+")[1]);
                    smartPhone.charge(chargeNum);
                    break;
                }
                case "STATUS": {
                    System.out.printf("PHONE %s=%s, battery=%d\n", smartPhone.brand, smartPhone.model, smartPhone.battery);
                    System.out.printf("APPS %d\n", smartPhone.apps.toArray().length);
                    if (smartPhone.apps.toArray().length == 0) break;

                    for (String app: smartPhone.apps) {
                        System.out.printf("%s", app);
                    }

                    break;
                }
                case "CALL": {
                    String phoneNum = cmds.split("\\s+")[1];
                    int minutes = Integer.parseInt(cmds.split("\\s+")[2]);
                    smartPhone.call(phoneNum, minutes);
                    break;

                }
                case "INSTALL": {
                    String app = cmds.split("\\s+")[1];
                    smartPhone.install(app);
                    break;

                }
                case "UNINSTALL": {
                    String app = cmds.split("\\s+")[1];
                    smartPhone.uninstall(app);
                    break;

                }
            }
        }

    }
}
