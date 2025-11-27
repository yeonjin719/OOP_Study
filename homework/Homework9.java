import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    static class Users {
        private Map<String, String> userMap = new HashMap<>();

        public Users(String dbFilePath) throws IOException {
            loadFromFile(dbFilePath);
        }

        private void loadFromFile(String dbFilePath) throws IOException {
            try (BufferedReader br = new BufferedReader(new FileReader(dbFilePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    if (line.isEmpty()) continue;

                    String[] parts = line.split("\\s+");
                    if (parts.length >= 2) {
                        String id = parts[0].trim();
                        String pw = parts[1].trim();
                        userMap.put(id, pw);
                    }
                }
            }
        }

        public boolean hasId(String id) {
            return id != null && userMap.containsKey(id.trim());
        }

        public boolean checkPassword(String id, String password) {
            if (id == null || password == null) return false;
            String saved = userMap.get(id.trim());
            return password.trim().equals(saved);
        }
    }

    public static void main(String[] args) {
        try {
            Users users = new Users("homework/db.txt");
            Scanner sc = new Scanner(System.in);

            while (true) {   // 전체 로그인 반복
                String id;

                // 1) ID가 존재할 때까지 반복
                while (true) {
                    System.out.print("ID를 입력하세요: ");
                    id = sc.nextLine().trim();

                    if (users.hasId(id)) {
                        break;
                    } else {
                        System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.");
                    }
                }

                // 2) 비밀번호 체크
                System.out.print("비밀번호를 입력하세요: ");
                String pw = sc.nextLine().trim();

                if (users.checkPassword(id, pw)) {
                    System.out.println("로그인 성공!");
                    break;  // 로그인 성공 → 전체 루프 종료
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 시도하세요.\n");
                }
            }

            sc.close();
        } catch (IOException e) {
            System.out.println("db.txt를 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}