package socket.io;

public class Message extends IOMessage{
	
	public Message(String message){
		super(MESSAGE, -1, "", message);
	}
}
