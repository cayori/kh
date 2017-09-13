package aug31.socket;

import java.io.*;
import java.net.*;

public class UnicastServer {
	private ServerSocket serverS;
	
	public UnicastServer(int port) {
		try {
			serverS = new ServerSocket(port);			
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		
		UnicastServerRunnable usr = null;
		while(true) {
			System.out.println("클라이언트 대기중");
			Socket s = null;
			try {
				s = serverS.accept();				
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
			System.out.println("client ip : "+s.getInetAddress().getHostAddress());
			
			usr = new UnicastServerRunnable(s);
			Thread t = new Thread(usr);
			t.start();
		}
	}
	public static void main(String[] args) {
		new UnicastServer(3000);
	}
}


class UnicastServerRunnable implements Runnable{
	private Socket socket;
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	private String message;
	
	public UnicastServerRunnable(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		boolean isStop = false;
		try {
			is = socket.getInputStream();
			bufferR = new BufferedReader( new InputStreamReader(is) );
			os = socket.getOutputStream();
			bufferW = new BufferedWriter( new OutputStreamWriter(os) );			
		}catch(IOException ioe) {
			ioe.printStackTrace();
			isStop = true;
		}
		
		try {
			while(!isStop) {
				String message = bufferR.readLine();
				if(message.equals("exit")) isStop = true;
				System.out.println("received message : "+message);
				message += System.getProperty("line.separator");
				bufferW.write(message);
				bufferW.flush();
			} // end while
		}catch(IOException ioe) {
			System.out.println("클라이언트가 강제로 종료되었습니다.");
			isStop = true;
		}finally{
			try {
				if(bufferR != null) bufferR.close();
				if(bufferW != null) bufferW.close();
				if(socket  != null) socket.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
}





























