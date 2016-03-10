import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;


public class ChameleonCritter extends Critter
{
	
	public void processActors(ArrayList<Actor> actors)
	{
		
		int n = actors.size();

		if(n == 0)
		{
			
			Color c = getColor();
	        int red = (int) (c.getRed() * (1 - .25));
	        int green = (int) (c.getGreen() * (1 - .25));
	        int blue = (int) (c.getBlue() * (1 - .25));
	        
	        Color K = new Color(red, green, blue);

	        setColor(K);
		}
		else
		{
			int r = (int) (Math.random() * n);
			setColor(actors.get(r).getColor());
		}
	}
	
	public void makeMove(Location loc)
	{
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}
}
