
public class Testing {
	

	public static void main(String[] args) {
		
		String password = "1efnejerhherjhvrv";
		boolean bob=false ;
		 for (int i = 0; i < password.length(); i++) {
	      if (password.substring(i,i).contains("he")){
		bob = true;
		}
	      else bob = false;
	      }
	      
	      System.out.println(password.contains("1"));
	      
		
		
		

	}

}
