package RedBusBooking;



public class BusDetails {

    private int busno;
   private Boolean acbus;
   private  int capacity;
    BusDetails(int busno,boolean ac,int cap)
    {
        this.busno=busno;
        this.capacity=cap;
        this.acbus=ac;
    }
    public int getbusno()
    {
        return busno;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void setCapacity(int cap)
    {
        capacity=cap;
    }
    public void displaybusinfo()
    {
       System.out.println("Bus No:" +busno + "AC: " + acbus + " Capacity :" +capacity);
    }
}
