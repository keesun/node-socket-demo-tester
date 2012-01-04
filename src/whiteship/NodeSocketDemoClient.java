package whiteship;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Keesun Baik
 */
public class NodeSocketDemoClient {

    public static void main(String[] args) throws IOException {
        List<SimpleIOSocket> socketList = new ArrayList<SimpleIOSocket>();

        String url = "http://localhost:3000";
        for(int i = 0 ; i < 1000 ; i++) {
            SimpleIOSocket socket = new SimpleIOSocket(url);
            socketList.add(socket);
            socket.connect();
        }
    }

}
