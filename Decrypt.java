public class Decrypt{

	public static void main(String[] args){
		if(args.length != 2
			|| !args[0].matches("[0-9A-F]+") || args[0].length() != 24
			|| !args[1].matches("[0-9A-F]+") || args[1].length() != 16) usage();
	}

	public static void usage(){
		System.err.println("USAGE: java Decrypt <key> <ciphertext>\n" +
							"\t<key> is the key (24 hexadecimal digits)\n" + 
							"\t<ciphertext> is the ciphertext block (16 hexadecimal digits)");
		System.exit(1);
	}
}
}