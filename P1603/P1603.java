package P1603;

public class P1603 {
    public static void main(String[] args) {
        ParkingSystem p = new ParkingSystem(1, 1, 0);
        int[] cars = {1,2,3,1};
        for(int c : cars) {
            System.out.println(p.addCar(c));
        }
    }
}

class ParkingSystem {
    private int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;

    }

    public boolean addCar(int carType) {

        switch (carType) {
            case 1: {
                if (this.big - 1 >= 0) {
                    this.big -= 1;
                    return true;
                } else {
                    return false;
                }
            }
            case 2: {
                if (this.medium - 1 >= 0) {
                    this.medium -= 1;
                    return true;
                } else {
                    return false;
                }
            }
            case 3: {
                if (this.small - 1 >= 0) {
                    this.small -= 1;
                    return true;
                } else {
                    return false;
                }
            }
            default:
                return true;
        }
    }
}
