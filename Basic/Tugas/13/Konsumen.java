public class Konsumen implements StrukturKonsumen {
  private String nama, alamat, telepon;
  private char kelamin, status;

  public String rewriteGender(char kode) {
    String kelamin = "-";
    if (kode == 'L') {
      kelamin = "Laki-Laki";
    }
    else if (kode == 'P') {
      kelamin = "Perempuan";
    }
    return kelamin;
  }
}
