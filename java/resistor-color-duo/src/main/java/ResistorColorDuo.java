class ResistorColorDuo {
    int value(String[] colors) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
            String resistorColors[]=new String[10];
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
            int k=0;
            for(int i=0;i<2;i++){
                for(int j=0;j<resistorColors.length;j++){
                    if(colors[i].equals(resistorColors[j]))
                        k=k*10+j;
                }
            }
            return k;
    }
}
