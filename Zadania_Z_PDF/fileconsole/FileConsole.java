import java.io.IOException;
import java.io.WriteAbortedException;

public class FileConsole extends File{
    
    public void open(String name) {
        try {
            super.open(name);
        } catch (Exception e) {
            System.out.println("Komunikat o bledzie otwarcia");
        }
    }
    public void write(int value) {
        try {
            super.write(value);
        } catch (WriteAbortedException e) {
            System.out.println("Komunikat o bledzie writeException");
        }
    }

    public void close() {
        try {
           super.close();
        } catch (IOException e) {
            System.out.println("Komunikat o bledzie IOException");
        }
    }    
}
