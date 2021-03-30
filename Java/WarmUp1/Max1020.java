public int max1020(int a, int b) {
    if(in1020(a) && in1020(b)){
      return (a>=b)?a:b;
    }else if(in1020(a)){
      return a;
    }else if(in1020(b)){
      return b;
    }else{
      return 0;
    }
}
private boolean in1020(int n){
    return (10 <= n && n<= 20);
}
