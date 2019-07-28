package fanXing;


public class Example<T> {
    private T obj;

    public Example(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("T的实际类型：" + obj.getClass().getName());
    }

    public static void main(String[] args) {
        Example<Integer> example = new Example<>(1);
        Example<Integer> e = new Example<>(1);
        example.showType();
        int i = example.getObj();
        System.out.println(i);
    }
}
