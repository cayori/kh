package aug17.add;

public class StringEx9 {
	public static void main(String[] args) {
	String fullName = "Hello.Java";
	
	int index = fullName.indexOf('.');
	String fileName = fullName.substring(0,index);
	String ext = fullName.substring(index+1);
	
	System.out.println(fullName +" 의 파일명은 : "+ fileName);
	System.out.println(fullName +" 의 확장명은 : "+ ext);
}}
