package NoteInterfaceModule;

/**
* NoteInterfaceModule/NoteInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NoteInterface.idl
* samedi 13 novembre 2021 13 h 15 GMT+01:00
*/

public final class NoteInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public NoteInterfaceModule.NoteInterface value = null;

  public NoteInterfaceHolder ()
  {
  }

  public NoteInterfaceHolder (NoteInterfaceModule.NoteInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NoteInterfaceModule.NoteInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NoteInterfaceModule.NoteInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NoteInterfaceModule.NoteInterfaceHelper.type ();
  }

}
