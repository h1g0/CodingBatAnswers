public String front3(String str) {
    String result = new String();
    for(int i = 0;i<3;i++){
        if(str.length()<3){
            result += str;
        }else{
            result += str.substring(0,3);
        }
    }
    return result;
}
