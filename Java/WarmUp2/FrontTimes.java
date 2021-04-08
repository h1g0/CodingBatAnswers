public String frontTimes(String str, int n) {
    String s3 = "";
    if(str.length()<=3){
        s3 = str;
    }else{
        s3 = str.substring(0,3);
    }
    String result = "";
    for(int i=0;i<n;i++){
        result+=s3;
    }
    return result;
}
