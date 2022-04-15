public class NameThreadv1 implements Runnable {
    private final String name;
    private final int index;

    public NameThreadv1(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public void run() {
        
        try {
            Thread.sleep(index * 500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.print(name.charAt(index));
    }

    public static void main(String[] args) {
        String name = "Multithreading";
        for(int i=0; i<name.length(); i++) {
            NameThreadv1 nt = new NameThreadv1(name, i);
            Thread thread = new Thread(nt);
            thread.start();
        }
    }
    
}