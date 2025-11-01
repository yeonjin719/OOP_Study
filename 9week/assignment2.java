import java.time.LocalDateTime;

public class assignment2 {
    static class Appointment {
        LocalDateTime time;
        Person person;
        Place place;
        Appointment(LocalDateTime time, Person person, Place place) {
            this.time = time;
            this.person = person;
            this.place = place;
        }

        public String toString() {
            return "DateTime: "+time.toString()+"\nPerson: "+person.toString()+"\nPlace: "+place.toString();
        }
    }
    static class Person {
        String name;
        String phone;
        Person(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }
        public String toString() {
            return "Name: "+name+" Phone: "+phone;
        }
    }
    static class Place {
        String name;
        String phone;
        Place(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
        public String getName() {
            return name;
        }
        public String getPhone() {
            return phone;
        }
        public String toString() {
            return "Name: "+name+" Phone: "+phone;
        }
    }
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2025, 11, 1, 16,57, 0);
        Person person = new Person("Kim Yeonjin", "010-0000-0000");
        Place place = new Place("Doraeul", "031-0000-0000");
        Appointment appointment = new Appointment(d, person, place);
        System.out.println(appointment);
    }
}
