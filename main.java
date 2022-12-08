package JAVAbasico5;

public class main {
    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.delete();
        cocheCrud.save();
        cocheCrud.findAll();
    }
}
