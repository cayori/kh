package aug30;

import java.io.*;
import java.util.*;

public class FileEx7 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: java FileEx7 pattern");
			System.exit(0);
		}
		
		File dir = new File(System.getProperty("user.dir"));
		final String pattern = args[0];
		
		String[] files = dir.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.indexOf(pattern) != -1;
			}
		});
		
		for(int i=0; i<files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
