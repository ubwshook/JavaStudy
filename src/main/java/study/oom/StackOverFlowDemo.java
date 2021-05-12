package study.oom;

// 递归调用会迅速消耗掉栈空间
public class StackOverFlowDemo {
    private static void stackOverflowError(){
        stackOverflowError();
    }

    public static void main(String[] args) {
        stackOverflowError();
    }
}
