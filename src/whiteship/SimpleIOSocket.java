package whiteship;

import org.json.JSONException;
import org.json.JSONObject;
import socket.io.IOSocket;
import socket.io.MessageCallback;

/**
 * @author Keesun Baik
 */
public class SimpleIOSocket extends IOSocket {
    public SimpleIOSocket(String address) {
        super(address, new MessageCallback() {
            @Override
            public void on(String event, JSONObject... data) {
                if (event.equals("news")) {
                    try {
                        System.out.println(data[0].get("hello"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("event : " + event + " | data: " + data[0]);
                }
            }

            @Override
            public void onMessage(String message) {
                System.out.println("onMessage(String)");
                System.out.println(message);
            }

            @Override
            public void onMessage(JSONObject json) {
                System.out.println("onMessage(JSONObject)");
                System.out.println(json);
            }

            @Override
            public void onConnect() {
                System.out.println("connected");
            }

            @Override
            public void onDisconnect() {
                System.out.println("disconnected");
            }

            @Override
            public void onConnectFailure() {
                System.out.println("failed");
            }
        });
    }
}
