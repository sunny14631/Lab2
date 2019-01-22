import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "sunny14631", "217418048017");

	    /* Set an assignment title */
	    bridges.setTitle("Rahul Madala");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    for(int i = 0; i < arr.getSize(); i++) {
	    	arr.getElement(i).setValue((int) Math.pow(i, 2));
		    arr.getElement(i).setLabel(String.valueOf((int) Math.pow(i, 2)));
	    }
	    /* set the value as a Label */
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
