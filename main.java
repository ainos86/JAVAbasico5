package JAVAbasico5;

public class main {
    CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {

        CocheCRUDImpl.save();
        CocheCRUDImpl.findAll();
        CocheCRUDImpl.delete();

    }
}
