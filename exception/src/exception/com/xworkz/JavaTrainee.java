package exception.com.xworkz;

public abstract   class JavaTrainee extends Person implements Xworkz  {
	
	public abstract void training();
	
	void executeProgram()
	{
		
	}

	@Override
	public boolean upLoadTask() {
    System.out.println("task uploaded");
		return false;
	}

	@Override
	public boolean completeTheProgram() {
      System.out.println("program completed");
		return false;
	}
	

}
