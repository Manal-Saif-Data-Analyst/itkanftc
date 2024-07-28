class HelloWorld {
   
     public static void main(String[] args) {
         Rectangle rect1 = new Rectangle(5, 2, 3);
         rect1.getVolume();
         System.out.println(rect1.length);
         System.out.println(rect1.width);
         System.out.println(rect1.height);
         System.out.println(rect1.getVolume());
         
     }
}
 class Rectangle{
    int length;
    int width;
    int height; 
    int volume;
     public Rectangle(int l, int w, int h){
            this.length = l;
            this.width = w;
            this.height = h;
            
     }


public int getVolume(){
    return volume = (length * width * height);
}
}


