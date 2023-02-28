package labs;

public class Multiple{
	
	protected int[] data;
	protected int number;
	
	
	public Multiple(int[] data, int number) {
		this.data = data;
		this.number = number;
	}
	
	public void Method_Checker(int number) throws Exception {
		for (int i = 0 ; i< number;i++) {
			if(this.data[i]==0) {
				throw new ZeroIsThereException();
			}
			if(this.data[i]==5 ) {
				throw new FiveIsThereException();
			}
			System.out.println();
		}
	}

}
