import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class JumpingBug extends Bug
{
	
	 public boolean canMove()
	    {
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return false;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	        if (!gr.isValid(next))
	            return false;
	        Actor neighbor = gr.get(next);
	        return (neighbor == null) || (neighbor instanceof Flower);
	        // ok to move into empty location or onto flower
	        // not ok to move onto any other actor
	    }
	
	public void move()
	{
		Grid<Actor> gr = getGrid();
	    if (gr == null)
	        return;
	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
	    if (gr.isValid(next))
	        moveTo(next);
	    else
	        turn();
	    	//removeSelfFromGrid();
	}
	
}
