public String startOz(String str) {
    String resultStr = "";
    if(str.length()>=1 && str.substring(0,1).equals("o")){
      resultStr += "o";
    }
    if(str.length()>=2 && str.substring(1,2).equals("z")){
      resultStr += "z";
    }
    return resultStr;
  }
  