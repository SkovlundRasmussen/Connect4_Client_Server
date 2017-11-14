import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by krist on 09-Nov-17.
 */
public class Network {
    public static Socket listen(int port){
        try{
            return new ServerSocket(port).accept();

        }catch(Exception ignored){
            return null;
        }
    }

    public static Socket connect(String host, int port){
        try {
            return new Socket(host, port);
        }
        catch (Exception ignored)
        {
            return null;
        }
    }
}
