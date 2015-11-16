package Main;

public class Question_8 {
	
	/*
	 * 8) The class below is a general utility for processing values in an array to gather information
	 * about them (the array is not modified):
	 * 
	 * public class ArrayProcessor
	 * {
	 * 	// Processes values in an array using the given Processor
	 *  public static double runProcessor(double[] arr, Processor p)
	 *  {
	 *   for (int i = 0; i < arr.length; ++i)
	 *   {
	 *    p.process(arr[i]);
	 *   }
	 *   return p.getResult();
	 *  }
	 * }
	 */

	// For Testing
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	/*
	 * a) Suppose you know that Processor is a Java interface. Based on its usage above, write the
	 * definition for the interface (remember that interfaces do not have method bodies).
	 */
	public interface Processor {
		public void process(double input);
		public double getResult();
	}
	
	
	
	/*
	 * b) Create a class MaxProcessor implementing the Processor interface that will return the
	 * maximum value in an array, e.g.:
	 *   Processor maxFinder = new MaxProcessor();
	 *   double max = ArrayProcessor.runProcessor(myData, maxFinder);
	 */
	public class MaxProcessor implements Processor {
		
		// holds our largest double
		private double max;
		
		public MaxProcessor() {
			this.max = Double.MIN_VALUE; // lowest double possible could also use 0
		}

		public void process(double input) {
			if(max < input) {
				max = input;
			}
		}

		public double getResult() {
			return max;
		}
		
	}
	
	
	
	/*
	 * c) Create a class RangeCounter implementing the Processor interface that will count how
	 * many values in the array are in the range [min, max], where min and max are arguments to the
	 * RangeCounter constructor.
	 */
	public class RangeCounter implements Processor {
		
		// holds our min to max range and counter
		private double min, max, count;
		
		public RangeCounter(double min, double max) {
			this.min = min;
			this.max = max;
			this.count = 0;
		}

		public void process(double input) {
			if (input > min && input < max)	{
				count++;
			}
		}

		public double getResult() {
			return count;
		}
		
	}

}
