public String endUp(String str) {
    if(str.length() <= 3){
      return str.toUpperCase();
    }
    String str1 = str.substring(0,str.length()-3);
    String str2 = str.substring(str.length()-3,str.length()).toUpperCase();
    return str1+str2;
}
  