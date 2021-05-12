package study.ref;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class DemoReferenceQueue {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(o1, referenceQueue);
        System.out.println(o1);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
        // gc之前引用队列中并没有任何信息
        System.out.println("=========");
        o1 = null;
        System.gc();
        Thread.sleep(500);
        System.out.println(o1);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
        // gc之后会被放入到引用队列当中
    }
}
