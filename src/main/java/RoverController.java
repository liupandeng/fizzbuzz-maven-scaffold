public class RoverController {
    public String excute(String mission) {
        String[] missions = mission.split(",");
        Rover rover = new Rover();
        Area area = new Area(Integer.parseInt(missions[0]), Integer.parseInt(missions[1]));
        rover.land(area, Integer.parseInt(missions[2]), Integer.parseInt(missions[3]), missions[4]);
        for (int i = 5; i < missions.length; i++) {
            if (missions[i].equals("F")) {
                rover.move();
            }
            if (missions[i].equals("L") || missions[i].equals("R")) {
                rover.turn(missions[i]);
            }
        }
        return rover.getPosition();
    }
}
