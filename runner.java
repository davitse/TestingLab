public class runner {
	public static void main(String[] args) {
		//loopFunction obj = new loopFunction("@", 10);
        
		CoreFunction obj01 = new CoreFunction("@", 10);
		obj01.displayLoop();

		//obj.displayLoop();
		
		String[]arrayTest ={"O","L","L","E","H"};
		arrayFunction objArray = new arrayFunction(arrayTest);
		objArray.displayArray();

	}

}
