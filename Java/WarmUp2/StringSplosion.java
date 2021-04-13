public String stringSplosion(String str) {
    String result = "";
    String tempStr = "";
    for(int i = 0;i<str.length();i++){
        tempStr+=str.charAt(i);
        result+=tempStr;
    }
    return result;
}
