import NoteInterfaceModule.NoteInterface;

public class Client {

    public static void main(String[] args) {
        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
            org.omg.CORBA.Object distantNote = orb.string_to_object("IOR:000000000000002a49444c3a4e6f7465496e746572666163654d6f64756c652f4e6f7465496e746572666163653a312e30000000000000010000000000000086000102000000000d3139322e3136382e31322e320000ee7a00000031afabcb00000000201958a6f600000001000000000000000100000008526f6f74504f410000000008000000010000000014000000000000020000000100000020000000000001000100000002050100010001002000010109000000010001010000000026000000020002");

            NoteInterface note = NoteInterfaceModule.NoteInterfaceHelper.narrow(distantNote);
            System.out.println("Note = " + note.getNote((short) 999, "Base de données"));
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
