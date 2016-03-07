package Week18;

import java.util.concurrent.Executor;

/**
 * Created by graemewilkinson on 22/02/16.
 */
public class Task implements Executor {
    @Override
    public void execute(Runnable runnable) {
        Thread t = new Thread(runnable);
        t.start();
    }
}
