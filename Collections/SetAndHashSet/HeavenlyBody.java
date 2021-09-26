package Collections.SetAndHashSet;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final double orbintalPeriod;
	private final Set<HeavenlyBody> satellites;
	private final BodyTypes bodyType;
	
	public enum BodyTypes {
		STAR, 
		PLANET,
		DWARF_PLANET,
		MOON,
		COMET,
		ASTEROID
	}
		
	public HeavenlyBody(String name, double orbintalPeriod, BodyTypes bodyType) {
		this.name = name;
		this.orbintalPeriod = orbintalPeriod;
		this.satellites = new HashSet<HeavenlyBody>();
		this.bodyType = bodyType;
	}

	public String getName() {
		return name;
	}

	public double getOrbintalPeriod() {
		return orbintalPeriod;
	}
	
	public boolean addSatellite(HeavenlyBody moon) {
		if(moon.getBodyType() == BodyTypes.MOON) {
			return this.satellites.add(moon);
		}
		else {
			return false;
		}
		
	}
	
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<HeavenlyBody>(this.satellites);
	}
	
	@Override
	public final boolean equals( Object obj) {
		if(this == obj) {
			return true;
		}
		
		if( obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			if(this.name.equals(theObject.getName())) {
				return this.bodyType == theObject.getBodyType();
			}
		}
		return false;
	}

	
	 public BodyTypes getBodyType() {
		return bodyType;
	}

	@Override 
	public final int hashCode() { 
		 return this.name.hashCode() + 57 + this.bodyType.hashCode(); //  + 57: that we've got a number a non=zero that's being returned
	}

	@Override
	public String toString() {
		return this.name + ": " + this.bodyType + ", " + this.orbintalPeriod;
	}
	
	
	 
	
	
}
