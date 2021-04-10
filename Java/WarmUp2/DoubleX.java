boolean doubleX(String str) {
    boolean flg = false;
    for(int i=0;i<str.length();i++){
        if(str.substring(i,i+1).equals("x")){
            if(flg){
                return true;
            }
            flg=true;
        }else{
            if(flg){
                return false;
            }
            flg=false;
        }
    }
    return false;
}
