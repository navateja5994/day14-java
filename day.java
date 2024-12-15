class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Good Morning");
                try { Thread.sleep(1000); 
                } 
                catch (InterruptedException e) { }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("Good Afternoon");
                try { Thread.sleep(1000);
                 }
                  catch (InterruptedException e) { }
            }
        });

        Thread thread3 = new Thread(() -> {
            while (true) {
                System.out.println("Good Evening");
                try { Thread.sleep(1000);
                 }
                  catch (InterruptedException e) { }
            }
        });

        Thread thread4 = new Thread(() -> {
            while (true) {
                System.out.println("Good Night");
                try { Thread.sleep(1000); 
                }
                 catch (InterruptedException e) { }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}