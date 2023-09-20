import java.util.Objects;

public class Laptop {
    private String brand;
    private String model;
    private String CPU;
    private Integer RAM;
    private String matrix;
    private Double diagonal;
    private String GPU;
    private Integer SSD;
    private String OS;

    public Laptop(String brand, String model, String CPU, Integer RAM, String matrix, Double diagonal, String GPU, Integer SSD, String OS) {
        this.brand = brand;
        this.model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        this.matrix = matrix;
        this.diagonal = diagonal;
        this.GPU = GPU;
        this.SSD = SSD;
        this.OS = OS;
        
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getCPU() {
        return this.CPU;
    }

    public Integer getRAM() {
        return this.RAM;
    }

    public String getMatrix() {
        return this.matrix;
    }

    public Double getDiagonal() {
        return this.diagonal;
    }

    public String getGPU() {
        return this.GPU;
    }

    public Integer getSSD() {
        return this.SSD;
    }

    public String getOS() {
        return this.OS;
    }

    @Override
    public String toString() {
        return String.format("Фирма: %s, Модель: %s, Процессор: %s, Объем RAM: %d ГБ\nМатрица экрана: %s, Диагональ экрана: %.1f, Модель видеокарты: %s,\nОбъем SSD-накопителя: %d ГБ, Операционная система: %s\n",
        getBrand(), getModel(), getCPU(), getRAM(), getMatrix(), getDiagonal(), getGPU(), getSSD(), getOS());
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj instanceof Laptop) {
    //         return this.model.equals(((Laptop) obj).model);
    //     }
    //     return false;
    // }
}
