import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.swing.*;

import static org.fest.assertions.api.Assertions.assertThat;

public class MarsRoverTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldLand() {

        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, "E");
        String position = rover.getPosition();
        assertThat(position).isEqualTo("55E");
    }

    @Test
    public void should_move_forward() {
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area, 5, 5, "E");
        rover.move();
        String position = rover.getPosition();
        assertThat(position).isEqualTo("65E");
    }

    @Test
    public void name() {
        Rover rover = new Rover();
        RoverController roverController = new RoverController();
        String mission = "10,10,5,5,E,F,L,F,R";
        String position = roverController.excute(mission);
        assertThat(position).isEqualTo("66E");
    }

    @Test
    public void shouldWarn(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid input");
        Area area = new Area(10, 10);
        Rover rover = new Rover();
        rover.land(area,20,30,"E");
    }


}
