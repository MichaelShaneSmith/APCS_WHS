import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class ZombieCritter extends Critter 
{
	private Color color =  new Color(0,0,0);
	private int strength;
	
	public ZombieCritter()
	{
		setColor(color);
		strength = (int)(Math.random()*10)+1;
	}
	
	public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
        	Location loc = a.getLocation();
        	if (!(a instanceof ZombieCritter) && !(a instanceof Rock) && !(a instanceof SurvivorCritter))
        	{
                a.removeSelfFromGrid();
        	
                Critter zombie = new ZombieCritter();
                Grid<Actor> gr = getGrid();
        	
                zombie.putSelfInGrid(gr, loc);
        	} 
        }
    }
}
