public class PlotterDriver {

	public static void main(String[] args) {
		Function f1 = new PowerFunction(2.0, 2.1);
		
		FunctionPlotter fup = new FunctionPlotter();
		fup.plotGraph(f1, -10, 10, 500);
	}

}
