import java.util.Scanner;

public class Homework2 {
    public static class Student {
        int StudentNumber;
        String Name;
        String Major;
        long PhoneNumber;

        public void setMajor(String major) {
            Major = major;
        }
        public String getMajor() {
            return Major;
        }
        public void setStudentNumber(int studentNumber) {
            StudentNumber = studentNumber;
        }
        public int getStudentNumber() {
            return StudentNumber;
        }
        public void setName(String name) {
            Name = name;
        }
        public String getName() {
            return Name;
        }
        public void setPhoneNumber(long phoneNumber) {
            PhoneNumber = phoneNumber;
        }
        public String getPhoneNumber() {
            String phoneNumberString = Long.toString(PhoneNumber);
            return "0"+phoneNumberString.substring(0,2)+"-"+phoneNumberString.substring(2,6)+'-'+phoneNumberString.substring(6);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentList = new Student[3];
        for (int i=0; i<3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int studentNumber = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phoneNumber = sc.nextLong();
            studentList[i] = new Student();
            studentList[i].setMajor(major);
            studentList[i].setName(name);
            studentList[i].setStudentNumber(studentNumber);
            studentList[i].setPhoneNumber(phoneNumber);
        }

        System.out.print("입력된 학생들의 정보는 다음과 같습니다.\n");
        System.out.printf("첫번째 학생: %d %s %s %s\n", studentList[0].getStudentNumber(), studentList[0].getName(), studentList[0].getMajor(), studentList[0].getPhoneNumber() );
        System.out.printf("두번째 학생: %d %s %s %s\n", studentList[1].getStudentNumber(), studentList[1].getName(), studentList[1].getMajor(), studentList[1].getPhoneNumber() );
        System.out.printf("세번째 학생: %d %s %s %s", studentList[2].getStudentNumber(), studentList[2].getName(), studentList[2].getMajor(), studentList[2].getPhoneNumber() );
    }

}
