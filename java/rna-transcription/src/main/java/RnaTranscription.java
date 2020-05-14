class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String str="";
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G')
                str=str+"C";
            else if(dnaStrand.charAt(i)=='C')
                str=str+"G";
            else if(dnaStrand.charAt(i)=='T')
                str=str+"A";
            else
                str=str+"U";
        }
        return str;
    }

}
