public static boolean hyperPar(int num) {
    int resto;
    if(num=>0){
        while(num!=0){
            num=resto%5;
            num=num/10;
            if(resto%2 !=0){
            retur true;
            }
        }
        return false;
    }
    else {
        return true;
    }
}
