package study.ref;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class DemoPhantomReference {
    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(o1, referenceQueue);
        System.out.println(o1);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());
        // gc之前引用队列中并没有任何信息
        System.out.println("=========");
        o1 = null;
        System.gc();
        Thread.sleep(500);
        System.out.println(o1);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());
        // gc之后会被放入到引用队列当中
    }
}
