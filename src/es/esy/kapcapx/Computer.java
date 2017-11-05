package es.esy.kapcapx;

public class Computer {
    private String model;
    private String cpu;
    private String videoCard;
    private int ram;

    public Computer (String model) {
        this.model = model;
    }

    public Computer (String model, String cpu, String videoCard, int ram) {
        this(model);
        this.cpu = cpu;
        this.videoCard = videoCard;
        this.ram = ram;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public int getRam() {
        return ram;
    }

    public String toString () {
        return "Модель компьютера: " + model + "\n" + "Процессор: " + cpu + "\n" + "Видео карта: " + videoCard + "\n" + "ОЗУ: " + ram;
    }
}
