public class Main2 {
    public static void main(String[] args) {
        Runnable e = () -> System.out.println("mainの中のrunを実行!");
        e.run();
    }
}
