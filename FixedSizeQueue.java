import java.util.concurrent.LinkedBlockingQueue;

class FixedSizeQueue<E> extends LinkedBlockingQueue<E> {
    public synchronized void put(E e, int size) {
        if (this.size() == size)
            this.remove();
        this.offer(e);
    }
}
