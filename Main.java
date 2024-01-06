public class Main {
    public static void main(String[] args) {
        Runnable e = new Runnable() {

            @Override
            public void run() {
                System.out.println("Exampleを実行しました。");
            }
            
        };
        e.run();
    }
}
