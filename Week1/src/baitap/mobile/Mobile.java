package baitap.mobile;

public class Mobile {
    private String name;
    private String color;
    private int memory;
    private String messenger;

    public Mobile() {

    }

    public Mobile(String name, String color, int memory) {
        this.name = name;
        this.color = color;
        this.memory = memory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMessenger() {
        this.messenger = messenger;
    }
    public String getMessenger() {
        return messenger;
    }
}
