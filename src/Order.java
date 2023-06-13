import java.util.Scanner;


public class Order {
    private Scanner scanner;
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return this.clientName;
    }

    public String getProduct() {
        return this.product;
    }

    public int getQnt() {
        return this.qnt;
    }

    public int getPrice() {
        return this.price;
    }

    public Order() {
        this.scanner = new Scanner(System.in);
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.scanner = new Scanner(System.in);
        inputFromConsole();
    }

    public void inputFromConsole() {
        this.clientName = this.prompt("Имя клиента: ");
        this.product = this.prompt("Продукт: ");
        this.qnt = Integer.parseInt(this.prompt("Кол-во: "));
        this.price = Integer.parseInt(this.prompt("Цена: "));
    }

    private String prompt(String message) {
        System.out.println(message);
        return this.scanner.nextLine();
    }
}
