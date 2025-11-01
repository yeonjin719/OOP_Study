public class Homework5 {

    static class PersonalComputer {
        private Computer computer;
        private Monitor monitor;

        PersonalComputer() {
            // 과제 요구사항에 맞게 구성
            this.computer = new Computer();
            this.monitor = new Monitor();
        }

        public void turnOn() {
            computer.turnOn();
            monitor.turnOn();
        }

        public void printInfo() {
            computer.printInfo();
            monitor.printInfo();
        }
    }

    static class Computer {
        private String cpu = "Core i7";
        private String memory = "16GB";
        private String hd = "2TB";
        private String color = "White";
        private String power = "500W";

        public void turnOn() {
            System.out.println("Turning on the computer.");
        }

        public void printInfo() {
            System.out.println("The spec of the computer");
            System.out.printf("\tCPU: %s\n\tMemory: %s\n\tHDD: %s\n\tColor: %s\n\tPower: %s\n",
                    cpu, memory, hd, color, power);
        }
    }

    static class Monitor {
        private String monitorSize = "24 inch";
        private String color = "Black";
        private String power = "45W";

        public void turnOn() {
            System.out.println("Turning on the monitor.");
        }

        public void printInfo() {
            System.out.println("The spec of the monitor");
            System.out.printf("\tSize: %s\n\tColor: %s\n\tPower: %s\n",
                    monitorSize, color, power);
        }
    }

    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}