public class CoreFunction {
	
	private String Core_Symbol;
	private int Core_Count;
	private String[]Core_array;
	
	
	public CoreFunction(String sym,int count,String[]array){
		this.Core_Symbol =sym;
		this.Core_Count =count;
		this.Core_array = array;
	}
	public CoreFunction(String sym,int count){
		this.Core_Symbol =sym;
		this.Core_Count =count;
	}
	public CoreFunction(String[]array){
		this.Core_array = array;
	}
	public  void displayLoop(){
		for(int i =1;i<=Core_Count;i++){
			for(int s =1 ;s<i; s++){
				System.out.print(" ");
			}
			for(int j = Core_Count; j>i; j--){
				System.out.print(Core_Symbol);
			}
			for(int m =Core_Count; m>i;  m--){
			   System.out.print(Core_Symbol);	
			}
			System.out.println(" ");
		}
	}
	public void displayArray(){
		
		   for(int i =Core_array.length-1;i>=0;i--){
			   System.out.print(Core_array[i]);
			  
		   }
		
	}

	
}
