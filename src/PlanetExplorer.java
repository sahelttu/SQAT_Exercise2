
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:145
// Finish time:

public class PlanetExplorer {
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	public String executeCommand(String command){
		
		int pos_x = 0;
		int pos_y = 0;
		String facing = "NORTH";
		for (int index = 0; index < command.length();
				index++) {
				     char aChar = command.charAt(index);
				     if (aChar == 'f'){
				    	 if (facing == "NORTH"){
				    		 pos_y ++;
				    	 }else if (facing == "SOUTH"){
				    		 pos_y --;
				    	 }else if  (facing == "WEST"){
				    		 pos_x --;
				    	 }else if (facing == "EAST"){
				    		 pos_x ++;
				    	 }
				     }else if (aChar == 'b'){
				    	 if (facing == "NORTH"){
				    		 pos_y --;
				    	 }else if (facing == "SOUTH"){
				    		 pos_y ++;
				    	 }else if  (facing == "WEST"){
				    		 pos_x ++;
				    	 }else if (facing == "EAST"){
				    		 pos_x --;
				    	 }
				     }
				}
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
}
