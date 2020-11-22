public String missingChar(String str, int n) {
    if(n < 0 || n >= str.length()){
        return str;
    }
    return str.substring(0,n)+str.substring(n+1,str.length());
}
