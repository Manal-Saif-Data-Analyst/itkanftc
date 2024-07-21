class HelloWorld {
    static void employeeInfo(Employee e1){
        System.out.println(e1.name + e1.experience);
    }
   
        public static void main(String[] args) {
        //Employee X = new Employee();
         Employee personY = new Employee("Aaliya", 20);
         System.out.println(personY.name);
         System.out.println(personY.experience);
         
       
    }

 }
 
  class Employee{
        String name;
        int experience;
        public Employee(String n, int a){
            name = n;
            experience = a;
        }
  
  }
