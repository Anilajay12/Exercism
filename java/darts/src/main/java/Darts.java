class Darts {

    private final double distance;

    Darts(double x, double y) {
        distance = Math.sqrt(x * x + y * y);
    }

    int score() {
        if (distance <= 1.0) {
            return 10;
        } else if (distance <= 5.0) {
            return 5;
        } else if (distance <= 10.0) {
            return 1;
        }

        return 0;
    }

}
