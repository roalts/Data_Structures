package recursion;

public class ReplacePi {

	public static String replacePi(String s, int a){
		if(a == s.length()-1)
			return s;
		if(s.substring(a, a+2).equals("pi")){
			s = s.substring(0,a) + "3.14" + s.substring(a+2,s.length());
			return replacePi(s,a+2);
		}
		else
			return replacePi(s,a+1);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replacePi("ppii",0));
		String s = "pipipi";
		System.out.println(s.substring(0,1));
	}

}
