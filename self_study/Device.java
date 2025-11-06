import java.util.Scanner;

// string method는 155, 156페이지

public class Device {
    String name;
    String type;
    String group;
    boolean isOn;
    Device( String name, String type, String group) {
        this.name = name;
        this.type = type;
        this.group = group;
        this.isOn = false;
    }
    Device( String name, String type) {
        this.name = name;
        this.type = type;
        this.group = "UNGROUP";
        this.isOn = false;
    }

    static void sortByName(Device[] a, boolean asc) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int sel = i;

            for (int j = i; j < n; j++) {
                if (a[j] == null) continue;                // 후보 제외
                if (a[sel] == null) { sel = j; continue; } // null보다 비-null이 우선

                int cmp = a[j].name.compareTo(a[sel].name);
                if (asc ? (cmp < 0) : (cmp > 0)) sel = j;
            }

            if (a[sel] == null) break; // i 이후 전부 null
            if (sel != i) {
                Device tmp = a[i];
                a[i] = a[sel];
                a[sel] = tmp;
            }
        }
    }

    public static void CommandFlags(String command, String originalCommand, Device[] devices) {
        switch (command) {
            case "ADD": {
                String name, type, group;
                boolean isFull = true;
                try {
                    name = originalCommand.split("\\s+")[1];
                    type = originalCommand.split("\\s+")[2].toUpperCase();
                    group = originalCommand.split("\\s+")[3];
                } catch (Exception e) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                for (Device value : devices) {
                    if (value != null && name.equals(value.name)) {
                        System.out.println("중복된 이름입니다.");
                        break;
                    }
                }
                if (!type.equals("LIGHT") && !type.equals("PLUG") && !type.equals("SENSOR")) {
                    System.out.println("잘못된 타입입니다.");
                    break;
                }
                for (int i = 0; i < devices.length; i++) {
                    if (devices[i] == null) {
                        isFull = false;
                        Device device = new Device(name, type, group);
                        devices[i] = device;
                        break;
                    }
                }
                if (isFull) {
                    System.out.println("공간이 부족합니다.");
                }
                break;
            }
            case "REMOVE": {
                String name;
                try {
                    name = originalCommand.split("\\s+")[1];
                } catch (Exception e) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                for (int i = 0; i < devices.length; i++) {
                    if (devices[i] != null && name.equals(devices[i].name)) {
                        devices[i] = null;
                        break;
                    }
                }
                break;
            }
            case "ON": {
                if (originalCommand.split("\\s+").length != 2) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                String name = originalCommand.split("\\s+")[1];
                for (Device device : devices) {
                    if (device != null && name.equals(device.name)) {
                        device.isOn = true;
                    }
                }
                break;
            }
            case "OFF": {
                if (originalCommand.split("\\s+").length != 2) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                String name = originalCommand.split("\\s+")[1];
                for (Device device : devices) {
                    if (device != null && name.equals(device.name)) {
                        device.isOn = false;
                    }
                }
                break;
            }
            case "TOGGLE": {
                if (originalCommand.split("\\s+").length != 2) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                String name = originalCommand.split("\\s+")[1];
                for (Device device : devices) {
                    if (device != null && name.equals(device.name)) {
                        device.isOn = !device.isOn;
                    }
                }
                break;
            }
            case "RENAME": {
                boolean newNameIsExist = false;
                if (originalCommand.split("\\s+").length != 3) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                String oldName = originalCommand.split("\\s+")[1];
                String newName = originalCommand.split("\\s+")[2];
                for (Device device : devices) {
                    if (device != null && newName.equals(device.name)) {
                        System.out.println("중복된 이름입니다.");
                        newNameIsExist = true;
                        break;
                    }
                }
                if (newNameIsExist) {
                    break;
                }
                for (Device device : devices) {
                    if (device != null && oldName.equals(device.name)) {
                        device.name = newName;
                    }
                }
                break;
            }
            case "GROUP": {
                if (originalCommand.split("\\s+").length != 3) {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                String name = originalCommand.split("\\s+")[1];
                String groupName = originalCommand.split("\\s+")[2];
                for (Device device : devices) {
                    if (device != null && name.equals(device.name)) {
                        device.group = groupName;
                    }
                }
                break;
            }
            case "STATUS": {
                sortByName(devices, false);
                if (originalCommand.split("\\s+").length == 1) {
                    for (Device device : devices) {
                        if (device != null) {
                            System.out.printf("%s %s %s %s\n", device.name, device.type, device.group, device.isOn ? "ON" : "OFF");
                        }
                    }
                } else if  (originalCommand.split("\\s+").length == 3) {
                    if (originalCommand.split("\\s+")[1].toUpperCase().equals("GROUP")) {
                        String groupName = originalCommand.split("\\s+")[2];
                        for (Device device : devices) {
                            if (device != null && device.group.equals(groupName)) {
                                System.out.printf("%s %s %s %s\n", device.name, device.type, device.group, device.isOn ? "ON" : "OFF");
                            }
                        }
                    } else if (originalCommand.split("\\s+")[1].toUpperCase().equals("TYPE")) {
                        String type = originalCommand.split("\\s+")[2];
                        for (Device device : devices) {
                            if (device != null && device.type.equals(type)) {
                                System.out.printf("%s %s %s %s\n", device.name, device.type, device.group, device.isOn ? "ON" : "OFF");
                            }
                        }
                    } else {
                        System.out.println("잘못된 명령입니다.");
                        break;
                    }
                } else {
                    System.out.println("잘못된 명령입니다.");
                    break;
                }
                break;
            }
            case "COUNT": {
                String subCommand =  originalCommand.split("\\s+")[1].toUpperCase();
                int count = 0;
                switch (subCommand) {
                    case "ON": {
                        for (Device device : devices) {
                            if (device.isOn) {
                                count++;
                            }
                        }
                        break;
                    }
                    case "OFF": {
                        for (Device device : devices) {
                            if (!device.isOn) {
                                count++;
                            }
                        }
                        break;
                    }
                    case "GROUP": {
                        String group = originalCommand.split("\\s+")[2];
                        for (Device device : devices) {
                            if (device.group.equals(group)) {
                                count++;
                            }
                        }
                        break;
                    }
                    case "TYPE": {
                        String type = originalCommand.split("\\s+")[2].toUpperCase();
                        for (Device device : devices) {
                            if (device != null && device.type.equals(type)) {
                                count++;
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("잘못된 명령입니다.");
                        break;
                    }
                }
                System.out.println(count);
                break;
            }
            case "FIND": {
                String prefix =  originalCommand.split("\\s+")[2].trim();
                sortByName(devices, false);
                for (Device device : devices) {
                    if (device != null && device.name.startsWith(prefix)) {
                        System.out.println(device.name);
                    }
                }
                break;
            }
            case "SORT": {
                String sortWay = originalCommand.split("\\s+")[2].trim();
                if (sortWay.equals("ASC")) {
                    sortByName(devices, false);

                } else if (sortWay.equals("DESC")) {
                    sortByName(devices, true);

                }
                break;
            }
            case "SCRIPT": {
                int K = Integer.parseInt(originalCommand.split("\\s+")[1]);
                Scanner sc = new Scanner(System.in);
                for (int i = 1; i < K; i++) {
                    String scripts = sc.nextLine();
                    String script = scripts.split("\\s+")[0];
                    if (script.equals("SCRIPT")) {
                        break;
                    } else {
                        CommandFlags(script, scripts, devices);
                    }
                }
                break;
            }
            case "HELP": {
                System.out.println("ADD/REMOVE/ON/OFF/TOGGLE/RENAME/GROUP/STATUS/COUNT/FIND/SORT/SCRIPT/HELP/EXIT");
                break;
            }
            case "EXIT": {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Device[] devices = new Device[N];
        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            if (input.equals("-")) {
                continue;
            } else if (input.split("\\s+").length == 2) {
                String name = input.split("\\s+")[0];
                String type = input.split("\\s+")[1].toUpperCase();
                if (!type.equals("LIGHT") && !type.equals("PLUG") && !type.equals("SENSOR")) {
                    System.out.println("잘못된 타입입니다.");
                    break;
                }
                Device device = new Device(name, type);
                devices[i] = device;
            } else if (input.split("\\s+").length == 3) {
                String name = input.split("\\s+")[0];
                String type = input.split("\\s+")[1].toUpperCase();
                String group = input.split("\\s+")[2];
                if (!type.equals("LIGHT") && !type.equals("PLUG") && !type.equals("SENSOR")) {
                    System.out.println("잘못된 타입입니다.");
                    break;
                }
                Device device = new Device(name, type, group);
                devices[i] = device;
            } else {
                continue;
            }
        }

        while (true) {
            String originalCommand = sc.nextLine();
            String command = originalCommand.split("\\s+")[0].toUpperCase().trim();
            if (command.equals("EXIT")) {
                break;
            }
            CommandFlags(command, originalCommand, devices);
        }
    }
}
