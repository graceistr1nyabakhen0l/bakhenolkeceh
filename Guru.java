//Object Class
public class Guru {
    //variabel
    int NIP;
    private String nama;
    private String mapel;
    private String status;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Construstor Parameter
    public Guru(int i, String n, String m, String g) {
        NIP = i;
        nama = n;
        mapel = m;
        status = g;
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Status : " + status);
    }
}
