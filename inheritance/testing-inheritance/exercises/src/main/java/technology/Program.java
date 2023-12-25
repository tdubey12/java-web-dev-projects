package technology;

public class Program {
    public static void main(String[] args) {
        Computer hp = new Computer();
        hp.setBrand("hp");
        System.out.println("Brand"+hp.getBrand());
        Laptop dell =new Laptop();
        dell.setKeys(102);
        System.out.println("Keys"+dell.getKeys());
        SmartPhone samsung =new SmartPhone();
        samsung.setSimType("nano");
        System.out.println("simType"+samsung.getSimType());
    }

}