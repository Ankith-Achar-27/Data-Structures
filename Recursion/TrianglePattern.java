public class TrianglePattern {
    public static void main(String[] args) {
        trianglePattern1(4,0);
        System.out.println();
        System.out.println();
        trianglePattern2(4,0);
    }
    static void trianglePattern1(int r,int c){
        if(r==0){
            return;
        }
        if(c>=r){
            trianglePattern1(r-1,0);
            System.out.println();
            return;
        }
        trianglePattern1(r,c+1);
        System.out.print('*');
    }
    static void trianglePattern2(int r,int c){
        if(r==0){
            return;
        }
        if(c>=r){
            System.out.println();
            trianglePattern2(r-1,0);
            return;
        }
        System.out.print('*');
        trianglePattern2(r,c+1);
    }
}
