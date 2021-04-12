package INFO6205;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This is the class used to set Position for people
 */
public class SetPosition extends PositionProvider {
	public Set<Person> people1;
	
	public SetPosition(List<Position> positions) {
		super(positions);
		people1 = new HashSet<>();
	}
}
