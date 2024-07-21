class HelloWorld {
    static void employeeInfo(Employee e1){
        System.out.println(e1.name + e1.experience);
    }
   
        public static void main(String[] args) {
        Employee X = new Employee();
         X.name = "Aaliya";
         X.experience = 2;
         employeeInfo(X);
       
    }

 }
 
  class Employee{
        String name;
        int experience;
  }
