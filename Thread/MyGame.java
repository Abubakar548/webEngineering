class DrawImage extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) // WORK
            System.out.println("drawing image:- " + i);

        System.out.println("Current Thread : - " + Thread.currentThread()); // PRINT INFO
        System.out.println("Current Thread Name : - " + Thread.currentThread().getName());
        System.out.println("Current Thread ID: - " + Thread.currentThread().getId());
        System.out.println("Current Thread Priority: - " + Thread.currentThread().getPriority());
    }
}

class PlayMusic extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) // WORK
        {
            System.out.println("playing music:- " + i);
        }
        System.out.println("Current Thread : - " + Thread.currentThread()); // PRINT INFO
        System.out.println("Current Thread Name : - " + Thread.currentThread().getName());
        System.out.println("Current Thread ID: - " + Thread.currentThread().getId());
        System.out.println("Current Thread Priority: - " + Thread.currentThread().getPriority());
    }
}

class MyGame {
    public static void main(String[] args) {

        DrawImage diObj = new DrawImage(); // Creating Object that has inherited Thread
        PlayMusic pmObj = new PlayMusic();

        diObj.setName("DrawImage"); // SETTING NAME
        pmObj.setName("PlayMusic");

        diObj.setPriority(Thread.MAX_PRIORITY); // Setting PRIORITY
        pmObj.setPriority(Thread.MIN_PRIORITY);

        diObj.start(); // Thread Start

        try {
            diObj.join(); // Joining THREADs hence other threads will for it to end
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        pmObj.start(); // Thread Start

        try {
            pmObj.join(); // Joining THREADs
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        System.out.println("Current Thread : - " + Thread.currentThread()); // PRINT INFO
        System.out.println("Current Thread Name : - " + Thread.currentThread().getName());
        System.out.println("Current Thread ID: - " + Thread.currentThread().getId());
        System.out.println("Current Thread Priority: - " + Thread.currentThread().getPriority());

    }
}