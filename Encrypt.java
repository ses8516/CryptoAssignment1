public class Encrypt{

	public static void main(String[] args){
		if(args.length != 2
			|| !args[0].matches("[0-9A-F]+") || args[0].length() != 24
			|| !args[1].matches("[0-9A-F]+") || args[1].length() != 16) usage();
			
		Encrypt e = new Encrypt();
		e.setKey(args[0]);
		e.encrypt(Hex.)
	}

	public static void usage(){
		System.err.println("USAGE: java Encrypt <key> <plaintext>\n" +
							"\t<key> is the key (24 hexadecimal digits)\n" + 
							"\t<plaintext> is the plaintext block (16 hexadecimal digits)");
		System.exit(1);
	}
}