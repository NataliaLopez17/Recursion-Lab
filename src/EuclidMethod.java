import java.util.ArrayList;

public class EuclidMethod {
	private static ArrayList<String> arr = new ArrayList<String>();
	private static String tabs = "";
	public static void main(String[] args) {
		
		//Used for testing with visual aid
		//The following evaluation should return 24
		int result = gcd(1440,408);
		
		for(String s: arr) {
			try {
				Thread.sleep(500);
				System.out.println(s);
			}catch (Exception e) {
				//Do Nothing
			}
		}
		String space = new String(new char[arr.size()*3]).replace("\0", " ");
		for(int i = arr.size()-1; i >= 0; i--) {
			try {
				Thread.sleep(500);
				System.out.println(space.substring(0, i*3)+"Return "+result);
			}catch (Exception e) {
				//Do Nothing
			}
		}
	}
	
	/*
	 * EXERCICE 
	 * remember that If p > q, the gcd of p and q is the same as the gcd of q and p % q.
	 * (%) mean module. 
	 * */
	public static int gcd(int p, int q) {
		arr.add(tabs+"gcd("+p+", "+q+")");
		tabs+="   ";
		//Write boundary conditions

		//Write step function
		return 0; //Dummy return
	}
}