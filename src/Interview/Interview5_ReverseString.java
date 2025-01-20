package Interview;

public class Interview5_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "java";
//		StringBuffer str = new StringBuffer();
//		str.append(name);
//		System.out.println(str.reverse());
		char[] str1 = name.toCharArray();
		for(int i=str1.length -1;i>=0;i--) {
			System.out.print(name.charAt(i));
			
		}
	}

}
