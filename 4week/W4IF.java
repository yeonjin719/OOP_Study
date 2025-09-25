public class W4IF {
    static class Student {
        String name;
        Double AverageScore;
        int incomeLevel;
        Student(String name, Double AverageScore, int incomeLevel) {
            this.name = name;
            this.AverageScore = AverageScore;
            this.incomeLevel = incomeLevel;
        }

        String getName() {
            return name;
        }
        Double getAverageScore() {
            return AverageScore;
        }
        int getIncomeLevel() {
            return incomeLevel;
        }
    }

    static void isCandidate(Student student) {
        Double studentAverageScore =  student.getAverageScore();
        String studentName = student.getName();
        int IncomeLevel = student.getIncomeLevel();
        if (studentAverageScore >= 3.5 && IncomeLevel<= 5) {
            System.out.printf("%s 학생은 장학생 후보에 적합한 학생입니다.\n", studentName);
        } else if (IncomeLevel > 5) {
            System.out.printf("%s 학생은 장학생 후보에 적합하지 않습니다. (사유: 소득분위가 %d로, 조건인 5 이하를 만족하지 않음)\n", studentName, IncomeLevel);
        } else {
            System.out.printf("%s 학생은 장학생 후보에 적합하지 않습니다. (사유: 평점이 %d로, 조건인 3.5 이상을 만족하지 않음)\n", studentName, IncomeLevel);
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("김규상", 4.1, 3);
        Student s2 = new Student("김민재", 3.71, 5);
        Student s3 = new Student("김용하", 3.93, 7);

        isCandidate(s1);
        isCandidate(s2);
        isCandidate(s3);
    }
}
