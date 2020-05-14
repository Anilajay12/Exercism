class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int c=(int)Math.log10(numberToCheck)+1;
        int sum=0,temp1=numberToCheck;
        while(numberToCheck!=0){
            sum=sum+(int)Math.pow(numberToCheck%10,c);
            numberToCheck/=10;
        }
        return (sum==temp1)?true:false;
    }

}
