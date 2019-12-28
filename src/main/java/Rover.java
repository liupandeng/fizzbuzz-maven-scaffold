import java.util.Arrays;
import java.util.List;

public class Rover {
    private String direction;
    private int x;
    private int y;
    private Area area;
    private List<String> f = Arrays.asList("E", "S", "W", "N");

    public Rover() {
    }

    public Rover(String direction, int x, int y, Area area) {
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.area = area;
    }

    public void land(Area area, int x, int y, String direction) {
        if (x > area.getWeith() || y > area.getHight()) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.area = area;
    }

    public String getPosition() {
        return ("" + x + y + direction);
    }

    public void move() {
        if (direction.equals("E")) {
            if (x == area.getWeith()) {
                throw new IllegalArgumentException("Invalid input");
            }
            x += 1;
        } else if (direction.equals("W")) {
            if (x == 0) {
                throw new IllegalArgumentException("Invalid input");
            }
            x -= 1;
        } else if (direction.equals("N")) {
            if (y == area.getHight()) {
                throw new IllegalArgumentException("Invalid input");
            }
            y += 1;
        } else {
            if (y == 0) {
                throw new IllegalArgumentException("Invalid input");
            }
            y -= 1;
        }
    }

    public void turn(String key) {
        int i = f.indexOf(direction);
        if ("L".equals(key)) {
            i += 5;
        } else {
            i += 1;
        }
        this.direction = f.get(i % 4);
    }

//    public void move() {
//        switch (direction.charAt(0)) {
//            case 'E':
//                if (x == area.getWeith()) {
//                    throw new IllegalArgumentException("Invalid input");
//                }
//                x += 1;
//                break;
//            case 'W':
//                if (x == 0) {
//                    throw new IllegalArgumentException("Invalid input");
//                }
//                x -= 1;
//                break;
//            case 'N':
//                if (y == area.getHight()) {
//                    throw new IllegalArgumentException("Invalid input");
//                }
//                y += 1;
//                break;
//            case 'S':
//                if (y == 0) {
//                    throw new IllegalArgumentException("Invalid input");
//                }
//                y -= 1;
//                break;
//            default:
//                break;
//
//        }

//    }
}

