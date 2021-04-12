package INFO6205;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/** This is the class provide position to multiple people
 *
 */
public abstract class PositionProvider {


    public PositionProvider(List<Position> positions) {
        this.positions = positions;
        people = new HashSet<>();
        checkLockdown = false;
    }

    public Position returnRandomPosition() {
        Random random = new Random();
        return positions.get(random.nextInt(positions.size()));
    }
    public List<Position> positions;
    public Set<Person> people;
    public Boolean checkLockdown;

}
