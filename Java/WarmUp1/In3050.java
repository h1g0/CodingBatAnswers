public boolean in3050(int a, int b) {
    if(in3040(a) && in3040(b)){
        return true;
    }else if(in4050(a) && in4050(b)){
        return true;
    }else{
        return false;
    }
}

private boolean inMinMax(int n,int min, int max){
    if(min <= n && n <= max){
        return true;
    }else{
        return false;
    }
}
private boolean in3040(int n){
    return inMinMax(n,30,40);
}
private boolean in4050(int n){
    return inMinMax(n,40,50);
}
