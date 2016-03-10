import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class ChameleonKid extends Critter
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
			Actor other = actors.get(r);
			setColor(other.getColor());
		}
	}

	public void makeMove(Location loc)
	{
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}
	
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.AHEAD, Location.HALF_CIRCLE};
		for(Location loc: getLocationsInDirections(dirs))
		{
			Actor a = getGrid().get(loc);
			if(a != null)
				actors.add(a);
		}
		
		return actors;
	}
		
	public ArrayList<Location> getLocationsInDirections(int[] directions)
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();
		
		for(int d : directions)
		{
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
			if(gr.isValid(neighborLoc))
				locs.add(neighborLoc);
		}
		
		return locs;
	}
	
}
