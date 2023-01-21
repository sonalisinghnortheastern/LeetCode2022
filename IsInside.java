public  static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y){
        double area= area(x1,y1,x2,y2,x3,y3);
        double area1=area(x1,y1,x2,y2,x,y);
        double area2=area(x,y,x2,y2,x3,y3);
        double area3=area(x1,y1,x,y,x3,y3);
        if(area1+area2+area3==area) return true;
        return false;
    }
    private static double area(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)/2.0);
    }
