import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class ClientHandler implements Runnable {
    Socket socket = null;
    Boolean boo = true;
    static final AtomicInteger ai = new AtomicInteger(1);
    int id;


    public ClientHandler(Socket socket) {
        this.id = ai.getAndIncrement();
        this.socket = socket;
    }
    
    @Override
    public synchronized void run() {
        System.out.println("Client "+this.id+" accepted");
        DataInputStream in;
        try {
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            while (true) {
                try {
                    String line = "";
                    line = in.readUTF();
                    System.out.println("Cliente "+this.id+": "+line);
                } catch (EOFException e) {
                    break;
                }

            }
            System.out.println("Closing connection");
            socket.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void stop() {
        this.boo = false;
    }
}
