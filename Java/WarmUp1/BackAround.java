public String backAround(String str) {
    if(str.length()<=0){return "";}
    String lastCharStr = String.valueOf(str.charAt(str.length()-1));
    return lastCharStr + str + lastCharStr;
}
