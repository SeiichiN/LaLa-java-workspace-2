package matsu;

import java.util.Objects;

public class Hero {
	String name;
	
	public Hero() {}
	
	public Hero(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Hero))
			return false;
		Hero other = (Hero) obj;
		return Objects.equals(name, other.name);
	}
	
}	
