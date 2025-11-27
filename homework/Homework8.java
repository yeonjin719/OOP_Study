import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {

    static class Users {
        Map<String, String> userInfo = new HashMap<>();
        void addUser(String id, String password) {
            userInfo.put(id, password);
        }
        void login() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = scanner.nextLine();
            if (userInfo.containsKey(id)) {
                System.out.print("password: ");
                String pw = scanner.nextLine();
                confirmPassword(id, pw);
            } else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
        }
        void confirmPassword(String id, String password) {
             if (userInfo.containsKey(id) && userInfo.get(id).equals(password)) {
                 System.out.println("id와 비밀번호가 일치합니다.\n");
             } else if (userInfo.containsKey(id)) {
                 System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
             }
        }
    }

    public static void main(String[] args) {
        Users users = new Users();
        users.addUser("myId", "myPass");
        users.addUser("myId2", "myPass2");
        users.addUser("myId3", "myPass3");

        for (int i = 0; i < 3; i++) {
            users.login();
        }
    }
}