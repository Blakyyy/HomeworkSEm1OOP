public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alex", "05/06/1990");
        Person p2 = new Person("Clara", "24/09/1992");
        Person p3 = new Person("Jorge", "12/05/2012");
        Person p4 = new Person("Vikcy", "26/09/2017");


        Tree tree1 = new Tree();
        tree1.addLink(p1, p2, Relation.HUSBAND);
        tree1.addLink(p1, p3, Relation.PARENT);
        tree1.addLink(p1, p4, Relation.PARENT);

        tree1.addLink(p4, p3, Relation.SISTER);
        tree1.addLink(p3, p4, Relation.BROTHER);


        Interface ui1 = new Interface();
        ui1.printInfoCHILD("Alex", tree1);
        ui1.printInfoSISTER("Jorge", tree1);

        ui1.SaveRecord(tree1);
        


    }
}
