public int close10(int a, int b) {
  int diffA = Math.abs(10-a);
  int diffB = Math.abs(10-b);
  if(diffA == diffB){
    return 0;
  }else if(diffA < diffB){
    return a;
  }else{
    return b;
  }
}
