public static boolean hyperPar(int num) {
    int resto;
    if(num=>0){
        while(num!=0){
            num=resto%5;
            num=num/10;
            if(resto%2 !=0){
            return false;
            }
        }
        return true;
    }
    else {
        return false;
    }
}
