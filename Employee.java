public class Employee{
    public static void main(String[] args) {
        private int empid;
        private String ename;
        public Employee(){}
        public Employee(int empid, String ename){
            this.empid=  empid;
            this.ename = ename;
        }
        public String toString(){
            return empid+ " "+ ename;
        }
    }
}