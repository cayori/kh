package aug31.socket;

import java.net.*;
import java.io.*;

public class MultiServerRunnable implements Runnable{

	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;	
	
	public MultiServerRunnable(MultiServer ms) {
		this.ms = ms;
	}
	
	@Override
	public void run() {
		boolean isStop = false;
		try {
			socket = ms.getSocket();
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			String message = null;
			
			while(!isStop) {
				message = (String)ois.readObject();
				String[] str = message.split("#");
				if(str[1].equals("exit")) {
					broadCasting(message);
					isStop = true;
				}else {
					broadCasting(message);
				}
			}
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+"정상적으로 종료하셨습니다");
			System.out.println("list size : "+ms.getList().size());
		}catch(Exception e) {
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+"비정상적으로 종료하셨습니다");
			System.out.println("list size : "+ms.getList().size());
		}
	}
	public void broadCasting(String message) throws IOException{
		for(MultiServerRunnable cr : ms.getList()) {
			cr.send(message);
		}
	}
	public void send(String message) throws IOException{
		oos.writeObject(message);
	}

}
