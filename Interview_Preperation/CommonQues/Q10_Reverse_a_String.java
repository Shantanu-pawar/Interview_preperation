package Interview_Preperation.CommonQues;

public class Q10_Reverse_a_String {
    public static void main(String[] args) {

// 		System.out.println("GfG!");
		
		String name = "geeksforgeeks";
		String rev = "";
	
		for(int i = 0 ; i < name.length()- 1; i++){
		    rev += name.charAt(i);
		    
		}
		System.out.println(rev + " is the reverse name of " + name);
		
	}
}
