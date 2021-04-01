public boolean stringE(String str) {
    int cnt = 0;
    for(int i = 0;i<str.length();i++){
      if(str.substring(i,i+1).equals("e")){
        cnt++;
      }
    }
    return (1 <= cnt && cnt <= 3);
}
  