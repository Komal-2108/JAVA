public class ShortestPath {

    public static float getShortestPath(String path){
        int x = 0 , y=0;

        for(int i = 0 ; i<path.length() ; i++){
            char dir = path.charAt(i);
            //North
            if(dir =='N'){
                y++;
            }
            //South
            else if(dir =='S'){
                y--;
            }
            //East 
             else if(dir =='E'){
               x++;
            }
            //West
             else if(dir =='W'){
               x--;
            }

           
        }
         int X2 = x*x ; 
         int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String args[]){
        String path = "NS";
        System.out.println(getShortestPath(path));
    }
    
}
