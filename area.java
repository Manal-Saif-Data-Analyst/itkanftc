class HelloWorld {
   
     public static void main(String[] args) {
         Rectangle rect1 = new Rectangle();
         rect1.getArea();
         System.out.println(rect1.length);
         System.out.println(rect1.width);
         System.out.println(rect1.area);
         Rectangle rect2 = new Rectangle(5, 2);
         System.out.println(rect2.length);
         System.out.println(rect2.width);
         System.out.println(rect2.getArea());
     }
}
 class Rectangle{
    int length;
    int width;
    int area;
     public Rectangle(int l, int w){
            this.length = l;
            this.width = w;
            
     }
     public Rectangle(){
            this.length = 1;
            this.width = 2;
     }

public int getArea(){
 return area = (length * width);
}
}


