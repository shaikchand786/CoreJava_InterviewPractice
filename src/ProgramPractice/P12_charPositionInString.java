package ProgramPractice;


public class P12_charPositionInString {
	
	public static void main(String[] args) {
        String str = "mankind";
        
        String newstr=" ";
        int position=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            newstr = newstr + str.charAt(i);
        }
        System.out.println(newstr);
        
        for(int j=0;j<newstr.length();j++){
            if(newstr.charAt(j) == 'a'){
                position = j;
                break;
            }
        }
        System.out.println("Poision of char 'a' is present at : " + position);
        
        System.out.println("-----------------Using 'StringBuffer'------------------");
        char tarChar = 'a';
        String sb = new StringBuffer(str).reverse().toString();	// Reverse the string
        System.out.println(sb + " ");
     // Find the position of the target character
        int Position = sb.indexOf(tarChar);
        
        if(Position != -1){
            System.out.println("The position of " + tarChar + " is : " + Position);
        }
        else
        {
            System.out.println("The position of " + tarChar + " is : not found in the given string");
        }
        
    }

}
