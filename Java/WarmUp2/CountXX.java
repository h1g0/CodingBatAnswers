int countXX(String str) {
    boolean flg = false;
    int cnt = 0;
    for(int i=0;i<str.length();i++){
        if(str.substring(i,i+1).equals("x")){
            if(flg){
                cnt++;
            }
            flg=true;
        }else{
            flg=false;
        }
    }
    return cnt;
}
