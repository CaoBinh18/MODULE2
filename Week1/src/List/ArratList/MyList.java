package List.ArratList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
            System.out.println("Khoi tao thanh cong!");
        } else {
            System.out.println("Tham so vuot qua!");
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

}
