package entity;

public class Computer {
    private Integer id;
    private String model;
    private String processor;
    private String ram;

    public Computer(Integer id, String model, String processor, String ram) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
