import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;



public class QuickCrab extends CrabCritter
{
	public ArrayList<Location> getMoveLocations()
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		int[] dirs = { Location.LEFT, Location.RIGHT };
		
		for(int d : dirs)
		{
			Location neighborLoc = getLocation().getAdjacentLocation(getDirection() + d).getAdjacentLocation(getDirection() + d);
			Location neighbor = getLocation().getAdjacentLocation(getDirection() + d);
			if(getGrid().isValid(neighborLoc) && getGrid().get(neighborLoc) == null && getGrid().get(neighbor) == null && getGrid().isValid(neighbor))
				locs.add(neighborLoc);
		}
		System.out.println(locs);	
		return locs;
	}
}

/*public ArrayList<Location> getLocationsInDirections(int[] directions)
{
ArrayList<Location> locs = new ArrayList<Location>();
Grid gr = getGrid();
Location loc = getLocation();

for(int d : directions)
{
	Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
	if(neighborLoc == null /*&& loc.getAdjacentLocation(getDirection() + d).getAdjacentLocation(getDirection()) == null)
	{
		locs.add(loc.getAdjacentLocation(getDirection() + d)/*.getAdjacentLocation(getDirection()));
		
	}
}	
		
System.out.println(locs);
return locs;
}*/