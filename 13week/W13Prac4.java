import java.io.*;

class W13Prac4 {
    public static void copyFile(InputStream src, OutputStream dest) {
        try {
            int data;
            while ((data = src.read()) != -1) { dest.write(data); }
        }
        catch (Exception e) { e.printStackTrace(); }
    }

    public static void main(String[] args) throws IOException {
        String srcFileName = "13week/hello.txt";
        String destFileName = "13week/hello2.txt";
        // FileInputStream과 FileOutputStream을 사용
        FileInputStream src = new FileInputStream(srcFileName);
        FileOutputStream dest = new FileOutputStream(destFileName);
        copyFile(src, dest);
        src.close();
        dest.close();

        FileReader fr = new FileReader(destFileName);
        BufferedReader src3 = new BufferedReader(fr);
        String line;
        while ((line = src3.readLine()) != null) {
            System.out.println(line);
        }
        src3.close();
    }
}