import java.io.FileWriter;
import java.io.IOException;

public class JSONManager {
    private final String fileName;
    private final Order order;

    public JSONManager(String fileName, Order order) {
        this.fileName = fileName + ".json";
        this.order = order;
    }

    void saveFile(){
        try {
            FileWriter writer = new FileWriter(fileName, false);

            try {
                writer.write("{\n");
                writer.write("\"clientName\":\"" + this.order.getClientName() + "\",\n");
                writer.write("\"product\":\"" + this.order.getProduct() + "\",\n");
                writer.write("\"qnt\":" + this.order.getQnt() + ",\n");
                writer.write("\"price\":" + this.order.getPrice() + "\n");
                writer.write("}\n");

                writer.flush();

            } catch (Throwable var6) {
                try {
                    writer.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            writer.close();
        } catch (IOException var7) {
            System.out.println(var7.getMessage());
        }
    }



}
