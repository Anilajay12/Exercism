class Leap {

    boolean isLeapYear(int year) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return ((year%4==0) && (year%400==0 || year%100!=0))?true:false;
    }

}
