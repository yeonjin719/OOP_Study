import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class User {
    private String id;
    private String name;
    private int age;

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.printf("ID: %s, 이름: %s, 나이: %d%n", id, name, age);
    }
}

class UserManager {
    private final HashMap<String, User> users = new HashMap<>();
    private final String dbPath;

    public UserManager(String dbPath) {
        this.dbPath = dbPath;
    }

    // 프로그램 시작 시 파일에서 로드
    public void loadFromFile() {
        File file = new File(dbPath);
        if (!file.exists()) {
            // 파일 없으면 그냥 빈 DB로 시작
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                // 한 줄 형식: id name age
                String[] tokens = line.split(" ");
                if (tokens.length != 3) continue; // 잘못된 줄은 건너뜀

                String id = tokens[0];
                String name = tokens[1];
                int age = Integer.parseInt(tokens[2]);

                users.put(id, new User(id, name, age));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("DB 파일을 읽는 중 오류가 발생했습니다.");
        }
    }

    // 현재 users 전체를 파일에 덮어쓰기 저장
    private void saveAll() {
        try (FileWriter fw = new FileWriter(dbPath, false)) { // 덮어쓰기 모드
            for (User u : users.values()) {
                String line = u.getId() + " " + u.getName() + " " + u.getAge() + "\n";
                fw.write(line);
            }
        } catch (IOException e) {
            System.out.println("DB 파일을 저장하는 중 오류가 발생했습니다.");
        }
    }

    public boolean addUser(User u) {
        if (users.containsKey(u.getId())) {
            return false;
        }
        users.put(u.getId(), u);
        saveAll();
        return true;
    }

    public User findUser(String id) {
        return users.get(id);
    }

    public boolean deleteUser(String id) {
        User removed = users.remove(id);
        if (removed != null) {
            saveAll();
            return true;
        }
        return false;
    }

    public void printAllUsers() {
        if (users.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
            return;
        }
        for (User u : users.values()) {
            u.printInfo();
        }
    }
}

public class UserDB {
    private static void printMenu() {
        System.out.println("1. 사용자 추가");
        System.out.println("2. 사용자 검색");
        System.out.println("3. 사용자 삭제");
        System.out.println("4. 전체 사용자 출력");
        System.out.println("0. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    public static void main(String[] args) {
        final String DB_PATH = "self_study/db.txt"; // 필요하면 경로 수정

        UserManager userManager = new UserManager(DB_PATH);
        userManager.loadFromFile();

        Scanner input = new Scanner(System.in);

        while (true) {
            printMenu();
            String menu = input.next();

            String id;
            User user;

            switch (menu) {
                case "1":
                    System.out.print("추가할 사용자 정보 입력 (ID 이름 나이): ");
                    id = input.next();
                    String name = input.next();
                    int age = input.nextInt();

                    if (userManager.findUser(id) != null) {
                        System.out.println("이미 존재하는 ID입니다.");
                    } else {
                        user = new User(id, name, age);
                        if (userManager.addUser(user)) {
                            System.out.println("사용자 추가 완료");
                        } else {
                            System.out.println("사용자 추가 실패");
                        }
                    }
                    break;

                case "2":
                    System.out.print("검색할 ID: ");
                    id = input.next();
                    user = userManager.findUser(id);
                    if (user == null) {
                        System.out.println("사용자를 찾을 수 없습니다.");
                    } else {
                        user.printInfo();
                    }
                    break;

                case "3":
                    System.out.print("삭제할 ID: ");
                    id = input.next();
                    if (userManager.deleteUser(id)) {
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("삭제할 사용자가 없습니다.");
                    }
                    break;

                case "4":
                    userManager.printAllUsers();
                    break;

                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    input.close();
                    return;

                default:
                    System.out.println("잘못된 메뉴를 입력하셨습니다.");
                    break;
            }

            System.out.println(); // 줄바꿈 하나 넣어서 가독성
        }
    }
}