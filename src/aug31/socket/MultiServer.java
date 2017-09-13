package aug31.socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer {
	private ArrayList<MultiServerRunnable> list;
	private Socket socket;
	
	public MultiServer() throws IOException{
		list = new ArrayList<MultiServerRunnable>();
		ServerSocket serverSocket = new ServerSocket(1234);
		MultiServerRunnable msr = null;
		boolean isStop = false;
		
		while (!isStop) {
			System.out.println("Server ready...");
			socket = serverSocket.accept();
			msr = new MultiServerRunnable(this);
			list.add(msr);
			Thread t = new Thread(msr);
			t.start();
		}
	}
	
	public ArrayList<MultiServerRunnable> getList(){
		return list;
	}
	public Socket getSocket() {
		return socket;
	}
	public static void main(String[] args) throws IOException {
		new MultiServer();
	}
}
