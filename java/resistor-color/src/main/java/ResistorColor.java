class ResistorColor {
    private static String[] resistorColors = new String[10];
    static {
        resistorColors[0] = "black";
        resistorColors[1] = "brown";
        resistorColors[2] = "red";
        resistorColors[3] = "orange";
        resistorColors[4] = "yellow";
        resistorColors[5] = "green";
        resistorColors[6] = "blue";
        resistorColors[7] = "violet";
        resistorColors[8] = "grey";
        resistorColors[9] = "white";
    }

    static int colorCode(String color) {
        for (int i = 0; i < resistorColors.length; i++) {
            if (resistorColors[i] == color) return i;
        }
        throw new IllegalArgumentException();
    }

    String[] colors() {
        return resistorColors;
    }
}
