import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class KingCrab extends CrabCritter
{
	public void processActors(ArrayList<Actor> actors)
    {
        //System.out.println(actors);
		for (Actor a : actors)
        {
			int crabDir = getDirection();
			Location loc = a.getLocation().getAdjacentLocation(crabDir);
			if(getGrid().isValid(loc))
            {
            	a.moveTo(loc);
            }
			else 
				a.removeSelfFromGrid();
        }
    }
}
