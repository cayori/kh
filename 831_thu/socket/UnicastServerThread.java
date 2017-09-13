package last;

import java.net.*; 
import java.io.*;

public class UnicastServerThread implements Runnable{
	private Socket socket;
	private BufferedReader bufferR; 
    private BufferedWriter bufferW;
    private InputStream is;
    private OutputStream os;
	private String message;	
	
	public UnicastServerThread(Socket socket){
		this.socket = socket;		
	}
	public void run(){
		boolean isStop = false;		
		try{
			is = socket.getInputStream();
			bufferR = new BufferedReader(
					new InputStreamReader(is));
			os = socket.getOutputStream();            
		    bufferW = new BufferedWriter(
					new OutputStreamWriter(os));	
        }catch(IOException ioe){
			isStop=true;
		}
		try{	
			while(!isStop){
							
	                String message = bufferR.readLine();
					if(message.equals("exit")) isStop = true;
					System.out.println("received message : "+
							message);
	                message += System.getProperty("line.separator");
					bufferW.write(message);
	                bufferW.flush();	            
	        }//while end		
		}catch(IOException ioe){
			System.out.println("Ŭ���̾�Ʈ�� ������ " +
					"����Ǿ����ϴ�.");
            isStop=true;
        }finally{
            try{
                if(bufferR != null) bufferR.close();
                if(bufferW != null) bufferW.close();
                if(socket != null) socket.close();
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
        }//finally end
	}//run end	
}
