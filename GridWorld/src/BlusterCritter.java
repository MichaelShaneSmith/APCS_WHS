import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;


public class BlusterCritter extends Critter
{
	private int courage;
	private Color color;
	
	public BlusterCritter(int c)
	{
		courage = c;
		color = new Color(255,255,255);
	}
	
	public ArrayList<Actor> getActors()
    {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		
		ArrayList<Location> locations = new ArrayList<Location>();
        
        for(int x=getLocation().getRow()-2; x<=getLocation().getRow()+2; x++)
        {
        	for(int y=getLocation().getCol()-2; y<=getLocation().getCol()+2; y++)
        	{
        		Location loc = new Location(x,y);
        		//System.out.println(loc);
        		
        		if(getGrid().isValid(loc))
            	{
            		if(loc.getRow() != getLocation().getRow() && loc.getCol() != getLocation().getCol())
            			locations.add(loc);
            	}
        	}
        }
        
        System.out.println(locations);
        
		
		for(Location loca: locations)
		{
			if(getGrid().isValid(loca))
			{
				Actor a = getGrid().get(loca);
				if(a != null)
					actors.add(a);
			}
		}
		
		System.out.println("Courage = "+courage);
        System.out.println("Actors= "+ (actors.size()));
        
        return actors;
		
    }

	
	public void processActors(ArrayList<Actor> actors)
    {
		int n;
		int red;
		int green;
		int blue ;
		
		if(actors.size() >= 0)
		{
			n = actors.size();
		
			if(n >= courage)
			{
				
				System.out.println("Before: "+color.getRed());
				System.out.println("Before: "+color.getGreen());
				System.out.println("Before: "+color.getBlue());
				
				red = (int) (color.getRed()*(.50));
				green = (int) (color.getGreen() *(.50));
				blue = (int) (color.getBlue()*(.50));
				
				System.out.println("After: "+red);
				System.out.println("After: "+green);
				System.out.println("After: "+blue);
				
				if(red == 0)
					red=1;
				if(green == 0)
					green=1;
				if(blue == 0)
					blue=1;
				
				color = new Color(red, green, blue);
				setColor(color);
			}
			else
			{
				System.out.println("Before: "+color.getRed());
				System.out.println("Before: "+color.getGreen());
				System.out.println("Before: "+color.getBlue());
				
				red = (int) (color.getRed()*(1.50));
				green = (int) (color.getGreen()*(1.50));
				blue = (int) (color.getBlue()*(1.50));
				
				System.out.println("After: "+red);
				System.out.println("After: "+green);
				System.out.println("After: "+blue);
				
				if(red > 255)
					red=255;
				if(green > 255)
					green=255;
				if(blue > 255)
					blue=255;
				
				if(red == 1)
					red=2;
				if(green == 1)
					green=2;
				if(blue == 1)
					blue=2;
				
				color = new Color(red, green, blue);
				setColor(color);
					
			}
		
		}
    }
	
}
