public class Main {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5 ; i++) {
            LPAStudent s = new LPAStudent(1 + i ,
                    switch (i){
                case 1 -> "Satyam";
                case 2 -> "Roshan";
                case 3 -> "Mayank";
                case 4 -> "Ranjan";
                case 5 -> "Saumay";
                default -> "Unknown";
                    },
                    "17/7/2003","Java MasterClass");
            System.out.println(s);
        }
        Student pojostudent = new Student(123,"Mac","17/7/2005","java masteerClasss 829");
        LPAStudent LPAstudent = new LPAStudent(123,"REV","17/7/2005","java masteerClasss 829");

        System.out.println(pojostudent);
        System.out.println(LPAstudent);

        pojostudent.setClassList(pojostudent.getClassList() + " Java OCP EXAM 829");
//        LPAstudent.setClassList(LPAstudent.classList() + " Java OCP EXAM 829");
        System.out.println(pojostudent.getName() + " is taking" + pojostudent.getClassList());
        System.out.println(LPAstudent.name() + " is taking" + LPAstudent.classList()); // record dont have get,wagherra

    }
}
