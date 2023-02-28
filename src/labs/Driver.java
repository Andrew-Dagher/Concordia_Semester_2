package labs;

public class Driver{
	
	
	public static void main(String[] args) throws ZeroIsThereException, FiveIsThereException {
		
		Multiple Obj1 = new Multiple (new int[]{1,2,5,4},3);
		Multiple Obj2 = new Multiple (new int[]{1,214,40,0},2);
		Multiple Obj3 = new Multiple (new int[]{1,2,3,12,74,56,89,75,0},8);
		
		
		

		//default
		try {
			Obj1.Method_Checker(Obj1.number);
			Obj2.Method_Checker(Obj2.number);
			Obj3.Method_Checker(Obj3.number);
			
		} 
	
		catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
		//parametrized
		try {
			Obj1.Method_Checker(Obj1.number);
			Obj2.Method_Checker(Obj2.number);
			Obj3.Method_Checker(Obj3.number);
			
		} catch (ZeroIsThereException e) {
		
			throw new ZeroIsThereException("this comes from the driver class EXP0");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			Obj1.Method_Checker(Obj1.number);
			Obj2.Method_Checker(Obj2.number);
			Obj3.Method_Checker(Obj3.number);
			
		} catch (FiveIsThereException e) {
		
			throw new FiveIsThereException("this comes from the driver class EXP5");
		}
		 catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
	}

}
