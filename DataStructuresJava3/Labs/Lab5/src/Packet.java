import java.util.ArrayList;

class Packet {
    private String data;
    private int position;

    public Packet(String data, int position) {
        this.data = data;
        this.position = position;
    }

    public String getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }
}


class Machine {
    private ArrayList<Packet> buffer;
    private ArrayList<Packet> memory;

    public Machine() {
        buffer = new ArrayList<>();
        memory = new ArrayList<>();
    }

    public void enqueue(Packet packet) {
        buffer.add(packet);
    }

    // method removes a packet from the buffer and
    // adds that packet to the memory
    // As the packet is added to the memory, perform an insertion sort to put in the proper order
    // Can't use sort method or any Java API libraries!
    public void dequeue() {
        for (int i = 0; i < buffer.size(); i++) {
            Packet packet = buffer.remove(0);
            int value = packet.getPosition();
            int insert = 0;

            // two statements connected by "and", will keep looping and incrementing the index until either statement
            // is false, then will insert the value at said index where the loop stopped
            while(insert < memory.size() && value > memory.get(insert).getPosition()) {
                insert++;
            }
            memory.add(insert, packet);
        }
    }

    public boolean isEmpty() {
        return buffer.size() == 0;
    }

    public ArrayList<Packet> getMemory() {
        return memory;
    }
}

// basic layout we'll follow in the lab itself
// The T is a generic parameter,
// we don't have to declare what kind of type the array is in here

class RawQueue<T> {
    private ArrayList<T> array;
    private ArrayList<T> array2;

    public RawQueue() {
        array = new ArrayList<>();
        array2 = new ArrayList<>();
    }

    public void enqueue(T item) {
        array.add(item);
    }

    public void dequeue() {
        array2.add(array.remove(0));
    }

    public boolean isEmpty() {
        return array.size() == 0;
    }
}
