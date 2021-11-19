import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class Serveur {

    public static void main(String[] args) {
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

        try {
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            NoteImpl note = new NoteImpl();
            byte[] noteObjectByte = rootPOA.activate_object(note);
            rootPOA.the_POAManager().activate();

            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(note));
            System.out.println("L'objet possede la reference suivante :");
            System.out.println(IORServant);
            orb.run();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
