import java.util.Arrays;

public class List<T> {
    private T[] data;
    private int size;
    private int capacity;

    public List() {
        data = null;
        size = 0;
        capacity = 0;
    }

    public List(T[] data) {
        this.data = Arrays.copyOf(data, data.length);
        size = data.length;
        capacity = data.length;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public void set(int index, T element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = element;
    }

    public void pushBack(T element) {
        if (size == capacity) {
            resize(capacity == 0 ? 1 : capacity * 2);
        }
        data[size++] = element;
    }

    public T popBack() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Index: " + 0 + ", Size: " + size);
        }

        return data[--size];
    }

    public void clear() {
        size = 0;
    }

    private void resize(int newCapacity) {
        if (newCapacity == 1) {
            data = (T[]) new Object[1];
        }
        else {
            data = Arrays.copyOf(data, newCapacity);
        }
        capacity = newCapacity;
    }
}
